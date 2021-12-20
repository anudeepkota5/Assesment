package com.sample.test.demo.ai.model;

public class Weather {
	private int id;
	private String main;
	private String description;
	private String icon;
	
	public Weather(){
		
	}
	public Weather(int id, String main, String description, String icon) {
		super();
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}
	
	public int getId() {
		return id;
	}
	public String getMain() {
		return main;
	}
	public String getDescription() {
		return description;
	}
	public String getIcon() {
		return icon;
	}
	
	
}
