package ru.netology.Task;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class PostTest {

    

    @Test
    void requestPost (){

        given()
                .baseUri("https://postman-echo.com")
               // .contentType("text/plain; charset=UTF-8")
                .body("name Anton")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",equalTo("name Anton"))
         ;
    }
}
