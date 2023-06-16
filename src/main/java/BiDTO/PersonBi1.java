package BiDTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PersonBi1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private long phone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private AadharCardBi1 aadharCardBi1;
	public PersonBi1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonBi1(int id, String name, String address, long phone, AadharCardBi1 aadharCardBi1) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.aadharCardBi1 = aadharCardBi1;
	}
	public PersonBi1(String name, String address, long phone, AadharCardBi1 aadharCardBi1) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.aadharCardBi1 = aadharCardBi1;
	}
	@Override
	public String toString() {
		return "PersonBi1 [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+  "]";
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public AadharCardBi1 getAadharCardBi1() {
		return aadharCardBi1;
	}
	public void setAadharCardBi1(AadharCardBi1 aadharCardBi1) {
		this.aadharCardBi1 = aadharCardBi1;
	}
	public PersonBi1( String name, String address, long phone) {
		super();
		
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	
	
}
