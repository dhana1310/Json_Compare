package main.jsontest;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_SimpleTest {

	private String jsonString;
	private JSONParser jsonParser;

	public void JsonsimpleReadTest(String user_size_1000) throws IOException, ParseException {

		jsonString = IOUtils.toString(this.getClass().getResourceAsStream(user_size_1000));
		jsonParser = new JSONParser();
		
		Instant start = Instant.now();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonString);
		Instant end = Instant.now();
		
		System.out.println("Json.Simple Time = " + Duration.between(start, end).toMillis() + "ms");
		System.out.println("Array Size = " + jsonArray.size());

	}

}
