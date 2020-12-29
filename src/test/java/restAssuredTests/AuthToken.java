package restAssuredTests;

import Utils.BaseTest;
import Utils.Utilities;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class AuthToken extends BaseTest {
	
	public static String GetAuthToken() {
		String token;
		String username = Utilities.readConfigurationFile("username");
		String password = Utilities.readConfigurationFile("password");
		HashMap<String,String> auth = new HashMap<String,String>();
		auth.put("username", username);
		auth.put("password", password);
		Response resp = given().contentType("application/json").body(auth).spec(requestSpec).when().post("/auth");
		token = resp.then().extract().path("").toString();
		System.out.println(token);
		return token;
	}
}
