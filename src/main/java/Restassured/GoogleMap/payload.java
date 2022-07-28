package Restassured.GoogleMap;

public class payload {
	
	public static String AddPlace()
	{
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "";
				
	}
	
	public static String updatePlace(String placeID,String address)
	{
		return "{\r\n"
				+ "				\"place_id\":\""+placeID+"\",\r\n"
				+ "				\"address\":\""+address+"\",\r\n"
				+ "				\"key\":\"qaclick123\"\r\n"
				+ "				}";
	}
	
	public static String Addbook(String isbn,String aisle)
	{
		return "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}";
	}
	
	public static String JiraCred()
	{
		return "{\r\n"
				+ " \"username\":\"mr.manishgoyal\", \r\n"
				+ "  \"password\":\"*123Indore\"\r\n"
				+ "}";
	}
	
	public static String CreatIssuPayload()
	{
		return "{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\":{\r\n"
				+ "          \"key\":  \"ALT\"\r\n"
				+ "       },\r\n"
				+ "        \"summary\":  \"Issue 5 for adding comment \",\r\n"
				+ "       \"description\":  \"Creating my second bug \",\r\n"
				+ "       \"issuetype\": {\r\n"
				+ "          \"name\":  \"Bug\"\r\n"
				+ "       },\r\n"
				+ "	\"reporter\": {\r\n"
				+ "            \"name\": \"mr.manishgoyal\"\r\n"
				+ "        }\r\n"
				+ "   }\r\n"
				+ "}";
	}

	public static String CoursePrices()
	
	{ return "{\r\n"
			+ "\r\n"
			+ "\"dashboard\": {\r\n"
			+ "\r\n"
			+ "\"purchaseAmount\": 910,\r\n"
			+ "\r\n"
			+ "\"website\": \"rahulshettyacademy.com\"\r\n"
			+ "\r\n"
			+ "},\r\n"
			+ "\r\n"
			+ "\"courses\": [\r\n"
			+ "\r\n"
			+ "{\r\n"
			+ "\r\n"
			+ "\"title\": \"Selenium Python\",\r\n"
			+ "\r\n"
			+ "\"price\": 50,\r\n"
			+ "\r\n"
			+ "\"copies\": 6\r\n"
			+ "\r\n"
			+ "},\r\n"
			+ "\r\n"
			+ "{\r\n"
			+ "\r\n"
			+ "\"title\": \"Cypress\",\r\n"
			+ "\r\n"
			+ "\"price\": 40,\r\n"
			+ "\r\n"
			+ "\"copies\": 4\r\n"
			+ "\r\n"
			+ "},\r\n"
			+ "\r\n"
			+ "{\r\n"
			+ "\r\n"
			+ "\"title\": \"RPA\",\r\n"
			+ "\r\n"
			+ "\"price\": 45,\r\n"
			+ "\r\n"
			+ "\"copies\": 10\r\n"
			+ "\r\n"
			+ "}\r\n"
			+ "\r\n"
			+ "]\r\n"
			+ "\r\n"
			+ "}"
		;
		
	}
}
