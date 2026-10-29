package test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response.*;


public class GetRestAssuredRequests1 {
	
	@BeforeTest
	public static void setup() {
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
		
	}

	@Test
	
	public void getRequest() {
		Response response = 
				given().contentType(ContentType.JSON)
				.when()
				.get("/posts")
				.then()
				.extract().response();
		
		
    }
		
	}



	
	
	

