package DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Company1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gst;
	@OneToMany
	private List<Employee1> employee1s;
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
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public List<Employee1> getEmployee1s() {
		return employee1s;
	}
	public void setEmployee1s(List<Employee1> employee1s) {
		this.employee1s = employee1s;
	}
	public Company1(int id, String name, String gst, List<Employee1> employee1s) {
		super();
		this.id = id;
		this.name = name;
		this.gst = gst;
		this.employee1s = employee1s;
	}
	public Company1(String name, String gst, List<Employee1> employee1s) {
		super();
		this.name = name;
		this.gst = gst;
		this.employee1s = employee1s;
	}
	public Company1(int id, String name, String gst) {
		super();
		this.id = id;
		this.name = name;
		this.gst = gst;
	}
	public Company1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company1 [id=" + id + ", name=" + name + ", gst=" + gst + ", employee1s=" + employee1s + "]";
	}
	
}
