package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static  io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ApiSimpleTest {

    @Test
    public void test00(){
        Response response = RestAssured.get("https://api.spacexdata.com/v3/capsules");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }

    @Test
    public void loginWithApi(){
        baseURI = "https://demoqa.com";
        JSONObject request = new JSONObject();
        request.put("userName", "olya");
        request.put("password", "Secret=Sauce9*");

        given()
                .header("Content-Type", "application/json")
                .body(request.toJSONString())
        .when()
                .post("/Account/v1/Login")
        .then()
                .statusCode(200);
    }
}
