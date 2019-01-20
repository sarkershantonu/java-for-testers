package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;

import java.net.URLEncoder;

import static io.restassured.RestAssured.*;

/**
 * Created by SSarker on 11/3/2018.
 */
public class App {

    public static String APP_URL="https://www.foodkick.com";
    public static String API_VERSION="/mobileapi/v/1";
    public static String APP_PATH="/username/login/";
    public static String username="loginuser@freshdirect.com";
    public static String pass="testing";
    public static void main(String[] args) {
        String bodyMessage = "data={\"username\":\""+username+"\",\"password\":\""+pass+"\"}";
        String encoded= URLEncoder.encode(bodyMessage);

        RestAssured.baseURI = APP_URL;
        RestAssured.basePath=API_VERSION+APP_PATH;

        RequestSpecification request = given().log().all();
        request = request.contentType(ContentType.URLENC);
        request = request.body(bodyMessage);

        Response response = request.post();

        System.out.println("CODE>>"+response.statusCode());
       // System.out.println("whoelResponse>>"+response.asString());
        System.out.println("BODY>>"+response.getBody().asString());

        given().log().all()
                .header(new Header("Content-Type","application/x-www-form-urlencoded"))
        .body(encoded)
        .post().then().assertThat().statusCode(HttpStatus.SC_OK);

    }
}
