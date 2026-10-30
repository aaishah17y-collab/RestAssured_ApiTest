package test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutRestAssuredRequest3 {
	@Test
	
	public void testPut() {
		
		JSONObject request =  new JSONObject();
		request.put("name", "Aaishah");
		request.put("Job","Teacher");
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/2").
		then().
		statusCode(200)
		.log().all();
		
		

}}
