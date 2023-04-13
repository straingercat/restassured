package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;





public class SampleProjectTest {
	@Test
	public void getALLProjectTest() {
		Response respo = RestAssured.get("http://localhost:8084/projects");
		System.out.println(respo.asString());
		respo.prettyPrint();
		respo.then().log().all();
		
		
	}

}
