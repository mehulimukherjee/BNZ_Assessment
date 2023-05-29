package com.bnz.weather.Config;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfiguration {
	
	CacheManagerCustomizer<ConcurrentMapCacheManager> customizer(){
		return new ConcurrentMapCustomizer();
	}

}
