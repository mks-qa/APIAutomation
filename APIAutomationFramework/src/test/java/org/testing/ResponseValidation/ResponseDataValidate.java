package org.testing.ResponseValidation;

import io.restassured.response.Response;

public class ResponseDataValidate {
	
	public static void responseData(Response res, String expectedData, String jsonpath)
	{
		if (res.jsonPath().get(jsonpath).equals(expectedData))
				{		
			System.out.println("Data Matched");
		}
		else
		{
			System.out.println("Data did not matched");
		}
	}

}
