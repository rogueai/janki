package com.rogueai.janki.core.persistence.json;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.LongStringType;
import com.j256.ormlite.support.DatabaseResults;
import com.rogueai.janki.core.persistence.json.utils.JSonUtil;

/**
 * Json fields in Anki are persisted as {@link SqlType#LONG_STRING} (Text).
 * Hbm2Java generatess something like
 * 
 * <pre>
 * @DatabaseField(columnName = "models", canBeNull = false, width = 2000000000)
 * </pre>
 * 
 * 
 * @author matsuleode
 * 
 */
public class JsonPersister extends LongStringType {

	private static final JsonPersister singleTon = new JsonPersister();

	public static LongStringType getSingleton() {
		return singleTon;
	}

	private JsonPersister() {
		super(SqlType.LONG_STRING, new Class<?>[] { String.class });
	}

	@Override
	public Object resultToSqlArg(FieldType fieldType, DatabaseResults results, int columnPos) throws SQLException {
		// ObjectMapper mapper = new ObjectMapper();
		// mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
		// false);
		// String json = mapper.writeValueAsString(new MyBean());
		return super.resultToSqlArg(fieldType, results, columnPos);
	}

	@Override
	public Object sqlArgToJava(FieldType fieldType, Object sqlArg, int columnPos) throws SQLException {
		try {
			String json = (String) sqlArg;
			
			String tableName = fieldType.getTableName();
			if (tableName.equals("col")) {
				String columnName = fieldType.getColumnName();
				if (columnName.equals("models")) {
					Map<String, Model> models = JSonUtil.MAPPER.readValue(json, new TypeReference<Map<String, Model>>() {
					});
					// TODO: ideally we should try to get a List of models,
					// since the "id" is itself used as map key, but it might
					// come handy
					return models;
				}
				if (columnName.equals("conf")) {
					Conf conf = JSonUtil.MAPPER.readValue(json, Conf.class);
					return conf;
				}
				if (columnName.equals("dconf")) {
					Map<String, Dconf> dconf = JSonUtil.MAPPER.readValue(json, new TypeReference<Map<String, Dconf>>() {
					});
					return dconf;
				}
			}

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.sqlArgToJava(fieldType, sqlArg, columnPos);
	}

}
