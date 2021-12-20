package com.sample.test.demo.ai.model;

public class Main {
	private float temp;
	private float feels_like;
	private float temp_min;
	private float temp_max;
	private int pressure;
	private int humidity;
	private int sea_level;
	private int grnd_level;
	public Main(){
		
	}
	public Main(float temp, float feels_like, float temp_min, float temp_max, int pressure, int humidity, int sea_level, int grnd_level) {
		super();
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}
	
	public float getTemp() {
		return temp;
	}
	
	public float getfeels_like(){
		return feels_like;
	}
	
	public int getPressure() {
		return pressure;
	}
	
	public int getHumidity() {
		return humidity;
	}
	
	public float getTemp_min() {
		return temp_min;
	}
	
	public float getTemp_max() {
		return temp_max;
	}
	
	public float getsea_level(){
		return sea_level;
	}
	
	public float getgrnd_level(){
		return grnd_level;
	}
}
