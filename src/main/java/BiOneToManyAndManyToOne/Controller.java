package BiOneToManyAndManyToOne;

import java.util.ArrayList;
import java.util.List;

import BiDTO.CompanyBi1Many;
import BiDTO.EmpBi1Many;

public class Controller {
	public static void main(String[] args) {
		CompanyBi1ToManyDAO.entityManager = CompanyBi1ToManyDAO.getEntityManager();
		CompanyBi1ToManyDAO companyBi1ToManyDAO = new CompanyBi1ToManyDAO();
		EmpBi1ToManyDAO empBi1ToManyDAO = new EmpBi1ToManyDAO();
		CompanyBi1Many companyBi1Many = new CompanyBi1Many();
		while(true) {
			System.out.println("1. save Company 10.exit");
			switch (companyBi1ToManyDAO.scanner.nextInt()) {
			case 1:
				System.out.println("Enter name of company:");
				String cName = companyBi1ToManyDAO.scanner.next();
				System.out.println("Enter Gst");
				long cgst = companyBi1ToManyDAO.scanner.nextLong();
				List<EmpBi1Many> list = new ArrayList<EmpBi1Many>();
				int i=1;
				while(i>0) {
					System.out.println("1. Add employee 2. Done adding employees");
					switch (companyBi1ToManyDAO.scanner.nextInt()) {
					case 1:
						System.out.println("Enter name of emp:");
						String empName = companyBi1ToManyDAO.scanner.next();
						System.out.println("Enter phone of emp:");
						long emPhone = companyBi1ToManyDAO.scanner.nextLong();
						System.out.println("Enter address of emp");
						String empAddress = companyBi1ToManyDAO.scanner.next();
						EmpBi1Many empBi1Many = new EmpBi1Many(empName, emPhone, empAddress,companyBi1Many);
						list.add(empBi1Many);
						break;
					case 2:
						i=0;
						break;
					
					}
					
				}
				companyBi1Many.setName(cName);
				companyBi1Many.setGst(cgst);
				companyBi1Many.setList(list);
				
				companyBi1ToManyDAO.savecompany(companyBi1Many);
				break;
			case 2:
				
				break;
			case 10:
				
				return;

		
			}
		}
	}
}
