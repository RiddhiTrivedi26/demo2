import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class deleteRequest {
	
	
	@Test
	public void deleterequest() {
	
	
JSONObject request=new JSONObject();
	
	request.put("name", "Riddhi");
	request.put("job", "QA");
	
	System.out.println(request.toJSONString());
	System.out.println(request);
	
	

	
	
	when().
	delete("https://reqres.in/api/users/2"). 
	//patch("https://reqres.in/api/users/2").
	then().statusCode(204).
	
	log().all();

}
}
