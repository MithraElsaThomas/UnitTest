package api;

import java.util.Map;

import io.restassured.http.Method;

public class F1request {
	public String resourceurl;
	public String  baseurl ;
	public String  requesttype;
	public Map<String,String> headers;
	public String requestpayload;
	
	public F1request(String baseurl,String resourceurl,String requesttype){
		this.baseurl=baseurl;
		this.resourceurl=resourceurl;
		this.requesttype=requesttype;
		
		
		
		
	}
	

}
