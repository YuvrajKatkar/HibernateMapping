package BiDTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class StudentBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	@Column(unique = true)
	private long phone;
	private String address;
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinTable(joinColumns = @JoinColumn(name = "sid"),inverseJoinColumns = @JoinColumn(name = "id"))
	private List<CourseBi> listOCourses;
	public StudentBi(String name, long phone, String address, List<CourseBi> list) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.listOCourses = list;
	}
	public StudentBi(String name, long phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return sid;
	}
	public void setId(int sid) {
		this.sid = sid;
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
	public List<CourseBi> getList() {
		return listOCourses;
	}
	public void setList(List<CourseBi> list) {
		this.listOCourses = list;
	}
	
	
}
