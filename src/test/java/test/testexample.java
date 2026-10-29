package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class testexample {
	
	

	@Test
	public void test_1() {
	
	
	Response response = get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getBody().asString());
	System.out.println(response.getTime());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	
	int StatusCode = response.getStatusCode();
	Assert.assertEquals(StatusCode, 200);
	
}
	
	@Test

	public void test_2() {
     
	baseURI = "https://reqres.in/api";
	given().
     get("/users?page=2").
     then().
     statusCode(200).
     body("data[3].id",equalTo(10))
     .log().all();
	
		
		
	}


}
