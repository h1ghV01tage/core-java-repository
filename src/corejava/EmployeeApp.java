package corejava;

//this class is created to demonstrate cloning in java
public class EmployeeApp {

	public static void main(String[] args) {
		
		//This is not cloning
		Employee emp1 = new Employee("Martha", "Stewart");
		Employee emp2 = emp1;
		System.out.println(emp2);
		
		emp1.setLastName("Washington");
		emp2.setLastName("Graham");
		System.out.println(emp1.getLastName());
		
		//This is cloning but we are reinventing the wheel
		Employee employee1 = new Employee("Jack", "Daniels"); //uses a Ctor that takes two string param
		Employee employee2 = new Employee(); //uses a ctor that doesn't take any param
		
		//set the last name and first name
		employee2.setLastName(employee1.getLastName());
		employee2.setFirstName(employee1.getFirstName());
		
		//cloning without reinventing the wheel
		//see class: CloneTest ;)
		
		
		
		
	}
	
	
	
}
