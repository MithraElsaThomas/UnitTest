package com.obsqura;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.ApiHelper;
import api.F1Request;
import api.F1Response;

public class CreateMultipleUser {
	 @Test (dataProvider = "data-provider")
	
	public void test1( String a,String b) {
		HashMap<String,String>apidata= new HashMap<String,String>();
		apidata.put("name", a);
		apidata.put("job", b);
	    F1Request req = new F1Request("https://reqres.in","Create.json",apidata);
	    F1Response h =ApiHelper.hitAPI(req);
		String k =h.getResponsebody();
		System.out.println(k);
		int j =h.getResponsecode();
		System.out.println(j);
		Assert.assertEquals(j, 201);
	}
    @DataProvider (name = "data-provider")

	public  Object[][] dp(){
		
		return  new Object[][] {{"mithra","engineer"}, {"elsa","doctor"}};
	}

}
