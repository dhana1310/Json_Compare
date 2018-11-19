package main.jsontest;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import lombok.Data;
import main.model.User;

@Data
public class GsonTest {

	private String jsonString;
	private Gson gson;
	
	public void gsonReadTest(String user_size_1000) throws IOException {
		
		jsonString = IOUtils.toString(this.getClass().getResourceAsStream(user_size_1000));
		gson = new Gson();
		
		Instant start = Instant.now();
		User[] users = gson.fromJson(jsonString, User[].class);
		Instant end = Instant.now();
		
		System.out.println("Gson Time = " + Duration.between(start, end).toMillis() + "ms");
		System.out.println("Array Size = " + users.length);
		
	}
}
