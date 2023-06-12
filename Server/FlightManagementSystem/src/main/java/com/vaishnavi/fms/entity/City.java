package com.vaishnavi.fms.entity;

public class City {
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + "]";
	}
	
	

}
