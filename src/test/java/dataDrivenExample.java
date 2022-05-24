import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class dataDrivenExample {
	
	@DataProvider(name="Dataforpost")
	public Object[][] dataforpost(){
		
//		Object[][]data=new Object[2][3];
//		
//		data[0][0]="Riya";
//		data[0][1]="Shah";
//		data[0][2]=5;
//		
//		
//		data[1][0]="Priya";
//		data[1][1]="Bhatt";
//		data[1][2]=6;
//		
//		return data;
		
		
		return new Object[][] {
			
			{"Graham","Bell",5},
			{"Henry","Ford",4}
			
		
	};
	}
	
	//@Test(dataProvider = "Dataforpost")
		public void test_post(String fisrtname,String lastname,int subjectid) {
			
			
			
			JSONObject request=new JSONObject();
			
			request.put("firstname", fisrtname);
			request.put("lastname", lastname);
			request.put("subjectid", subjectid);
			//request.put("id", 5);

			baseURI="http://localhost:3000/";

			given().header("content-Type","application/JSON").
			
			accept(ContentType.JSON).
			
			body(request.toJSONString()).
			
			when().
			
		post("/users").
			
			then().statusCode(201).
			
			log().all();
			}
	@DataProvider(name="datafordelete")
	public Object[] datafordelete() {
		return new Object[] {
				5,6,7,8
		};
	}
	
	@Test(dataProvider ="datafordelete")
	
	public void test_delete(int id) {
		
		baseURI="http://localhost:3000/";
		
		when().delete("/users/"+id).then().statusCode(200).log().all();
		
		
	}
		}


