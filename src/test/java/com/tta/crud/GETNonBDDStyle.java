package com.tta.crud;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETNonBDDStyle {


    @Test
    public void getAllBookingIds(){
            //GET Request to https://restful-booker.herokuapp.com/booking

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");


        requestSpecification.when().get();
        requestSpecification.then().statusCode(200);


    }


}
