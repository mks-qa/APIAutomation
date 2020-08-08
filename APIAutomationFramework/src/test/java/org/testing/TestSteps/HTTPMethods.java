package org.testing.TestSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		
		this.pr=pr;
		
	}
	public Response PostRequest(String bodyData, String uriKey)
	{
		Response res=
		given().contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(uriKey));
		return res;
		
		
	}
	
	public Response GetRequest(String uriKey)
	{
		Response res=
		given().contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		return res;
		
		
	}
}
