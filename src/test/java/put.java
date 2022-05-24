import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class put {
	
@Test	
public void put_test() {	
	
JSONObject request=new JSONObject();
	
	request.put("name", "Riddhi");
	request.put("job", "QA");
	
	System.out.println(request.toJSONString());
	System.out.println(request);
	
	

	given().header("content-Type","application/JSON").
	
	
	accept(ContentType.JSON).
	
	
	body(request.toJSONString()).
	
	when().
	
	put("https://reqres.in/api/users/2"). 
	//patch("https://reqres.in/api/users/2").
	then().statusCode(200 ).
	
	log().all();
	

}
}
