package rs.ac.singidunum.pj.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="trip")
public class WorkTrip {
	@Id
	@GeneratedValue
	private int id;
	private String employee;
	private String destination;
	private double priceArrangment;
	private int dayNum;
	private double totalExpense;
	
	
	public int getId() {
		return id;
	}

	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public double getPriceArrangment() {
		return priceArrangment;
	}

	public void setPriceArrangment(double priceArrangment) {
		this.priceArrangment = priceArrangment;
	}

	public int getDayNum() {
		return dayNum;
	}
	
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	
	public double getTotalExpense() {
		return this.dayNum * this.priceArrangment ;
	}
	
	public void setTotalExpense(double totalExpense) {
		this.totalExpense = this.dayNum * this.priceArrangment ;
	}
	
	//nije htelo da vuce iz @Data anotacije pa smo morali rucno da generisemo getere i setere
	
	
}
