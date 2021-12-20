package com.sample.test.demo.api;

import com.sample.test.demo.ai.model.Model;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Openweathermap {
	
	private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";
	private static String apiKey = "831ce5030fc71fe81b1cefe992a3a00b";
	
	public static RestResponse<Model> getWether(String location) {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json").param("appid", apiKey).param("q", location);
        Response response = request.get("/").then().extract().response();
        return new RestResponse<Model>(Model.class, response);
    }

}
