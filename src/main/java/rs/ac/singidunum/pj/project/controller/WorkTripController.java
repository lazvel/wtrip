package rs.ac.singidunum.pj.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.singidunum.pj.project.entity.WorkTrip;
import rs.ac.singidunum.pj.project.service.WorkTripService;

@RestController
public class WorkTripController {
	
	@Autowired
	private WorkTripService service;
	
	@PostMapping("/addTrip")
	public WorkTrip addWorkTrip(@RequestBody WorkTrip workTrip) {
		return service.saveWorkTrip(workTrip);
	}
	
	@PostMapping("/addTrips")
	public List<WorkTrip> addWorkTrips(@RequestBody List<WorkTrip>  workTrips) {
		return service.saveWorkTrips(workTrips);
	}
	
	@GetMapping("/trips")
	public List<WorkTrip> findAllTrips() {
		return service.getWorkTrips();
	}
	
	@GetMapping("/tripById/{id}")
	public WorkTrip findTripById(@PathVariable int id) {
		return service.getWorkTripById(id);
	}
	
	@GetMapping("/tripByEm/{employee}")
	public WorkTrip findTripByEmployee(@PathVariable String employee) {
		return service.getWorkTripByEmployee(employee);
	}
	
	@GetMapping("/tripDest/{destination}")
	public WorkTrip findTripByDestination(@PathVariable String destination) {
		return service.getWorkTripByDestination(destination);
	}
	
	@PutMapping("/update")
	public WorkTrip updateWorkTrip(@RequestBody WorkTrip workTrip) {
		return service.updateWorkTrip(workTrip);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTrip(@PathVariable int id) {
		return service.deleteWorkTrip(id);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllTrips() {
		return service.deleteAllWorkTrips();
	}
}
