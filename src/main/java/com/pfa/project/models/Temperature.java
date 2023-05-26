package com.pfa.project.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "temperatures")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Temperature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double temperatureValue;

	private String timeOfTemperature;

	private LocalDate dateOfTemperature;

}
