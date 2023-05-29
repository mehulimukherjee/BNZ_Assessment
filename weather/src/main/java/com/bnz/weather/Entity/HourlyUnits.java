package com.bnz.weather.Entity;

import org.springframework.boot.jackson.JsonComponent;

/************************************
 "hourly_units": {
    "temperature_2m": "°C",
    "time":"iso8601"
  }
************************************/

@JsonComponent
public class HourlyUnits {
	
	private String time;
	private String temperature_2m;

	/**
	 * Default Constructor
	 */
	public HourlyUnits() {
		super();
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the temperature_2m
	 */
	public String getTemperature_2m() {
		return temperature_2m;
	}

	/**
	 * @param temperature_2m the temperature_2m to set
	 */
	public void setTemperature_2m(String temperature_2m) {
		this.temperature_2m = temperature_2m;
	}
	
	
}
