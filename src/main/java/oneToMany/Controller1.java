package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import DTO.Company1;
import DTO.Employee1;

public class Controller1 {
	public static void main(String[] args) {
		DAO1 dao1 = new DAO1();
		DAO1.entityManager=   dao1.providEntityManager();
		while(true) {
			System.out.println("1. save company 2. GetCompany 3. Display all companies \n4. Delete company based on ID 10.exit");
			List<Employee1> employee1s = new ArrayList<Employee1>();
			switch (DAO1.scanner.nextInt()) {
			case 1:
				int i=0;
				while(i<1) {
					System.out.println("1.Add employee 2.Added All Employees");
					switch (DAO1.scanner.nextInt()) {
					case 1:
						System.out.println("Enter employee name");
						String name = DAO1.scanner.next();
						System.out.println("Enter employee address");
						String address = DAO1.scanner.next();
						System.out.println("Enter employee phone");
						long phone = DAO1.scanner.nextLong();
						Employee1 employee1 = new Employee1(name, address, phone);
						employee1s.add(employee1);
						break;

					case 2:
						i=1;
						break;
					}
				}
				System.out.println("Enter company name");
				String companyName = DAO1.scanner.next();
				System.out.println("Enter company gst");
				String gstNumber = DAO1.scanner.next();
				Company1 company1 = new Company1(companyName, gstNumber, employee1s);
				dao1.saveCompany(company1);
				break;
			
			case 2: 
				System.out.println("Enter id of Company:");
				dao1.getCompany(DAO1.scanner.nextInt());
				break;
			case 3:
				dao1.getAllCompany();break;
			case 4: 
				System.out.println("Enter the id of company you want to delete");
				int f = DAO1.scanner.nextInt();
				dao1.deleteCompany(f);break;
			case 10:
				return;
			}
		}
	}
}
