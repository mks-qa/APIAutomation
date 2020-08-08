package org.testing.ResponseValidation;

import io.restassured.response.Response;

public class ResponseStatusCodeValidate {

	public static void responseStatusCode(Response res, int expectedStatusCode)
	{
		if(res.getStatusCode()==expectedStatusCode)
		{
			System.out.println("Status Code Matched");
		}
		else
		{
			System.out.println("Status Code not matched");
		}
	}
}
