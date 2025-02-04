package activities;

import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1Test {
  @Test(priority = 1)
  public void postRequest() {
	  Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", 77232);
		reqBody.put("name", "Riley");
		reqBody.put("status", "alive");

		Response response = 
		given().
			baseUri("https://petstore.swagger.io/v2/pet"). // Set base URI
			header("Content-Type", "application/json"). // Set headers
			body(reqBody). // Add request body
		when().
			post(); // Send POST request

		// Assertion
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	   }
  @Test(priority = 2)
  public void getRequest() {
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/pet") // Set base URI
			.header("Content-Type", "application/json") // Set headers
			.when().pathParam("petId", 77232) // Set path parameter
			.get("/{petId}"); // Send GET request

		// Assertion
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}

	@Test(priority = 3)
	public void deleteRequest() {
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/pet") // Set base URI
			.header("Content-Type", "application/json") // Set headers
			.when().pathParam("petId", 77232) // Set path parameter
			.delete("/{petId}"); // Send DELETE request

		// Assertion
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("77232"));
	}

}
