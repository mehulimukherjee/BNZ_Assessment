package com.bnz.weather.Repository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.bnz.weather.Entity.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class WeatherRepositoryIMPL implements WeatherRepository {

	private final static String OPEN_METEO_WELLINGTON_URL = "https://api.open-meteo.com/v1/forecast?latitude=-41.29&longitude=174.78&hourly=temperature_2m";
	private final static String OPEN_METEO_AUCKLAND_URL = "https://api.open-meteo.com/v1/forecast?latitude=-36.85&longitude=174.76&hourly=temperature_2m";

	Logger logger = Logger.getLogger(WeatherRepositoryIMPL.class);

	@Override
	@Cacheable(cacheNames = "WeatherResponse", key = "#location")
	public WeatherResponse getResponse(String location) throws IOException, InterruptedException {

		HttpRequest httpRequest = null;

		if (location.equals("Wellington")) {

			httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(OPEN_METEO_WELLINGTON_URL)).build();
			logger.debug("GET Request for Wellington : " + httpRequest);

		}
		if (location.equals("Auckland")) {

			httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(OPEN_METEO_AUCKLAND_URL)).build();
			logger.debug("GET Request for Auckland : " + httpRequest);

		}

		var httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(30)).build();

		var httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		logger.debug("Get response for " + location + " : " + httpResponse.body());

		WeatherResponse response = new ObjectMapper().readValue(httpResponse.body(), WeatherResponse.class);
		logger.info("Fetching the Response..");
		return response;

	}

}
