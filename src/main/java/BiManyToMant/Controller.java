package BiManyToMant;

import java.util.ArrayList;
import java.util.List;

import BiDTO.CourseBi;
import BiDTO.StudentBi;

public class Controller {
	public static void main(String[] args) {
		StudentBiDAO.entityManager=StudentBiDAO.getEntityManager();
		StudentBiDAO studentBiDAO = new StudentBiDAO();
		CourseBiDAO courseBiDAO = new CourseBiDAO();
		
		while (true) {
			System.out.println("1. save Student 10.exit");
			switch (StudentBiDAO.scanner.nextInt()) {
			case 1:
				System.out.println("Enter name of Student: ");
				String nameStudent = StudentBiDAO.scanner.next();
				System.out.println("Enter phone number of Student: ");
				long phoneStudent = StudentBiDAO.scanner.nextLong();
				System.out.println("Enter address of Student: ");
				String AddressStudent = StudentBiDAO.scanner.next();
				StudentBi studentBi = new StudentBi(nameStudent, phoneStudent, AddressStudent);
				CourseBi courseBi = new CourseBi();
				List<CourseBi> listOfCourses = new ArrayList<CourseBi>();
				List<StudentBi> listOfStudents = new ArrayList<StudentBi>();
				int i=1;
				while(i>0) {
					System.out.println("1. Add course 2. Done adding course");
					switch (StudentBiDAO.scanner.nextInt()) {
					case 1:
						System.out.println("1. Create new Course 2. Select existing course");
						if(StudentBiDAO.scanner.nextInt()==1) {
							System.out.println("Enter course name: ");
							String courseName = studentBiDAO.scanner.next();
							System.out.println("Enter course fees:");
							double fees = studentBiDAO.scanner.nextDouble();
							System.out.println("Enter course duration");
							int duration = studentBiDAO.scanner.nextInt();
							courseBi.setDuration(duration);
							courseBi.setFees(fees);
							courseBi.setName(courseName);
							listOfCourses.add(courseBi);
							
						}
						else {
							System.out.println("Enter id of course you want to add");
							int id = StudentBiDAO.scanner.nextInt();
							CourseBi courseBi1  =courseBiDAO.fetchCourse(id);
							listOfCourses.add(courseBi1);
						}
						
						break;
					case 2:
						i=0;
						break;
					}
					studentBi.setList(listOfCourses);
					courseBi.setList(listOfStudents);
					courseBi.getList().add(studentBi);
					studentBiDAO.saveStudent(studentBi);
				}
				break;
			case 10:
				return;
			}
		}
	}
}
