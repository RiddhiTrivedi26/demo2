import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postRequest {

	
	
@Test
public void put_req() {
	
	
	JSONObject request=new JSONObject();
	
	request.put("name", "Riddhi");
	request.put("job", "QA");
	
	System.out.println(request.toJSONString());
	System.out.println(request);
	
	

	given().header("content-Type","application/JSON").
	
	
	accept(ContentType.JSON).
	
	
	body(request.toJSONString()).
	
	when().
	
	post("https://reqres.in/api/users/2").
	
	then().statusCode(201);
	
	
}
	
	
	
	
}
