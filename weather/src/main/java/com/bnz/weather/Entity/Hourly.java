package com.bnz.weather.Entity;

import java.util.*;

import org.springframework.boot.jackson.JsonComponent;

/***************************************************************************** 
 "hourly": {
    "time": ["2022-07-01T00:00", "2022-07-01T01:00", "2022-07-01T02:00", ...],
    "temperature_2m": [13, 12.7, 12.7, 12.5, 12.5, 12.8, 13, 12.9, 13.3, ...]
  }
******************************************************************************/

@JsonComponent
public class Hourly {
	
	private List<Double> temperature_2m = new ArrayList<Double>();
	private List<Date> time = new ArrayList<Date>();
	
	
	/**
	 * @param temperature_2m
	 * @param time
	 */
	public Hourly(List<Double> temperature_2m, List<Date> time) {
		super();
		this.temperature_2m = temperature_2m;
		this.time = time;
	}


	/**
	 * @return the temperature_2m
	 */
	public List<Double> getTemperature_2m() {
		return temperature_2m;
	}


	/**
	 * @param temperature_2m the temperature_2m to set
	 */
	public void setTemperature_2m(List<Double> temperature_2m) {
		this.temperature_2m = temperature_2m;
	}


	/**
	 * @return the time
	 */
	public List<Date> getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(List<Date> time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "Hourly [temperature_2m=" + temperature_2m + ", time=" + time + "]";
	}


	/**
	 * 
	 */
	public Hourly() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
