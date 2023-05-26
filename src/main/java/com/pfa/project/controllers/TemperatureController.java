package com.pfa.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.project.services.TemperatureService;

@RestController
@RequestMapping("/api/temperature")
@CrossOrigin(origins = "*")
public class TemperatureController {

	@Autowired(required=true)
	private TemperatureService temperatureService;

	@PostMapping("/add")
	public ResponseEntity<String> saveTemperature() {
		try {
			temperatureService.saveTemperature();
			return ResponseEntity.status(HttpStatus.CREATED).body("Temperature created successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}

	}

}
