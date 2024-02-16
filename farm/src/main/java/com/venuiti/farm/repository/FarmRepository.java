package com.venuiti.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.venuiti.farm.model.FarmInfo;
	
	
	@Repository
	public interface FarmRepository extends JpaRepository<FarmInfo, Long>{
		
		@Query("Select s from FarmInfo s where s.farmId = :farmId")
		FarmInfo findByName(Long farmId);

}
