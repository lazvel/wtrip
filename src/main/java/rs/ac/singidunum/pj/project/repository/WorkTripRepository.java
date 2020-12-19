package rs.ac.singidunum.pj.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.ac.singidunum.pj.project.entity.WorkTrip;

public interface WorkTripRepository extends JpaRepository<WorkTrip, Integer> {

	WorkTrip findByEmployee(String employee);

	WorkTrip findByDestination(String destination);

}
