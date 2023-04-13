package com.rmg.projecttest;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtils.DatabaseUtility;
import GenericUtils.javautility;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import sdet21.POJO.Class.ProjectLibrary;

public class Addprojecttest extends DatabaseUtility {
@Test
public void addProjectTest() throws Throwable {
	String status ="on going";
	String projectName="SDET_22_"+javautility.getRandomNumber();
	ProjectLibrary prolib=new ProjectLibrary("deepak", projectName, status, 10);
	DatabaseUtility dlib=new DatabaseUtility();
	
	
	//execute API and get the data & verify

	Response resp=given()
			.contentType(ContentType.JSON)
			.body(prolib)
			.when()
			  .post("http://localhost:8084/addProject");
	resp.then()
	          .assertThat().statusCode(201)
	          .log().all();
//connect to db & get the data
	String proname = dlib.executeQueryAndGetData("select * from project",4,projectName );
	String dbstatus = dlib.executeQueryAndGetData("select * from project", 5, status);
	Assert.assertEquals(proname,proname);
	
	
	
	

}
}
