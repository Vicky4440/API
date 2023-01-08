package API;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample_Delete_Method {
	
	
	
	@Test
	public void testdta() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/6832";
		Response response=
		given()
		.contentType("application/json")
		.when()
		.delete()
		.then()
		.statusCode(200)
		.body("status", equalTo("success"))
		.log().all()
		.extract().response();
		
		String JasonString = response.asString();
		Assert.assertEquals(JasonString .contains("Successfully! Record has been deleted"),true);
	}

}
