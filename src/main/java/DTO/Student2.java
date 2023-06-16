package DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	long phone;
	String address;
	@ManyToOne
	College2 college2;
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
	public College2 getCollege2() {
		return college2;
	}
	public void setCollege2(College2 college2) {
		this.college2 = college2;
	}
	public Student2(int id, String name, long phone, String address, College2 college2) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.college2 = college2;
	}
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student2(String name, long phone, String address, College2 college2) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.college2 = college2;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", college2="
				+ college2 + "]\n";
	}
}
