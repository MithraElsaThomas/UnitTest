package com.obsqura;


import org.testng.Assert;
import org.testng.annotations.Test;

import api.Apihelper;
import api.F1Response;
import api.F1request;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MyFirstGETRequest {
	@Test(enabled=false)
	public void test1() {
		//PreRequisites to hit API-Endpoint,Headers
		RestAssured.baseURI="https://reqres.in";//base url
		RequestSpecification httpRequest=RestAssured.given();
		Response response =httpRequest.request(Method.GET,"/api/users/2");//url param or resource url
		String k =response.getBody().asString();
		System.out.println(k);
		int p =response.getStatusCode();
		System.out.println(p);
		Headers headers= response.getHeaders();
		String y =headers.getValue("connection");
		System.out.println(y);


	}
	@Test(enabled=false)
	public void test2() {
		//PreRequisites to hit API-Endpoint,Headers
		RestAssured.baseURI="https://reqres.in";//base url
		RequestSpecification httpRequest=RestAssured.given();
		Response response =httpRequest.request(Method.GET,"/api/users?page=2");//url param or resource url
		String k =response.getBody().asString();
		System.out.println(k);
		int p =response.getStatusCode();
		System.out.println(p);
		Headers headers= response.getHeaders();
		String y =headers.getValue("connection");
		System.out.println(y);


	}
	@Test(enabled=false)
	public void test3() {
		//Response h =Apihelper.hitAPI();
		//System.out.println(h);
	}
	
	@Test(enabled=false)
	public void test4() {
		F1request req =new F1request("https://reqres.in","/api/users/2","GET");
		//Response h =Apihelper.hitAPI(req);
		//String k =h.getBody().asString();
		//System.out.println(k);
	}
	@Test
	public void test5() {
		F1request req =new F1request("https://reqres.in","/api/users/2","GET");
		F1Response h =Apihelper.hitAPI(req);
		String k =h.getResponsebody();
		System.out.println(k);
		int j =h.getResponsecode();
		System.out.println(j);
		Assert.assertEquals(j, 200);
	}
	}
	
	

