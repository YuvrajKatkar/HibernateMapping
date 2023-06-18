package DTO;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Owning side

@Entity
@Cacheable
@Table(name="Manushya")
public class Person {
	@Id
	@Column(name="Manushya_id")
	private int id;
	private String name;
	private String address;
	@OneToOne
	private AadharCard aadharCard;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String address, AadharCard aadharCard) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.aadharCard = aadharCard;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", aadharCard=" + aadharCard + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AadharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", aadharCard=" + aadharCard + "]";
//	}
	
}
