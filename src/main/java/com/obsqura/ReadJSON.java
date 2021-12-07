package com.obsqura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jayway.jsonpath.JsonPath;

public class ReadJSON {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
         
		 JSONParser parser = new JSONParser();

	        try (Reader reader = new FileReader("C:\\Users\\User\\Desktop\\data.json")) {

	            JSONObject jsonObject = (JSONObject) parser.parse(reader);
	            System.out.println(jsonObject);
	            System.out.println(jsonObject.toJSONString());
	            String json1=jsonObject.toJSONString();
	            JSONObject jsonObject1 = (JSONObject) parser.parse(json1);
	            System.out.println(jsonObject1);
	          
	            String first = (String) jsonObject.get("firstname");
	            System.out.println(first);

	            String middle = (String) jsonObject.get("middlename");
	            System.out.println(middle);
	            
	            String last = (String) jsonObject.get("lastname");
	            System.out.println(last);
	            
	            Long number1 = (Long) jsonObject.get("number");
	            System.out.println(number1);
	           
	            
	           String name1 = JsonPath.read(jsonObject, "$.firstname");
	           System.out.println("variable accesed using json path" +" " +name1);

	            Integer count = JsonPath.read(jsonObject, "$.animal.length()");

	            for (int i = 0; i < count; i++) {
	              String data = JsonPath.read(jsonObject, "$.animal[" + i + "].name");
	              System.out.println(data);
	            }

	            
	            // loop array
	            JSONArray msg1 = (JSONArray) jsonObject.get("details");
	            Iterator<String> iterator = msg1.iterator();
	            while (iterator.hasNext()) {
	                System.out.println(iterator.next());
	            }
	            JSONArray msg2 = (JSONArray) jsonObject.get("companies");
	            Iterator<String> iterator1 = msg2.iterator();
	            while (iterator1.hasNext()) {
	                System.out.println(iterator1.next());
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		 
	    }
	}

