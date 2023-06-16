package BiOneToOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import BiDTO.AadharCardBi1;
import BiDTO.PersonBi1;

public class PersonBi1DAO {
	static EntityManager entityManager;
	static Scanner scanner = new Scanner(System.in);

	public static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}

	public void savePerson(PersonBi1 personBi1) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		AadharCardBi1 aadharCardBi1 = personBi1.getAadharCardBi1();
		entityManager.persist(personBi1);
		entityManager.persist(aadharCardBi1);
		entityTransaction.commit();
	}

	public void display(int id) {
		// TODO Auto-generated method stub
		PersonBi1 personBi1 = entityManager.find(PersonBi1.class, id);
		System.out.println(personBi1);

	}

	public void getAllPersons() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select p from PersonBi1 p");
		System.out.println(query.getResultList());
	}

	public void deletePersonAndAadhar(int id3) {
		// TODO Auto-generated method stub
		PersonBi1 personBi1 = entityManager.find(PersonBi1.class, id3);
		if (personBi1 != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(personBi1);
			entityTransaction.commit();
		}
	}

	public void updatePersonAndAadhar(PersonBi1 personBi12) {
		// TODO Auto-generated method stub
		PersonBi1 personBi1DB = entityManager.find(PersonBi1.class, personBi12.getId());
		if (personBi1DB != null) {
			AadharCardBi1 aadharCardBi1 = personBi12.getAadharCardBi1();
			System.out.println("Enter new name of person:");
			String namePerson = scanner.next();
			System.out.println("Enter new Aadhar card name");
			String nameAadhar = scanner.next();
			aadharCardBi1.setName(nameAadhar);
			// Imp step is to set id or else id will be auto generated and new aadhar will
			// be inserted
			aadharCardBi1.setId(aadharCardBi1.getId());
			personBi1DB.setName(namePerson);
			personBi1DB.setAadharCardBi1(aadharCardBi1);
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(personBi1DB);
			entityTransaction.commit();
		} else {
			System.out.println("Person not found in database");
		}

	}

}
