package BiOneToOne;

import BiDTO.AadharCardBi1;
import BiDTO.PersonBi1;

public class Controller {
	public static void main(String[] args) {
		PersonBi1DAO.entityManager=PersonBi1DAO.getEntityManager();
		PersonBi1DAO personBi1DAO = new PersonBi1DAO();
		AadharBi1DAO aadharBi1DAO = new AadharBi1DAO();
		while(true) {
			System.out.println("1. CreatePerson 2.Display Person 3.Display Aadhar 4.GetAllPerson 5.GetAllAadhar \n"
					+ "6. Remove person and his aadharcard 7. Update Person and Aadharcard 10.exit");
			switch (PersonBi1DAO.scanner.nextInt()) {
			case 1:
				System.out.println("Enter name of Person: ");
				String name = PersonBi1DAO.scanner.next();
				System.out.println("Enter phone number of Person: ");
				long phone = PersonBi1DAO.scanner.nextLong();
				System.out.println("Enter address of Person: ");
				String address = PersonBi1DAO.scanner.next();
				
				PersonBi1 personBi1 = new PersonBi1(name, address, phone);
				
				System.out.println("Enter name of Aadhar card: ");
				String aadharName = PersonBi1DAO.scanner.next();
				System.out.println("Enter address of Person: ");
				String aadharAddress = PersonBi1DAO.scanner.next();
				
				AadharCardBi1 aadharCardBi1 = new AadharCardBi1(aadharName, aadharAddress);
				
				personBi1.setAadharCardBi1(aadharCardBi1);
				aadharCardBi1.setPersonBi1(personBi1);
				
				personBi1DAO.savePerson(personBi1);
				break;
				
			case 2:
				System.out.println("Enter the id you want to display");
				int id = PersonBi1DAO.scanner.nextInt();
				personBi1DAO.display(id);
				break;
				
			case 3:
				System.out.println("Enter the id you want to display");
				int id1 = PersonBi1DAO.scanner.nextInt();
				aadharBi1DAO.display(id1);
				break;
				
			case 4:
				personBi1DAO.getAllPersons();
				break;
			case 5:
				aadharBi1DAO.getAllAadhar();
				break;
			case 6:
				System.out.println("Enter id of person to remove his details");
				int id3 = personBi1DAO.scanner.nextInt();
				personBi1DAO.deletePersonAndAadhar(id3);
				break;
			case 7:
				System.out.println("Enter id of person to update his details");
				int id4 = personBi1DAO.scanner.nextInt();
				 PersonBi1 personBi12=personBi1DAO.entityManager.find(PersonBi1.class, id4);
				 personBi1DAO.updatePersonAndAadhar(personBi12);
				
				break;
			case 10:
				return;
			default:
				System.out.println("Enter a vaild number option");
				break;
			}
		}
	}
}
