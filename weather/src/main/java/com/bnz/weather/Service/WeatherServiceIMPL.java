package com.bnz.weather.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bnz.weather.Entity.Hourly;
import com.bnz.weather.Entity.HourlyUnits;
import com.bnz.weather.Entity.WeatherResponse;
import com.bnz.weather.Repository.WeatherRepository;

@Service
public class WeatherServiceIMPL implements WeatherService {
	
	Logger logger = Logger.getLogger(WeatherServiceIMPL.class);
	
	@Autowired
	WeatherResponse response;
	
	@Autowired
	WeatherRepository weatherRepository;
	
	@Autowired
	Hourly hourly;
	
	@Autowired
	HourlyUnits hourlyUnits;
	
	@Override
	public WeatherResponse weatherReport(String location) throws IOException, InterruptedException{
		
			List<Double> tempList = new ArrayList<Double>();
			tempList.addAll(getResponseFromOpenMeteo(location).getHourly().getTemperature_2m());
			
			List<Date> timeList = new ArrayList<Date>();
			timeList.addAll(getResponseFromOpenMeteo(location).getHourly().getTime());
			
			hourly.setTemperature_2m(tempList);
			hourly.setTime(timeList);
			
			hourlyUnits.setTemperature_2m(getResponseFromOpenMeteo(location).getHourly_units().getTemperature_2m());
			hourlyUnits.setTime(getResponseFromOpenMeteo(location).getHourly_units().getTime());
			
			response.setLatitude(getResponseFromOpenMeteo(location).getLatitude());
			response.setLongitude(getResponseFromOpenMeteo(location).getLongitude());
			response.setTimezone("GMT");
			response.setTimezone_abbreviation("GMT");
			response.setUtc_offset_seconds(getResponseFromOpenMeteo(location).getUtc_offset_seconds());
			response.setElevation(getResponseFromOpenMeteo(location).getElevation());
			response.setGenerationtime_ms(getResponseFromOpenMeteo(location).getGenerationtime_ms());
			response.setHourly_units(hourlyUnits);
			response.setHourly(hourly);
			
			logger.debug("The Hourly Weather Report for " + location + " : " + response);
			
		return response;
	}
	
	
	private WeatherResponse getResponseFromOpenMeteo(String location) throws IOException, InterruptedException {
		
		return this.weatherRepository.getResponse(location);
		
	}

	

}
