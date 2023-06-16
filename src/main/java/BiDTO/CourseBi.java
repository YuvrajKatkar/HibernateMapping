package BiDTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class CourseBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double fees;
	private int duration;
	@ManyToMany(mappedBy = "listOCourses")
	private List<StudentBi> list;
	public CourseBi(String name, double fees, int duration, List<StudentBi> list) {
		super();
		this.name = name;
		this.fees = fees;
		this.duration = duration;
		this.list = list;
	}
	public CourseBi(String name, double fees, int duration) {
		super();
		this.name = name;
		this.fees = fees;
		this.duration = duration;
	}
	public CourseBi() {
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<StudentBi> getList() {
		return list;
	}
	public void setList(List<StudentBi> list) {
		this.list = list;
	}
	
	
}
