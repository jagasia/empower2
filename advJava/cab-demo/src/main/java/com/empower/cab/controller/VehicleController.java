package com.empower.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.cab.entity.Vehicle;
import com.empower.cab.service.VehicleService;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vs;
	
	@PostMapping
	public Vehicle create(@RequestBody Vehicle vehicle) {
		return vs.create(vehicle);
	}
	
	@GetMapping
	public List<Vehicle> read() {
		return vs.read();
	}
	
	@GetMapping("/{id}")
	public Vehicle read(@PathVariable("id") Integer id) {
		return vs.read(id);
	}
	
	@PutMapping
	public Vehicle update(@RequestBody Vehicle vehicle) {
		return vs.update(vehicle);
	}
	
	@DeleteMapping("/{id}")
	public Vehicle delete(@PathVariable("id") Integer id) {
		return vs.delete(id);
	}
	
}
