package DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student3 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	 private long phone;
	 private String address;
	 @ManyToMany
	 private List<Course3> course3s;
	public Student3(int id, String name, long phone, String address, List<Course3> course3s) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course3s = course3s;
	}
	
	public Student3(String name, long phone, String address, List<Course3> course3s) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course3s = course3s;
	}

	public Student3() {
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Course3> getCourse3s() {
		return course3s;
	}
	public void setCourse3s(List<Course3> course3s) {
		this.course3s = course3s;
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", course3s="
				+ course3s + "]\n";
	}
	 
	 
}
