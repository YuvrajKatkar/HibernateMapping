package ManyToMany;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.Course3;
import DTO.Student3;

public class Student3Dao {
	
	static Scanner scanner=new Scanner(System.in);
	static EntityManager entityManager;
	static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}
	public static void saveStudent(Student3 student3) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = Student3Dao.entityManager.getTransaction();
		entityTransaction.begin();
		Student3Dao.entityManager.persist(student3);
		entityTransaction.commit();
		
		
	}
	public Student3 fetchStudent(int studentId) {
		// TODO Auto-generated method stub

		Student3 student3= Student3Dao.entityManager.find(Student3.class, studentId);
		return student3;
	}
	public void fetchAllStudents() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select s from Student3 s");
		System.out.println(query.getResultList());
		
	}
	public void updateStudent(int studentid1) {
		// TODO Auto-generated method stub
		Student3 student3 = entityManager.find(Student3.class, studentid1);
		System.out.println("Enter which attribute is to be updated");
		System.out.println("1. Name 2. Phone 3. Address 4. Course");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Enter new Name: ");
			String newName= scanner.next();
			student3.setName(newName);
			break;
		case 2:
			System.out.println("Enter new Phone: ");
			String newPhone= scanner.next();
			student3.setName(newPhone);
			break;
		case 3:
			System.out.println("Enter new Address: ");
			String newAddress= scanner.next();
			student3.setName(newAddress);
			break;
		case 4:
			System.out.println("Enter new Course: ");
			String newCourse= scanner.next();
			//student3.setName(newName);
			break;

		default:
			break;
		}
		
	}
	
}
