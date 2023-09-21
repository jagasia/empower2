package com.empower.cab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.cab.entity.Vehicle;
import com.empower.cab.repository.VehicleRepository;

@Service
public class VehicleService {
	@Autowired
	private VehicleRepository vr;
	
	public Vehicle create(Vehicle vehicle) {
		return vr.save(vehicle);
	}
	public List<Vehicle> read() {
		return vr.findAll();
	}
	public Vehicle read(Integer id) {
		Optional<Vehicle> temp = vr.findById(id);
		Vehicle v=null;
		if(temp.isPresent()) {
			v=temp.get();
		}
		return v;
	}
	public Vehicle update(Vehicle vehicle) {
		Vehicle v = read(vehicle.getId());
		if(v!=null)
		{
			v=vehicle;
			vr.save(v);
		}
		return v;
	}
	public Vehicle delete(Integer id) {
		Vehicle v = read(id);
		if(v!=null)
		{
			vr.delete(v);
		}
		return v;
	}
	
}
