package org.testing.Runner;

import java.io.IOException;

import org.testing.TestScripts.GetRequestTC;

public class RunnerClass {
	
	public static void main(String[] args) throws IOException {
		
		GetRequestTC get=new GetRequestTC();
		get.TC2();
	}

}
