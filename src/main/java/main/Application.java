package main;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import main.jsontest.GsonTest;
import main.jsontest.JacksonTest;
import main.jsontest.Json_SimpleTest;

public class Application {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		String user_size_3KB = "/json/user_size_3KB.json";
		String user_size_275KB = "/json/user_size_275KB.json";
		String user_size_70MB = "/json/user_size_70MB.json";
		
		System.out.println("Json file with size 3KB");
		GsonTest gsonTest3 =  new GsonTest();
		gsonTest3.gsonReadTest(user_size_3KB);
		JacksonTest jacksonTest3 = new JacksonTest();
		jacksonTest3.jacksonReadTest(user_size_3KB);
		Json_SimpleTest json_SimpleTest3 = new Json_SimpleTest();
		json_SimpleTest3.JsonsimpleReadTest(user_size_3KB);
		
		System.out.println();
		System.out.println("Json file with size 275KB");
		GsonTest gsonTest2 =  new GsonTest();
		gsonTest2.gsonReadTest(user_size_275KB);
		JacksonTest jacksonTest2 = new JacksonTest();
		jacksonTest2.jacksonReadTest(user_size_275KB);
		Json_SimpleTest json_SimpleTest2 = new Json_SimpleTest();
		json_SimpleTest2.JsonsimpleReadTest(user_size_275KB);
		
		System.out.println();
		System.out.println("Json file with size 70MB");
		GsonTest gsonTest =  new GsonTest();
		gsonTest.gsonReadTest(user_size_70MB);
		JacksonTest jacksonTest = new JacksonTest();
		jacksonTest.jacksonReadTest(user_size_70MB);
		Json_SimpleTest json_SimpleTest = new Json_SimpleTest();
		json_SimpleTest.JsonsimpleReadTest(user_size_70MB);
		
	}

}
