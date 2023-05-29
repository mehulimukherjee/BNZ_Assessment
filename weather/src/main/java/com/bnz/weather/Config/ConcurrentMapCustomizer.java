package com.bnz.weather.Config;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

public class ConcurrentMapCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {

	@Override
	public void customize(ConcurrentMapCacheManager cacheManager) {
		
		Logger logger = Logger.getLogger(ConcurrentMapCacheManager.class);
		
		cacheManager.setAllowNullValues(false);
		cacheManager.setStoreByValue(true);
		
		logger.info("Customizer is invoked..");
	}

}
