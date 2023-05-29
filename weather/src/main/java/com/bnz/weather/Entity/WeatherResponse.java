package com.bnz.weather.Entity;

import java.io.Serializable;

import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class WeatherResponse implements Serializable {
	
private static final long serialVersionUID = 1L;

/******************************** JSON Response **********************************
 
	  "latitude": 52.52,
	  "longitude": 13.419,
	  "elevation": 44.812,
	  "generationtime_ms": 2.2119,
	  "utc_offset_seconds": 0,
	  "timezone": "Europe/Berlin",
	  "timezone_abbreviation": "CEST",
	  "hourly": {
	    "time": ["2022-07-01T00:00", "2022-07-01T01:00", "2022-07-01T02:00", ...],
	    "temperature_2m": [13, 12.7, 12.7, 12.5, 12.5, 12.8, 13, 12.9, 13.3, ...]
	  },
	  "hourly_units": {
	    "temperature_2m": "°C"
	  }
**********************************************************************************/
	
	private Double latitude;
	private Double longitude;
	private Double elevation;
	private Double generationtime_ms;
	private int utc_offset_seconds;
	private String timezone;
	private String timezone_abbreviation;
	private Hourly hourly;
	private HourlyUnits hourly_units;
	
	/**
	 * 
	 */
	public WeatherResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param latitude
	 * @param longitude
	 * @param elevation
	 * @param generationtime_ms
	 * @param utc_offset_seconds
	 * @param timezone
	 * @param timezone_abbreviation
	 * @param hourly
	 * @param hourly_units
	 * @param current_weather
	 */
	public WeatherResponse(Double latitude, Double longitude, Double elevation, Double generationtime_ms,
			int utc_offset_seconds, String timezone, String timezone_abbreviation, Hourly hourly,
			HourlyUnits hourly_units) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.generationtime_ms = generationtime_ms;
		this.utc_offset_seconds = utc_offset_seconds;
		this.timezone = timezone;
		this.timezone_abbreviation = timezone_abbreviation;
		this.hourly = hourly;
		this.hourly_units = hourly_units;
	}
	
	
	
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the elevation
	 */
	public Double getElevation() {
		return elevation;
	}
	/**
	 * @param elevation the elevation to set
	 */
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}
	/**
	 * @return the generationtime_ms
	 */
	public Double getGenerationtime_ms() {
		return generationtime_ms;
	}
	/**
	 * @param generationtime_ms the generationtime_ms to set
	 */
	public void setGenerationtime_ms(Double generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}
	/**
	 * @return the utc_offset_seconds
	 */
	public int getUtc_offset_seconds() {
		return utc_offset_seconds;
	}
	/**
	 * @param utc_offset_seconds the utc_offset_seconds to set
	 */
	public void setUtc_offset_seconds(int utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}
	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the timezone_abbreviation
	 */
	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}
	/**
	 * @param timezone_abbreviation the timezone_abbreviation to set
	 */
	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}
	/**
	 * @return the hourly
	 */
	public Hourly getHourly() {
		return hourly;
	}
	/**
	 * @param hourly the hourly to set
	 */
	public void setHourly(Hourly hourly) {
		this.hourly = hourly;
	}
	/**
	 * @return the hourly_units
	 */
	public HourlyUnits getHourly_units() {
		return hourly_units;
	}
	/**
	 * @param hourly_units the hourly_units to set
	 */
	public void setHourly_units(HourlyUnits hourly_units) {
		this.hourly_units = hourly_units;
	}
	
	@Override
	public String toString() {
		return "Response [latitude=" + latitude + ", longitude=" + longitude + ", elevation=" + elevation
				+ ", generationtime_ms=" + generationtime_ms + ", utc_offset_seconds=" + utc_offset_seconds
				+ ", timezone=" + timezone + ", timezone_abbreviation=" + timezone_abbreviation + ", hourly=" + hourly
				+ ", hourly_units=" + hourly_units + "]";
	}
	
}
