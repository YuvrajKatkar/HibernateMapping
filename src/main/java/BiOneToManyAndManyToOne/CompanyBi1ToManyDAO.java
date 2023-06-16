package BiOneToManyAndManyToOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import BiDTO.CompanyBi1Many;
import BiDTO.EmpBi1Many;

public class CompanyBi1ToManyDAO {
	static EntityManager entityManager;
	static Scanner scanner = new Scanner(System.in);

	public static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("yuvraj").createEntityManager();
	}

	public void savecompany(CompanyBi1Many companyBi1Many) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		for(EmpBi1Many emp:companyBi1Many.getList()) {
			entityManager.persist(emp);
		}
		
		//entityManager.persist(companyBi1Many);
		entityTransaction.commit();
	}
}
