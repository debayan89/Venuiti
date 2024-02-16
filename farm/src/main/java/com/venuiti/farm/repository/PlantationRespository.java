package com.venuiti.farm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.venuiti.farm.model.Plantation;
	
	
	@Repository
	public interface PlantationRespository extends JpaRepository<Plantation, Long>{
		
		@Query("Select s from Plantation s where s.plantationId = :plantationId")
		Optional<Plantation> findById(Long plantationId);
		
		@Query("Select s from Plantation s where s.farmName = :farmName")
		Optional<Plantation> findByFarmName(String farmName);

}
