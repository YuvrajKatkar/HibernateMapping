package BiDTO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EmpBi1Many {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private String address;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private CompanyBi1Many companyBi1Many;
	public EmpBi1Many(String name, long phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public EmpBi1Many(String name, long phone, String address, CompanyBi1Many companyBi1Many) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.companyBi1Many = companyBi1Many;
	}

	public EmpBi1Many() {
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
	public CompanyBi1Many getCompanyBi1Many() {
		return companyBi1Many;
	}
	public void setCompanyBi1Many(CompanyBi1Many companyBi1Many) {
		this.companyBi1Many = companyBi1Many;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
