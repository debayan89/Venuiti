package com.venuiti.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.venuiti.farm.model.FarmInfo;
import com.venuiti.farm.model.Harvest;
	
	
	@Repository
	public interface HarvestRespository extends JpaRepository<Harvest, Long>{
		
		@Query("Select s from Harvest s where s.harvestName = :harvestName")
		Harvest findByName(String harvestName);
		
		@Query("Select s from Harvest s where s.farmName = :farmName")
		Harvest findByFarmName(String farmName);

}
