package corejava;

//this application implements cloning the object employee
public class CloneTest2 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp1 = new Employee("Anthony", "Martial");
		emp1.setSalary(40000.00);
		emp1.address = new Address("1300 N First St", "Fresno", "CA", "93702");
		Employee emp2 = (Employee) emp1.clone();
		
		System.out.println(
				"*** after cloning ***\n");
		printEmployee(emp1);
		printEmployee(emp2);
		emp2.setLastName("Smith");
		emp2.address = new Address("123 four st", "sacramento", "CA", "45789");
		
		System.out.println(
				"*** after changing ***\n");
		printEmployee(emp1);
		printEmployee(emp2);
		
	}

	private static void printEmployee(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp.getFirstName()
				+ " " + emp.getLastName());
		System.out.println(emp.address.getAddress());
		System.out.println("Salary " + emp.getSalary());
		System.out.println();
	}
	
}
