package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingDetails {
	
	@JsonProperty
	private String firstname;
	@JsonProperty
	private String lastname;
	@JsonProperty
	private int totalprice;
	@JsonProperty
	private boolean depositpaid;
	@JsonProperty
	private BookingDates bookingdates;
	@JsonProperty
	private String additionalNeeds;
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public int getTotalPrice() {
		return totalprice;
	}
	public void setTotalPrice(int totalprice) {
		this.totalprice = totalprice;
	}
	public boolean getDepositPaid() {
		return depositpaid;
	}
	public void setDepositPaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}
	public BookingDates getBookingDates() {
		return bookingdates;
	}
	public void setBookingDates(BookingDates bookingdates) {
		this.bookingdates = bookingdates;
	}
	public String getAdditionalNeeds() {
		return additionalNeeds;
	}
	public void setAdditionalNeeds(String additionalNeeds) {
		this.additionalNeeds = additionalNeeds;
	}

}
