package restAssuredTests;

import org.testng.annotations.Test;

import POJO.BookingDates;
import POJO.BookingDetails;
import Utils.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import junit.framework.Assert;

public class POSTAPIRequests extends BaseTest {

	@Test
	public void createBooking() {
		BookingDetails bookingdetails = new BookingDetails();
		bookingdetails.setFirstName("Mayukh");
		bookingdetails.setLastName("Nath");
		bookingdetails.setTotalPrice(200);
		bookingdetails.setDepositPaid(true);
		bookingdetails.setAdditionalNeeds("room service");
		BookingDates bookingdates = new BookingDates();
		bookingdates.setCheckin("2020-01-01");
		bookingdates.setCheckout("2020-01-02");
		bookingdetails.setBookingDates(bookingdates);
		Response resp =  given().contentType("application/json").accept("application/json").spec(requestSpec).body(bookingdetails)
						.when().post("/booking");
		String response = resp.then().extract().path("").toString();
		System.out.println(response);
		Assert.assertEquals(resp.then().extract().path("booking.firstname").toString(), bookingdetails.getFirstName()); 
			
	}
}
