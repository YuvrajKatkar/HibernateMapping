package manyToOne;

import javax.persistence.EntityTransaction;
import javax.swing.undo.AbstractUndoableEdit;

import DTO.College2;
import DTO.Student2;

public class Controller2 {
	public static void main(String[] args) {
		DAO2 dao2 = new DAO2();
		DAO2.entityManager = dao2.providEntityManager();
		while(true) {
			System.out.println("1. SavePerson 2.DisplayStudent 3.DisplayAllStudent 4.DisplayCollege 5.DisplayAllCollege "
					+ "\n6. deleteCollege 7.deleteStudent 8.UpdateCollege 9. UpdateStudent 10.exit");
			switch (DAO2.scanner.nextInt()) {
			case 1:
				System.out.println("Enter Student  name:");
				String name = DAO2.scanner.next();
				System.out.println("Enter Student  phone:");
				long phone = DAO2.scanner.nextLong();
				System.out.println("Enter Student  address:");
				String address = DAO2.scanner.next();
				System.out.println("Do you go to college which is registered in the database");
				System.out.println("1.Yes 2.No");
				College2 college2=null;
				switch (DAO2.scanner.nextInt()) {
				case 1:
					System.out.println("Enter the college id:");
					int id = DAO2.scanner.nextInt();
					 college2 = DAO2.entityManager.find(College2.class, id);
					break;

				case 2:
					System.out.println("Enter College  name:");
					String cName = DAO2.scanner.next();
					System.out.println("Enter College  fees:");
					double fees = DAO2.scanner.nextDouble();
					System.out.println("Enter College  location:");
					String cLocation = DAO2.scanner.next();
					college2 = new College2(cName, fees, cLocation);
					EntityTransaction entityTransaction= DAO2.entityManager.getTransaction();
					entityTransaction.begin();
					DAO2.entityManager.persist(college2);
					entityTransaction.commit();
					break;
				}
				Student2 student2 = new Student2(name, phone, address, college2);
				dao2.saveStudent(student2);
				break;
			case 2:
				System.out.println("Enter student id:");
				int id = DAO2.scanner.nextInt();
				dao2.getStudent(id);
				break;
			case 4:
				System.out.println("Enter College id:");
				int id1 = DAO2.scanner.nextInt();
				dao2.getCollege(id1);
				break;
			case 3:
				dao2.getAllStudent();
				break;
			case 5:
				dao2.getAllColleges();
				break;
			case 6:
				System.out.println("The college should not contain any students");
				System.out.println("Enter id of college you want to delete");
				int id2=DAO2.scanner.nextInt();
				dao2.deleteCollege(id2);
				break;
			case 7: 
				System.out.println("Enter id of Student you want to delete");
				int id3 = DAO2.scanner.nextInt();
				dao2.deleteStudent(id3);
				break;
			case 8:
				System.out.println("Enter id of College you want to update");
				int id5 = DAO2.scanner.nextInt();
				dao2.updateCollege(id5);
				break;
			case 9:
				System.out.println("Enter id of Student you want to update");
				int id4 = DAO2.scanner.nextInt();
				dao2.updateStudent(id4);
				break;
			case 10:
				return;
			}
		}
	}
}
