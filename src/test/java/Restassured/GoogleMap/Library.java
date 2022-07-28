package Restassured.GoogleMap;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Library {
	
	@Test
	public void LibraryOperations()
	{
		RestAssured.baseURI="http://216.10.245.166";
		/*String response1=given().header("Content-type","application/json").body(payload.Addbook(isbn,aisle)).
		when().post("/Library/Addbook.php").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = ReusableMethods.rawTojson(response1);
		//System.out.println("+++++++++++++++++" +response);
		System.out.println("Response is "+ js.get("ID"));*/
		
		String s=given().when().get("/Library/GetBook.php?ID=pqrs1234").then().extract().response().asString();
		System.out.println("New Scenario +++++"+ s);
		
	}
	
	
	/*@DataProvider(name="Books")
	public Object[][] Bookdetails()
	{
		return new Object[][] {{"pqrs","1234"},{"xyza","4567"},{"ndrs","8901"}};
		
	}*/

}
