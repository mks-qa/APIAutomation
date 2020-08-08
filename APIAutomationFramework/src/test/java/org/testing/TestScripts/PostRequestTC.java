package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidate;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JSONFileRead;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostRequestTC {
	@Test
	public static void main(String[] args) throws IOException {
		
		String body=JSONFileRead.bodyDataRead("../APIAutomationFramework/src/test/java/org/testing/PayloadData/body.json");
		Random r=new Random();
		Integer v=r.nextInt();
		body=JsonVariableReplacement.jsonVariable(body, "id", v.toString());
		body=JsonVariableReplacement.jsonVariable(body, "firstname", "Manish");
		Properties pr= PropertiesFileLoad.propertiesFile();
		
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(body, "Test_URI");
		ResponseStatusCodeValidate.responseStatusCode(res, 201);
		ResponseDataValidate.responseData(res, "Manish", "firstname");
		System.out.println("Status Code is "+res.statusCode());
		System.out.println("Body is "+res.asString());
			
		
		
		
	}

}
