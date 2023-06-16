package oneToMany;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.AadharCard;
import DTO.Company1;
import DTO.Employee1;
import DTO.Person;

public class DAO1 {
	public static EntityManager entityManager;
	public static Scanner scanner = new Scanner(System.in);
	public static AadharCard aadharCard;
	public static Person person;
	public EntityManager providEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}
	public void saveCompany(Company1 company1) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		for (Employee1 employee1 : company1.getEmployee1s()) {
			entityManager.persist(employee1);
		}
		entityManager.persist(company1);
		entityTransaction.commit();
	}
	public void getCompany(int id) {
		Company1 company1= entityManager.find(Company1.class, id);
		System.out.println(company1);
	}
	public void getAllCompany() {
		 Query query =entityManager.createQuery("select e from Company1 e");
		 System.out.println(query.getResultList());
	}
	public void deleteCompany(int id) {
		Company1 company1 = entityManager.find(Company1.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		for(Employee1 employee1 :company1.getEmployee1s()) {
			entityManager.remove(employee1);
		}
		entityManager.remove(company1);
		entityTransaction.commit();
	}
	public void updateCompany(int id) {
		Company1 company1= entityManager.find(Company1.class, id);
		if(company1!=null) {
			
		}
	}
}
