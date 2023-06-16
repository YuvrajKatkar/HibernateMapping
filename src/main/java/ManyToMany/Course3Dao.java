package ManyToMany;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import DTO.Course3;

public class Course3Dao {

	public static void saveCourse(Course3 course3) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction = Student3Dao.entityManager.getTransaction();
		entityTransaction.begin();
		Student3Dao.entityManager.persist(course3);
		entityTransaction.commit();
	}

	public Course3 fetchCourse(int id) {
		// TODO Auto-generated method stub
		Course3 course3= Student3Dao.entityManager.find(Course3.class, id);
		return course3;
	}

	public void fetchAllCourses() {
		// TODO Auto-generated method stub
		Query query=Student3Dao.entityManager.createQuery("select e from Course3 e");
		System.out.println(query.getResultList());
	}

	public void updateCourse(int courseId) {
		// TODO Auto-generated method stub
		Course3 course3 = Student3Dao.entityManager.find(Course3.class, courseId);
		System.out.println("Which attribute is to be updated");
		System.out.println("1. Name 2. Fees 3. Duration In Months");
		switch (Student3Dao.scanner.nextInt()) {
		case 1:
			System.out.println("Enter new name of Course");
			String  name=Student3Dao.scanner.next();
			course3.setName(name);
			break;
		case 2:
			System.out.println("Enter new fees of Course");
			long  fees=Student3Dao.scanner.nextLong();
			course3.setFees(fees);
			break;
		case 3:
			System.out.println("Enter new Duration of Course in months");
			double  durationInMonths=Student3Dao.scanner.nextDouble();
			course3.setDurationInMonths(durationInMonths);
			break;
		
		}
		EntityTransaction entityTransaction = Student3Dao.entityManager.getTransaction();
		entityTransaction.begin();
		Student3Dao.entityManager.merge(course3);
		entityTransaction.commit();
		
	}

}
