package com.obsqura;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jayway.jsonpath.JsonPath;

public class JSONProcessor {
	private static  String datapath="C:\\Users\\User\\Desktop\\data.json";
	public static void main(String[] args) {
		 JSONObject test =readFromFile(datapath);
		 System.out.println("File to Object"+" "+test);
		 String z = ObjecttoString( test);
		 System.out.println("Object to String"+" "+ z);
		 JSONObject k = StringtoObject(z);
		 System.out.println("String to Object"+" "+ z);
		 JSONObject m =  getdatajson(datapath,"animal");
		 System.out.println("JSON object within json object"+" "+ m);
		 
		 int p= arrayCount(datapath,"$.animal.length()");
		 System.out.println(p);
		 for (int i = 0; i < p; i++) {
         	
           String data = JsonPath.read(test, "$.animal[" + i + "].name");
           System.out.println(data);
         }
		 String value= individualValue(datapath,"$.firstname");
		 System.out.println("individual values are "+value);
				 
		 }
		// TODO Auto-generated method stub
	
	public static String  ObjecttoString(JSONObject x ) {
		String k = x.toString();
		return k;
		
		
	}
	
	public static JSONObject  StringtoObject(String z ) {
		  
		 JSONParser parser2 = new JSONParser();
		JSONObject m=null;
		try {
			m = (JSONObject) parser2.parse(z);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
		
	}
	
	
		public static JSONObject readFromFile(String path)
		{
			 JSONParser parser1 = new JSONParser();
			 JSONObject jsonObject=null;
		        try {  Reader reader = new FileReader(path) ;
	             jsonObject = (JSONObject) parser1.parse(reader);
	             
	            
		        	
		        } catch(Exception e) {
		        	e.printStackTrace();
		        }
		       
			     return jsonObject;
	
	    }
		public static String individualValue(String path ,String attribute) {
			
		JSONObject obj=	JSONProcessor.readFromFile(path);
			String name1 = JsonPath.read(obj, attribute);
	           System.out.println("variable accesed using json path" +" " +name1);
	           return name1;
		}     
	   public static int arrayCount(String path,String countmax) {
		   JSONObject obj=	JSONProcessor.readFromFile(path);
		   Integer count = JsonPath.read(obj, countmax);
		   return count;
	   }
	   public static JSONObject  getdatajson(String path,String key) {
		   JSONObject obj=	JSONProcessor.readFromFile(path);
		   if(obj.containsKey(key)) {
			   Object simpleobject=obj.get(key);
			   System.out.println("JSON object in object"+" "+ simpleobject);
			   
				   return (JSONObject)simpleobject;
				   
			   }
		  
		   return null;
	   }
		   
	   }
	        
	  
			  
			
			
		
	




