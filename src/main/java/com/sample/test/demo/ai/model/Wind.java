package com.sample.test.demo.ai.model;

public class Wind {
	private float speed;
	private int deg;
	private float gust;
	
	public Wind(){
		
	}
	public Wind(float speed, int deg, float gust) {
		super();
		this.speed = speed;
		this.deg = deg;
		this.gust = gust;
	}
	public float getSpeed() {
		return speed;
	}
	public int getDeg() {
		return deg;
	}
	public float getgust(){
		return gust;
	}
	
	
}
