package com.bnz.weather.Entity;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.http.HttpStatus;

@JsonComponent
public class WeatherError {
	private final static HttpStatus HTTP_STATUS = HttpStatus.BAD_REQUEST;
	private final static String MESSAGE = "Cannot find the WeatherData from the invalid String value in the Query Param.";

	/**
	 * 
	 */
	public WeatherError() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the httpStatus
	 */
	public static HttpStatus getHttpStatus() {
		return HTTP_STATUS;
	}

	/**
	 * @return the message
	 */
	public static String getMessage() {
		return MESSAGE;
	}

	@Override
	public String toString() {
		return "Error [ Http_Status: " + getHttpStatus() + ", Reason: " + getMessage() + " ]";
	}

}