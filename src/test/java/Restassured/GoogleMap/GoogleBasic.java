package Restassured.GoogleMap;

import io.restassured.*;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
//import io.restassured.RestAssured;
//import static org.hamcrest.Matchers.*;
//import org.testng.asserts.*;

import org.testng.annotations.Test;

public class GoogleBasic {

// TODO Auto-generated method stub

	@Test
	public void GoogleMap() {
		// Add place
		RestAssured.baseURI = "http://rahulshettyacademy.com";
		String response = given().log().all().queryParam("Key", "qaclick123").header("Content-type", "application/json")
				.body(payload.AddPlace()).when().post("/maps/api/place/add/json").then().extract().asString();

		JsonPath js = ReusableMethods.rawTojson(response);
		String placeID = js.get("place_id");
		System.out.println("Place id verification" + placeID);

		// Update Address
		String address = "100, Race Course Road";
		response = given().log().all().queryParam("Key", "qaclick123").header("Content-type", "application/json")
				.body(payload.updatePlace(placeID, address)).when().put("/maps/api/place/update/json").then()
				.extract().asString();

		System.out.println("MY RESONSE IS "+response);

		// Get Address
		response = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID)
				.header("Content-type", "application/json").when().get("/maps/api/place/get/json").then().extract()
				.asString();
		js = ReusableMethods.rawTojson(response);
		String actualAddress = js.getString("address");

		if (address.equalsIgnoreCase(actualAddress))
			System.out.println("Actual address and expected address are same");

	}
}
