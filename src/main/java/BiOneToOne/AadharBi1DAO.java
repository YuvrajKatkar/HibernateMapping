package BiOneToOne;

import javax.persistence.Query;

import BiDTO.AadharCardBi1;

public class AadharBi1DAO {

	public void display(int id1) {
		// TODO Auto-generated method stub
		AadharCardBi1 aadharCardBi1 = PersonBi1DAO.entityManager.find(AadharCardBi1.class, id1);
		System.out.println(aadharCardBi1);
		
	}

	public void getAllAadhar() {
		// TODO Auto-generated method stub
		Query query =  PersonBi1DAO.entityManager.createQuery("select a from AadharCardBi1 a");
		System.out.println(query.getResultList());
		
	}

}
