package API;

import java.util.HashMap;
import static  org.hamcrest.Matchers.*;

import javax.mail.internet.ContentType;

import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Sample_Put_Method {
   public static HashMap map =new HashMap();
	 String empname=Rest_Utils.randaomname();
	 String empsalary=Rest_Utils.salary();
	 String empage=Rest_Utils.age();
	 
	 int emp_id=8291;
	@BeforeClass
	public void postdata() {
		map.put("name", empname);
		map.put("salary", empsalary);
		map.put("age",empage);
			
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+emp_id;
	}
	@Test
	public void testdata() {
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		.put()
		.then()
		.statusCode(200)
		.body("status", equalTo("success"))
	//	.body("message",equalTo( " Successfully! Record has been updated."));
		.log().all();
		
		
	}
}
