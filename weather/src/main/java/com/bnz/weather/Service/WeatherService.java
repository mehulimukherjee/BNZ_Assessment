/**
 * 
 */
package com.bnz.weather.Service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.bnz.weather.Entity.WeatherResponse;

@Service
public interface WeatherService {

	public WeatherResponse weatherReport(String location) throws IOException, InterruptedException;
	
}
