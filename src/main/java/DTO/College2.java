package DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	double fees;
	String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public College2(int id, String name, double fees, String location) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.location = location;
	}
	
	public College2(String name, double fees, String location) {
		super();
		this.name = name;
		this.fees = fees;
		this.location = location;
	}
	public College2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College2 [id=" + id + ", name=" + name + ", fees=" + fees + ", location=" + location + "]\n";
	}
	
}
