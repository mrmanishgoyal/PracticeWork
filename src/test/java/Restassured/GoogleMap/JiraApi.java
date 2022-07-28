package Restassured.GoogleMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class JiraApi {
	
	@Test
	public void JiraOperations()
	{
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter session = new SessionFilter();
		
		// Login API to get the session id
		given().header("Content-type","application/json").
				body(payload.JiraCred()).filter(session).
				when().post("/rest/auth/1/session").
				then().log().all();	
		
		System.out.println("This text is for git hub");
		
		//String cookie=js.getString("session.name").concat("=").concat(js.getString("session.value"));
		//	System.out.println("My jssion "+cookie);
		
		// Scenario : Running API to get all the projects
		String project=given().filter(session).//header("cookie",cookie).
		when().get("rest/api/2/project").
		then().extract().response().asString();
		System.out.println(project);
		
		//Hitting API to Create new issue
		String response2=given().filter(session).header("Content-type","application/json").//header("cookie",cookie).
		body(payload.CreatIssuPayload()).
		when().post("rest/api/2/issue").
		then().log().all().extract().response().asString();
		JsonPath js = new JsonPath(response2);
		String ID=js.getString("id");
		String key=js.getString("key");
		System.out.println(ID);
		System.out.println(key);
		
		//Retrieving an existing issue
		System.out.println(given().pathParam("key",key).filter(session).
		when().get("/rest/api/2/issue/{key}").then().extract().response().asString());
		//System.out.println("Response 2>>>>>>>>>>>>>> is "+response2);
		
		// Deleting an existing issue
				/*String delete=given().pathParam("key","ALT-9").
				filter(session).
				when().delete("/rest/api/2/issue/{key}").
				then().log().all().assertThat().statusCode(204).extract().response().asString();
				System.out.println("Delete Resonse is "+delete);*/
		//Adding a comment to existing issue
			String commentID=given().pathParam("key","ALT-1").filter(session).header("Content-type","application/json").
					body("{\r\n"
							+ "    \"body\": \"Adding second new comment\",\r\n"
							+ "    \"visibility\": {\r\n"
							+ "        \"type\": \"role\",\r\n"
							+ "        \"value\": \"Administrators\"\r\n"
							+ "    }\r\n"
							+ "}").
			when().post("/rest/api/2/issue/{key}/comment").
			then().assertThat().statusCode(201).extract().response().asString();
			System.out.println(commentID);
	}

}
