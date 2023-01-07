package API;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static  org.hamcrest.Matchers.*;

import javax.mail.internet.ContentType;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class Sample_Post_Method {
	public static HashMap map=new HashMap();
	@BeforeClass
	public void postdata() {
		map.put("name",Rest_Utils.randaomname());
		map.put("salary", "a23");
		map.put("age", Rest_Utils.age());
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/create";
	
	}
	@Test
	public void TestData() {
		given()
		.contentType("application/json")
	    .body(map)
	    .when()
		.post()
		.then()
		.statusCode(200)
		.body("message",equalTo ("Successfully! Record has been added."))
		.body("status",equalTo ("success"));

		
		
		
	}

}
