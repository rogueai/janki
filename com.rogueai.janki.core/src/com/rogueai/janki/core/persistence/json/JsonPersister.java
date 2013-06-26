package com.rogueai.janki.core.persistence.entity;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.LongStringType;
import com.j256.ormlite.support.DatabaseResults;

/**
 * 
 * @author matsuleode
 *
 */
public class JsonPersister extends LongStringType {

	private static final class ReqDeserializer extends JsonDeserializer<Req> {

		@Override
		public Req deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
			try {
				// this should have EXACTLY 3 elements:
				// [0] : ord
				// [1] : type
				// [2] : int[]
				ObjectCodec oc = parser.getCodec();
				JsonNode node = oc.readTree(parser);
				Req req = new Req();
				req.setOrd(node.get(0).asInt());
				req.setType(node.get(1).asText());
				ArrayNode fldsArray = (ArrayNode) node.get(2);
				Iterator<JsonNode> fldsIt = fldsArray.iterator();
				List<Integer> flds = new ArrayList<Integer>();
				while (fldsIt.hasNext()) {
					JsonNode jsonNode = (JsonNode) fldsIt.next();
					flds.add(jsonNode.asInt());
				}
				return req;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

	}

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
			ObjectMapper mapper = new ObjectMapper();
			// mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
			// true);
			ReqDeserializer deserializer = new ReqDeserializer();
			SimpleModule module = new SimpleModule("JAnkiDeserializer", new Version(1, 0, 0, "", "", ""));

			module.addDeserializer(Req.class, deserializer);
			// module.addDeserializer(Model.class, new ModelDeserializer());

			mapper.registerModule(module);

			Map<String, Model> models = mapper.readValue(json, new TypeReference<Map<String, Model>>() {
			});
			
			return models;

			// TODO: @matsu HACK we should use a proper deserializer here
			// List<Model> models = new ArrayList<Model>();
			// for (Entry<String, Model> entry : modelsMap.entrySet()) {
			// Model model = entry.getValue();
			// model.setId(Long.valueOf(entry.getKey()));
			// models.add(model);
			// }
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
