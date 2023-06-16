package oneToOne;

public class Controller {
	public static void main(String[] args) {
		DAO dao = new DAO();
		DAO.entityManager = dao.providEntityManager();
		while(true) {
			System.out.println("1. Insert 2.find person 3.Read all records 4. delete 5. exit");
			System.out.println("6. Update Person");
			switch (DAO.scanner.nextInt()) {
			case 1:
				dao.insertRecord();
				break;	
			case 2:
				System.out.println("Enter the id you want to find");
				int id = dao.scanner.nextInt();
				dao.findPerson(id);
			case 3:
				dao.displayAll();break;
			case 4: 
				dao.deletePerson();break;
			case 5:
				return;
			case 6:
				System.out.println("Enter person card id to update");
				int id1 = dao.scanner.nextInt();
				dao.updatePerson(id1);
				
			
			}
		}
		
	}
}
