package DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Course3 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  name;
	private long fees;
	private double durationInMonths;
	public Course3(int id, String name, long fees, double durationInMonths) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.durationInMonths = durationInMonths;
	}
	
	public Course3(String name, long fees, double durationInMonths) {
		super();
		this.name = name;
		this.fees = fees;
		this.durationInMonths = durationInMonths;
	}

	public Course3() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public double getDurationInMonths() {
		return durationInMonths;
	}
	public void setDurationInMonths(double durationInMonths) {
		this.durationInMonths = durationInMonths;
	}
	@Override
	public String toString() {
		return "Course3 [id=" + id + ", name=" + name + ", fees=" + fees + ", durationInMonths=" + durationInMonths
				+ "]\n";
	}
	
	
}
