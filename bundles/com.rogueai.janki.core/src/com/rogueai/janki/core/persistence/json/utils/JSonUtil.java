package com.rogueai.janki.core.persistence.json.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.rogueai.janki.core.persistence.json.Model;
import com.rogueai.janki.core.persistence.json.Req;

/**
 * TODO: create a better factory for {@link ObjectMapper}
 * 
 * @author matsuleode
 * 
 */
public class JSonUtil {

	/**
	 * Deserialize {@link Model#req} field. The <code>req</code> field should
	 * have EXACTLY this structure:
	 * 
	 * <pre>
	 * [ // JsonArray
	 * 	[0] : ord  (int)
	 * 	[1] : type (String)
	 * 	[2] : flds (int[])
	 * ]
	 * </pre>
	 * 
	 * 
	 * @author matsuleode
	 */
	private static final class ReqDeserializer extends JsonDeserializer<Req> {

		@Override
		public Req deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
			try {

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

	public static final ObjectMapper MAPPER;
	static {
		ReqDeserializer deserializer = new ReqDeserializer();
		SimpleModule module = new SimpleModule("JAnkiModule", new Version(1, 0, 0, "", "", ""));
		module.addDeserializer(Req.class, deserializer);
		// TODO: add serializer for BigDecimal: usually Anki rounds to 2
		// decimals

		MAPPER = new ObjectMapper();
		MAPPER.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		MAPPER.registerModule(module);
	}

	/**
	 * Writes a pretty Json representation of the passed object to System.out
	 * 
	 * @param object
	 */
	public static void printJson(Object object) {
		ObjectWriter writer = MAPPER.writerWithDefaultPrettyPrinter();
		try {
			writer.writeValue(System.out, object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
