package API;

import org.testng.annotations.Test;
import static  org.hamcrest.Matchers.*;

import javax.mail.internet.ContentType;

import static io.restassured.RestAssured.*;

public class Api_SAAmple1 {
    @Test
	public void getwetherreport()
	{
    	given()
    	.when()
    	.get("https://dummy.restapiexample.com/api/v1/employees")
    	.then()
		.statusCode(200)
		.header("Content-Type", "application/json");
				
	}
	 
}
