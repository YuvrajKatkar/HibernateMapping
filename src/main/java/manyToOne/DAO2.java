package manyToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.AadharCard;
import DTO.College2;
import DTO.Company1;
import DTO.Person;
import DTO.Student2;

public class DAO2 {
	public static EntityManager entityManager;
	public static Scanner scanner = new Scanner(System.in);
	
	public EntityManager providEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}
	public void saveStudent(Student2 student2) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		College2 college2 = student2.getCollege2();
		
		
		entityManager.persist(student2);
		entityTransaction.commit();
	}
	public void getStudent(int id) {
		// TODO Auto-generated method stub
		Student2 student2 = entityManager.find(Student2.class, id);
		System.out.println(student2);
		
	}
	public void getCollege(int id1) {
		// TODO Auto-generated method stub
		College2 college2 = entityManager.find(College2.class, id1);
		System.out.println(college2);
		
	}
	public void getAllStudent() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select e from Student2 e");
		List<Student2> list = query.getResultList();
		System.out.println(list);
		
	}
	public void getAllColleges() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select e from College2 e");
		List<College2> list = query.getResultList();
		System.out.println(list);
	}
	public void deleteCollege(int id) {
		// TODO Auto-generated method stub
		College2 college2 = entityManager.find(College2.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(college2);
		entityTransaction.commit();
		
	}
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student2 student2= entityManager.find(Student2.class,id);
		College2 college2 = student2.getCollege2();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		//entityManager.remove(college2);
		entityManager.remove(student2);
		entityTransaction.commit();
		
	}
	public void updateStudent(int id) {
		// TODO Auto-generated method stub
		Student2 student2= entityManager.find(Student2.class,id);
		College2 college2 = student2.getCollege2();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("Enter new Name");
		String name = DAO2.scanner.next();
		System.out.println("Enter new Phone");
		long phone = DAO2.scanner.nextLong();
		System.out.println("Enter new Address");
		String address = DAO2.scanner.next();
		student2.setAddress(address);
		student2.setName(name);
		student2.setPhone(phone);
		entityTransaction.begin();
		//entityManager.remove(college2);
		entityManager.merge(student2);
		entityTransaction.commit();
	}
	public void updateCollege(int id5) {
		// TODO Auto-generated method stub
		College2 college2 = entityManager.find(College2.class, id5);
		System.out.println("Enter new College name: ");
		String name = DAO2.scanner.next();
		System.out.println("Enter new College fees: ");
		double fees = DAO2.scanner.nextDouble();
		System.out.println("Enter new College location: ");
		String location = DAO2.scanner.next();
		college2.setFees(fees);
		college2.setLocation(location);
		college2.setName(name);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(college2);
		entityTransaction.commit();
	}
}
