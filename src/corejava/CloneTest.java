package corejava;
 
//implementing the cloning method offered by cloneable interface

public class CloneTest {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp1 = new Employee("Martinez", "Anthony");
		emp1.setSalary(40000.0);
		
		Employee emp2 = (Employee)emp1.clone();
		emp1.setLastName("Smith");
		System.out.println(emp1);
		System.out.println(emp2);
		
		
	}
	
	
	
}
