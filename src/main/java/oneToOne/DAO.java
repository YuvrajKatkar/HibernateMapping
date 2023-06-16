package oneToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.AadharCard;
import DTO.Person;

public class DAO {
	public static EntityManager entityManager;
	public static Scanner scanner = new Scanner(System.in);
	public static AadharCard aadharCard;
	public static Person person;
	public EntityManager providEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}
	public  void insertRecord() {
		System.out.println("Enter name of AadharCard: ");
		String aName = scanner.next();
		System.out.println("Enter id of AadharCard: ");
		int aId = scanner.nextInt();
		System.out.println("Enter address of AadharCard: ");
		String aAddress = scanner.next();
		 aadharCard = new AadharCard(aId, aName, aAddress);
		System.out.println("Enter name of Person: ");
		String pName = scanner.next();
		System.out.println("Enter id of Person: ");
		int pId = scanner.nextInt();
		System.out.println("Enter address of Person: ");
		String pAddress = scanner.next();
		 person = new Person(pId, pName, pAddress, aadharCard);
		
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}
	public void findPerson(int id) {
		Person person= entityManager.find(Person.class, id);
		System.out.println(person);
	}
	public void displayAll() {
		Query query= entityManager.createQuery("select e from Person e");
		List<Person> list= query.getResultList();
		System.out.println(list);
	}
	public void deletePerson() {
		System.out.println("Enter person card id to delete");
		int id = scanner.nextInt();
		person = entityManager.find(Person.class, id);
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
	}
	public void updatePerson(int id) {
		
		person = entityManager.find(Person.class, id);
		if(person!=null) {
			int aid = person.getAadharCard().getId();
			EntityTransaction entityTransaction= entityManager.getTransaction();
			AadharCard addAadharCard= new AadharCard();
			addAadharCard.setName("qwer");
			person.setAadharCard(addAadharCard);
			person.setAadharCard(aadharCard);
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}
		
	}
}
