package main.jsontest;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import main.model.User;

@Data
public class JacksonTest {

	private String jsonString;
	private ObjectMapper objectMapper;
	
	public void jacksonReadTest(String user_size_1000) throws IOException {
		
		jsonString = IOUtils.toString(this.getClass().getResourceAsStream(user_size_1000));
		objectMapper = new ObjectMapper();
		
		Instant start = Instant.now();
		User[] users = objectMapper.readValue(jsonString, User[].class);
		Instant end = Instant.now();
		
		System.out.println("Jackson time = " + Duration.between(start, end).toMillis() + "ms");
		System.out.println("Array Size = " + users.length);
		
	}
}
