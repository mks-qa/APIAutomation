package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidate;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetRequestTC {
	
	@Test
	public void TC2() throws IOException
	{
		Properties pr= PropertiesFileLoad.propertiesFile(); 
		HTTPMethods http=new HTTPMethods(pr);
		Response res= http.GetRequest("Test_URI");
		ResponseStatusCodeValidate.responseStatusCode(res, 200);
		ResponseDataValidate.responseData(res, "Manish", "[2].firstname");
		System.out.println("Body is "+res.asString());
	}

}
