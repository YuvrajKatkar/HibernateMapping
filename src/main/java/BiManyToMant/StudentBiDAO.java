package BiManyToMant;

import java.util.Iterator;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import BiDTO.CourseBi;
import BiDTO.StudentBi;
import DTO.Student3;
import ManyToMany.Student3Dao;

public class StudentBiDAO {
	static Scanner scanner=new Scanner(System.in);
	static EntityManager entityManager;
	static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}
	public static void saveStudent(StudentBi student3) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = StudentBiDAO.entityManager.getTransaction();
		entityTransaction.begin();
//		for(CourseBi courseBi :student3.getList()) {
//			entityManager.persist(courseBi);
//		}
		StudentBiDAO.entityManager.persist(student3);
		entityTransaction.commit();
		
		
	}

}
