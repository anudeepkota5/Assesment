package com.sample.test.demo.ai.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {
	
	private Coord coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private String visibility;
	private Wind wind;
	private Clouds clouds;
	private int dt;
	private Sys sys;
	private int timezone;
	private int id;
	private String name;
	private String cod;
	
	public Model(){
		
	}
	
	public Model(Coord coord, List<Weather> weather, String base, Main main, String visibility, Wind wind,
			Clouds clouds, int dt, Sys sys,int timezone, int id, String name, String cod) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	
	
	public Coord getCoord() {
		return coord;
	}
	
	
	public List<Weather> getWeather() {
		return weather;
	}
	
	
	public String getBase() {
		return base;
	}
	
	
	public Main getMain() {
		return main;
	}
	
	
	public String getVisibility() {
		return visibility;
	}
	
	
	public Wind getWind() {
		return wind;
	}
	
	
	public Clouds getClouds() {
		return clouds;
	}
	
	
	public int getDt() {
		return dt;
	}
	
	
	public Sys getSys() {
		return sys;
	}
	
	
	public int getTimeZone(){
		return timezone;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getCod() {
		return cod;
	}
}
