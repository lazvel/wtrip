package rs.ac.singidunum.pj.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.ac.singidunum.pj.project.entity.WorkTrip;
import rs.ac.singidunum.pj.project.repository.WorkTripRepository;

@Service
public class WorkTripService {
	
	@Autowired
	private WorkTripRepository repository;
	
	public WorkTrip saveWorkTrip(WorkTrip workTrip) {
		return repository.save(workTrip);
	}
	
	public List<WorkTrip> saveWorkTrips(List<WorkTrip> workTrips) {
		return repository.saveAll(workTrips);
	}
	
	public List<WorkTrip> getWorkTrips() {
		return repository.findAll();
	}
	
	public WorkTrip getWorkTripById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public WorkTrip getWorkTripByEmployee(String employee) {
		return repository.findByEmployee(employee);
	}
	
	public WorkTrip getWorkTripByDestination(String destination) {
		return repository.findByDestination(destination);
	}
	
	public String deleteWorkTrip(int id) {
		repository.deleteById(id);
		return "Work trip removed."; 
	}
	
	public String deleteAllWorkTrips() {
		repository.deleteAll();
		return "All trips are removed."; 
	}
	
	public WorkTrip updateWorkTrip(WorkTrip workTrip) {
		WorkTrip existingWorkTrip = repository.findById(workTrip.getId()).orElse(null);
		existingWorkTrip.setEmployee(workTrip.getEmployee());
		existingWorkTrip.setDestination(workTrip.getDestination());
		existingWorkTrip.setPriceArrangment(workTrip.getPriceArrangment());
		existingWorkTrip.setDayNum(workTrip.getDayNum());
		existingWorkTrip.setTotalExpense(workTrip.getTotalExpense());
		return repository.save(existingWorkTrip);
	}
}
