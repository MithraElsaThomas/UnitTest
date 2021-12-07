package com.obsqura;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONArrayRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JSONParser parser = new JSONParser();

	        try (Reader reader = new FileReader("C:\\Users\\User\\Desktop\\data1.json")) {
	            JSONArray guest =(JSONArray)parser.parse(reader);
	            //System.out.println(guest);
  
	         Object first=  guest.get(0);
	            System.out.println(first);
	            

		     Object second=  guest.get(1);
		            System.out.println(second);
	}catch (Exception e) {
        e.printStackTrace();
    }

}
}