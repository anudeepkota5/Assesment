package com.sample.test.demo.api;

import io.restassured.response.Response;

public interface IRestResponse<T> {
	public T getBody();
	public int getStatusCode();
	public Response getResponse();	
	public Exception getException();
}
