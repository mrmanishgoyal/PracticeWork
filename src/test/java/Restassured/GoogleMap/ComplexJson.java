package Restassured.GoogleMap;

import java.nio.file.Files;

import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js=ReusableMethods.rawTojson(payload.CoursePrices());
		
		
		// 1. Print No of courses returned by API
		System.out.println("Number of courses returned by API : " +js.getString("courses.size()"));
		
		// 2.Print Purchase Amount
		int purchaseAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount is returned by API :" +js.getString("dashboard.purchaseAmount").toString());
		
		// 3. Print Title of the first +
		
		System.out.println("Title of the first course is : " +js.getString("courses[0].title"));
		

		//4. Print All course titles and their respective Prices
		for (int i=0;i<js.getInt("courses.size()");i++)
		{	
			System.out.print("Title & Price of the course is : " +js.getString("courses["+i+"].title"));
			System.out.println(" " +js.getDouble("courses["+i+"].price"));
		}
		
		//5. Print no of copies sold by RPA Course
		
		System.out.println("Number of copies sold by RPA course is :" +js.getInt("courses[2].copies"));
		
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		
		int sum=0;
		for(int j=0;j<js.getInt("courses.size()");j++)
		{
			int courseprice=js.getInt(("courses["+j+"].price"))*js.getInt("courses["+j+"].copies");
			sum=sum+courseprice;
			
		}
		System.out.println(""+purchaseAmount+ " : "+sum);
		
		if(purchaseAmount==sum)
			System.out.println("Sum of all Course prices matches with Purchase Amount");
		
		//new String(Files.readAllBytes(Path.get(""))

}
}
