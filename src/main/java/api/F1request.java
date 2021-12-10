package api;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jayway.jsonpath.JsonPath;
import com.obsqura.JSONProcessor;

import io.restassured.http.Method;

public class F1Request {
	public String resourceurl;
	public String  baseurl ;
	public String  requesttype;
	public Map<String,String> headers;
	public JSONObject requestpayload;
	
	public F1Request(String baseurl,String resourceurl,String requesttype){
		this.baseurl=baseurl;
		this.resourceurl=resourceurl;
		this.requesttype=requesttype;
		
		
		
		
	}

	/*public F1Request(String baseurl,String resourceurl,String requesttype, String requestpayload,
			HashMap<String, String> header) {
		this.baseurl=baseurl;
		this.resourceurl=resourceurl;
		this.requesttype=requesttype;
		this.requestpayload=requestpayload;
		this.headers=header;
		
		
	}*/
	
	

	public F1Request(String baseurl,String datapath) {
		datapath = System.getProperty("user.dir")+ "\\APIFiles\\"+datapath;
				
		JSONObject input =JSONProcessor.readFromFile( datapath);
		 String resourceurl= JSONProcessor.individualValue(datapath,"$.resourceurl");
		 String  requesttype=JSONProcessor.individualValue(datapath,"$.type");
		 JSONObject requestpayload=JSONProcessor. getdatajson(datapath,"requestbody");
		 
		 System.out.println("request body"+requestpayload);
		 this.baseurl=baseurl;
		 this.resourceurl=resourceurl;
		 this.requesttype=requesttype;
		 this.requestpayload=requestpayload;
		// TODO Auto-generated constructor stub
	}

	public F1Request(String baseurl, String datapath, HashMap<String, String> apidata) {
		datapath = System.getProperty("user.dir")+ "\\APIFiles\\"+datapath;
		
		JSONObject input =JSONProcessor.readFromFile( datapath);
		 String resourceurl= JSONProcessor.individualValue(datapath,"$.resourceurl");
		 String  requesttype=JSONProcessor.individualValue(datapath,"$.type");
		 JSONObject requestpayload=JSONProcessor. getdatajson(datapath,"requestbody");
		 if (!apidata.isEmpty()) {
			 for (Map.Entry<String,String> entry : apidata.entrySet()) //using map.entrySet() for iteration  
			 {  requestpayload.put(entry.getKey(), entry.getValue());
			 //returns keys and values respectively  
			 System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
			 }   
			 
		 }
		
		 System.out.println("request body"+requestpayload);
		 this.baseurl=baseurl;
		 this.resourceurl=resourceurl;
		 this.requesttype=requesttype;
		 this.requestpayload=requestpayload;
		
		// TODO Auto-generated constructor stub
	}
	

}
