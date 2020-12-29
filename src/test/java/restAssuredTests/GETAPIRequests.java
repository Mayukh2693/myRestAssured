package restAssuredTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import Utils.BaseTest;
import Utils.Utilities;
import io.restassured.response.Response;

public class GETAPIRequests extends BaseTest {
	

	@Test
	public void getAllBookings() {
		Response resp =  
		given().spec(requestSpec)
		.when().get("/booking");
		resp.then()
			.statusCode(200);
		String ID = resp.then()
			.extract().path("bookingid").toString();
		System.out.println(ID);
	}
	
	@Test
	public void getOneBooking() {
		HashMap<String,Object> map = new HashMap<String,Object>();
		Response resp =  
		given().spec(requestSpec).pathParam("id", 1)
		.when().get("/booking/{id}");
		resp.then()
			.statusCode(200)
			.assertThat().body("firstname", notNullValue())
			.assertThat().body("lastname", notNullValue())
			.log().all();
		map = resp.then().extract().path("");
		Assert.assertEquals(map.get("bookingdates").toString().contains("checkin"), true);
	}
}