package com.pfa.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.project.models.Temperature;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long>{

}
