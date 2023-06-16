package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Non-owing side

@Entity
@Table(name="a_card")
public class AadharCard {
	@Id
	@Column(name="a_name")
	private int id;
	private String name;
	private String address;
	
	public AadharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AadharCard(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	@Override
	public String toString() {
		return "AadharCard [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
