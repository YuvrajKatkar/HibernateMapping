package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import DTO.Course3;
import DTO.Student3;

public class Controller {
	public static void main(String[] args) {
		Student3Dao.entityManager = Student3Dao.getEntityManager();
		Student3Dao student3Dao = new Student3Dao();
		Course3Dao course3Dao = new Course3Dao();
		while (true) {
			System.out.println("Enter the option");
			System.out.println("1. Add Course 2. Add Student 3. DisplayCourse 4. DisplayStudent  ");
			System.out.println("5. DisplayAllCourses 6. DisplayAllStudents 7. UpdateCourse 8. UpdateStudent 10.Exit");
			switch (Student3Dao.scanner.nextInt()) {
			case 1:
				System.out.println("Enter name of course: ");
				String name = Student3Dao.scanner.next();
				System.out.println("Enter fees of course: ");
				Long fees = Student3Dao.scanner.nextLong();
				System.out.println("Enter duration of course: ");
				double duration = Student3Dao.scanner.nextDouble();
				Course3 course3 = new Course3(name, fees, duration);
				Course3Dao.saveCourse(course3);
				break;

			case 2:
				System.out.println("Enter name of Student: ");
				String name1 = Student3Dao.scanner.next();
				System.out.println("Enter phone of Student: ");
				long phone = Student3Dao.scanner.nextLong();
				System.out.println("Enter address of Student: ");
				String address = Student3Dao.scanner.next();
				List<Course3> list = new ArrayList<Course3>();
				System.out.println("1. Select existing course 2. Create new course");
				switch (Student3Dao.scanner.nextInt()) {
				case 1:
					int i = 1;

					while (i > 0) {
						System.out.println("1. Add courses more course 2. Done selecting all course");
						switch (Student3Dao.scanner.nextInt()) {
						case 1:
							System.out.println("Enter the id of course");
							int courseId = Student3Dao.scanner.nextInt();
							// Course3Dao course3Dao = new Course3Dao();
							Course3 course33 = course3Dao.fetchCourse(courseId);
							list.add(course33);
							break;

						case 2:
							i = 0;
							break;
						}

					}

					break;
				case 2:
					System.out.println("Enter name of course: ");
					String name2 = Student3Dao.scanner.next();
					System.out.println("Enter fees of course: ");
					Long fees2 = Student3Dao.scanner.nextLong();
					System.out.println("Enter duration of course: ");
					double duration2 = Student3Dao.scanner.nextDouble();
					Course3 course32 = new Course3(name2, fees2, duration2);
					Course3Dao.saveCourse(course32);
					list.add(course32);
					break;
				}
				Student3 student3 = new Student3(name1, phone, address, list);
				Student3Dao.saveStudent(student3);
				break;

			case 3:
				System.out.println("Enter course id: ");
				int courseId = Student3Dao.scanner.nextInt();
				System.out.println(course3Dao.fetchCourse(courseId));
				break;

			case 4:
				System.out.println("Enter Student id: ");
				int studentId = Student3Dao.scanner.nextInt();
				System.out.println(student3Dao.fetchStudent(studentId));
				break;
			
			case 5:
				course3Dao.fetchAllCourses();
				break;
				
			case 6:
				student3Dao.fetchAllStudents();
				break;
				
			case 7:
				System.out.println("Enter id of course which is to to updated");
				int courseId1 = Student3Dao.scanner.nextInt();
				course3Dao.updateCourse(courseId1);
				break;
				
			case 8:
				System.out.println("Enter id of student which is to be updated");
				int studentid1 = Student3Dao.scanner.nextInt();
				student3Dao.updateStudent(studentid1);
				break;
			case 10:
				return;

			}
		}

	}
}
