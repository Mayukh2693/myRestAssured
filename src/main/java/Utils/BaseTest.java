package Utils;

import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {

	protected static RequestSpecification requestSpec;
	protected static ResponseSpecification responseSpec;
	
	@BeforeSuite
	public void setBaseURI() {
		requestSpec = new RequestSpecBuilder().
                		setBaseUri(Utilities.readConfigurationFile("endpoint")).
                		build();
        
	}
}
