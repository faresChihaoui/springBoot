package com.pfa.project.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.project.models.Temperature;
import com.pfa.project.repositories.TemperatureRepository;

@Service
public class TemperatureServiceImpl implements TemperatureService {

	@Autowired(required=true)
	private TemperatureRepository temperatureRepository;

	@Override
	public void saveTemperature() {
		Temperature temperature = new Temperature();
		Double temperatureValue = this.randomizeValueOfTemperature();
		temperature.setTemperatureValue(Math.round(temperatureValue * 10.0) / 10.0);
		temperature.setTimeOfTemperature(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
		temperature.setDateOfTemperature(LocalDate.now());
		temperatureRepository.save(temperature);
	}

	@Override
	public Double randomizeValueOfTemperature() {
		double minTemperature = 5.0;
		double maxTemperature = 45.0;
		Random random = new Random();
		double temperatureRange = maxTemperature - minTemperature;
		double randomTemperature = random.nextDouble() * temperatureRange + minTemperature;
		return randomTemperature;
	}
	

}
