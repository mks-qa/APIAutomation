package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.internal.support.FileReader;

public class JSONFileRead {
	
	public static String bodyDataRead(String path) throws FileNotFoundException
	{
		File f=new File(path);
		FileInputStream fr= new FileInputStream(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject bodyData=new JSONObject(js);
		return bodyData.toString();
		
		
	}

}
