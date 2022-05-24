import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class examples {
	
	
	
	//@Test
	public void test_get() {
		
		
		baseURI="http://localhost:3000/";
		
		given().param("name", "Devops").
		
		get("/users").then().statusCode(200)
		.log().all();
		
		}
	
	//@Test
	public void test_post() {
		
		//baseURI="http://localhost:3000/";
		
		JSONObject request=new JSONObject();
		
		request.put("firstname", "Nayanaben");
		request.put("lastname", "Dave");
		request.put("subjectid", 1);
		request.put("id", 5);
		
		//System.out.println(request.toJSONString());
		//System.out.println(request);
		
		baseURI="http://localhost:3000/";

		given().header("content-Type","application/JSON").
		
		
		accept(ContentType.JSON).
		
		
		body(request.toJSONString()).
		
		when().
		
	post("/users").
		
		then().statusCode(201).
		
		log().all();
		}
	//@Test
		public void test_patch() {
			
			//baseURI="http://localhost:3000/";
			
			JSONObject request=new JSONObject();
			
			request.put("firstname", "Nitinbhai");
			
			//System.out.println(request.toJSONString());
			//System.out.println(request);
			
			baseURI="http://localhost:3000/";

			given().header("content-Type","application/JSON").
			
			
			accept(ContentType.JSON).
			
			
			body(request.toJSONString()).
			
			when().
			
		patch("/users/5").
			
			then().statusCode(200).
			
			log().all();
			}
		//@Test
		public void test_put() {
			
			//baseURI="http://localhost:3000/";
			
			JSONObject request=new JSONObject();
			
			request.put("firstname", "Albert");
			request.put("lastname","Einstine");
			request.put("subjectid",3);
			request.put("id", 6);
			
			//System.out.println(request.toJSONString());
			//System.out.println(request);
			
			baseURI="http://localhost:3000/";

			given().header("content-Type","application/JSON").
			
			
			accept(ContentType.JSON).
			
			
			body(request.toJSONString()).
			
			when().
			
		patch("/users/5").
			
			then().statusCode(200).
			
			log().all();
			}
		
		
	@Test
	
	public void test_delete() {
		
		baseURI="http://localhost:3000/";
		
		when().delete("/users/5").then().statusCode(200).log().all();
		
		
	}
		

	
	
}
