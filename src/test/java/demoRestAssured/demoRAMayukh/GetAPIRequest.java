package demoRestAssured.demoRAMayukh;

import org.testng.annotations.Test;

import POJO.createEmp;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import Utils.BaseTest;
import Utils.Utilities;

public class GetAPIRequest extends BaseTest {
	

	@Test
	public void getAllEmployee() {
		
		given()
			.queryParam("page", "2")
			.spec(requestSpec)
			
		.when()
			.get()
		
		.then()
			.statusCode(200)
			.assertThat().body("data[0].id",equalTo(7))
			.assertThat().body("data[0].first_name", equalTo("Michael"));
			//.log().all();
	}
	
	@Test
	public void postNewEmployee() {
		
		createEmp emp = new createEmp();
		emp.setName("Mayukh");
		emp.setJob("QA Engineer");
		System.out.println(emp.getName());
		given()
			.spec(requestSpec)
			.body(emp)
		.when()
			.post()
		.then()
			.statusCode(201)
			.log().all();
	}
}