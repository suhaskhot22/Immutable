package com.demo.byName;

public class Address {

	private String cityName;
	private String areaName;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", areaName=" + areaName + "]";
	}
	
	
	
}
