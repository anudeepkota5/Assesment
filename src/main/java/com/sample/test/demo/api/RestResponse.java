package com.sample.test.demo.api;

import io.restassured.response.Response;

public class RestResponse<T> implements IRestResponse<T> {
	private T data;
	private Response response;
	private Exception e;
	
	public RestResponse(Class<T> t, Response response) {
		this.response = response;
		try{
			this.data = t.newInstance();
		}catch (Exception e){
			throw new RuntimeException("There should be a default constructor in the Response POJO");
		}
	}

	@Override
	public int getStatusCode() {
		return response.getStatusCode();
	}

	@Override
	public Response getResponse() {
		return response;
	}

	@Override
	public Exception getException() {
		return e;
	}

	@Override
	public T getBody() {
		try {
			data = (T) response.getBody().as(data.getClass());
		}catch (Exception e) {
			this.e=e;
		}
		return data;
	}

}
