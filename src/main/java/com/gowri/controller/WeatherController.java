package com.gowri.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NaveenWodeyar
 * @date 18-Jan-2025 12:13:19 pm
 */

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	private static final Logger log = LoggerFactory.getLogger(WeatherController.class);
	
	@GetMapping
	public ResponseEntity<?> testEndPoint(String name){
		log.info("SERVER IS UP");
		return ResponseEntity.ok("Welcome "+name);
	}

}
