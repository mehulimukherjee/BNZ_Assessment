package com.bnz.weather.Controller;

import java.io.IOException;
import java.util.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bnz.weather.Entity.WeatherError;
import com.bnz.weather.Service.WeatherService;

@RestController
public class WeatherController {
	
	Logger logger = Logger.getLogger(WeatherController.class);

	@Autowired
	private WeatherService weatherService;

	@Autowired
	private WeatherError error;
	
	@GetMapping(path = "/WeatherForecast", produces = "application/json")
	private ResponseEntity<Object> getWeatherPage(){
		String text = "This is my Weather Home Page.";
		return ResponseEntity.of(Optional.of(text));	
	}

	@GetMapping(path = "/WeatherForecast/{location}", produces = "application/json")
	private ResponseEntity<Object> getTheWeatherReport(@PathVariable String location)
			throws IOException, InterruptedException {
		
		switch (location) {
		case "Wellington": {
			
			return ResponseEntity.of(Optional.of(this.weatherService.weatherReport(location)));
		}
		case "Auckland": {
			
			return ResponseEntity.of(Optional.of(this.weatherService.weatherReport(location)));
		}
		default:
			logger.debug("Incorrect Location : "+location);
			return ResponseEntity.of(Optional.of(error.toString()));
		}
		
	}

}
