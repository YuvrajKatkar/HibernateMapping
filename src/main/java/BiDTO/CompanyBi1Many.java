package BiDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class CompanyBi1Many {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long gst;
	@OneToMany(mappedBy = "companyBi1Many")
	private List<EmpBi1Many> list;
	public CompanyBi1Many( String name, long gst, List<EmpBi1Many> list) {
		super();
		
		this.name = name;
		this.gst = gst;
		this.list = list;
	}
	public CompanyBi1Many(String name, long gst) {
		super();
		this.name = name;
		this.gst = gst;
	}
	public CompanyBi1Many() {
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
	public long getGst() {
		return gst;
	}
	public void setGst(long gst) {
		this.gst = gst;
	}
	public List<EmpBi1Many> getList() {
		return list;
	}
	public void setList(List<EmpBi1Many> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Company[id=" + id + ", name=" + name + ", gst=" + gst + ", list=" + list + "]";
	}
	
	
}
