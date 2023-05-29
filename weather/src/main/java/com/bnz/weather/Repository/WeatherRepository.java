package com.bnz.weather.Repository;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import com.bnz.weather.Entity.WeatherResponse;

@Repository
public interface WeatherRepository {
	
	public WeatherResponse getResponse(String location) throws IOException, InterruptedException;

}
