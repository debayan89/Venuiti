package com.venuiti.farm.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venuiti.farm.model.FarmInfo;
import com.venuiti.farm.model.Harvest;
import com.venuiti.farm.model.Plantation;
import com.venuiti.farm.repository.FarmRepository;
import com.venuiti.farm.repository.HarvestRespository;
import com.venuiti.farm.repository.PlantationRespository;

@RestController
@RequestMapping("/api/v1")
public class FarmControllerApiController {
	@Autowired
	private FarmRepository farmRepository;

	@Autowired
	private PlantationRespository plantationRepository;

	@Autowired
	private HarvestRespository harvestRepository;

	@PostMapping("/plantation")
	public Plantation updatePlantation(@RequestBody Plantation plantation) {
		return plantationRepository.save(plantation);
	}

	@PostMapping("/harvest")
	public Harvest updateHarvest(@RequestBody Harvest harvest) {
		return harvestRepository.save(harvest);
	}

	@GetMapping("/farmInfo/{farmId}")
	public ResponseEntity<FarmInfo> getFarmById(@PathVariable(value = "farmId") Long farmId)
			throws ResourceNotFoundException {
		FarmInfo farmInfo = farmRepository.findByName(farmId);
		return ResponseEntity.ok().body(farmInfo);
	}

	@GetMapping("/plantation/{plantationId}")
	public ResponseEntity<Optional<Plantation>> getPlantationById(
			@PathVariable(value = "plantationId") Long plantationId) throws ResourceNotFoundException {
		Optional<Plantation> plantation = plantationRepository.findById(plantationId);
		return ResponseEntity.ok().body(plantation);
	}

	@GetMapping("/harvest/{harvestName}")
	public ResponseEntity<Harvest> getHarvestByName(@PathVariable(value = "harvestName") String harvestName)
			throws ResourceNotFoundException {
		Harvest harvest = harvestRepository.findByName(harvestName);
		return ResponseEntity.ok().body(harvest);
	}

	@GetMapping("/plantation/getName/{farmName1}")
	public ResponseEntity<Optional<Plantation>> getPlantationByFarmName(@PathVariable(value = "farmName1") String farmName1)
			throws ResourceNotFoundException {
		Optional<Plantation> plantation = plantationRepository.findByFarmName(farmName1);
		return ResponseEntity.ok().body(plantation);
	}

	@GetMapping("/harvest/getHarvestName/{farmName}")
	public ResponseEntity<Harvest> getHarvestByFarmName(@PathVariable(value = "farmName") String farmName)
			throws ResourceNotFoundException {
		Harvest harvest = harvestRepository.findByFarmName(farmName);
		return ResponseEntity.ok().body(harvest);
	}

}
