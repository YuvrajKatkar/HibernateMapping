package BiDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharCardBi1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	@OneToOne(mappedBy = "aadharCardBi1")
	private PersonBi1 personBi1;
	public AadharCardBi1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AadharCardBi1(int id, String name, String address, PersonBi1 personBi1) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.personBi1 = personBi1;
	}
	public AadharCardBi1(String name, String address, PersonBi1 personBi1) {
		super();
		this.name = name;
		this.address = address;
		this.personBi1 = personBi1;
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
	public PersonBi1 getPersonBi1() {
		return personBi1;
	}
	public void setPersonBi1(PersonBi1 personBi1) {
		this.personBi1 = personBi1;
	}
	@Override
	public String toString() {
		return "AadharCardBi1 [id=" + id + ", name=" + name + ", address=" + address +  "]";
	}
	public AadharCardBi1( String name, String address) {
		super();
		
		this.name = name;
		this.address = address;
	}
	
	
}
