package api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Apihelper {
	public  static F1Response hitAPI(F1request req)
	{   Response response =null;
		//RestAssured.baseURI="https://reqres.in";
		RestAssured.baseURI=req.baseurl;
		RequestSpecification httpRequest=RestAssured.given();
		if (req.requesttype.equalsIgnoreCase("GET")) {
	        response =httpRequest.request(Method.GET,req.resourceurl);
		   //Response response =httpRequest.request(Method.GET,"/api/users/2");
		}
		String responsebody =response.getBody().asString();
		int responsecode=response.getStatusCode();
		F1Response ob = new F1Response(responsebody,responsecode);
		return ob;

}
}
