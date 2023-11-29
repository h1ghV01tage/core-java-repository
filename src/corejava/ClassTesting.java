package corejava;

//This application tests the class class :D
//we will determine if the two objects are of the same type
public class ClassTesting {
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		Class c = employee.getClass();
		
		Employee hourlyEmployee = new HourlyEmployee();
		Class c1 = hourlyEmployee.getClass();
		
		
		Object o1 = new Employee();
		Object o2 = new HourlyEmployee();
		
		if(o1.getClass() == o2.getClass()) {
			System.out.println("They are the same");
		}
		else {
			System.out.println("They aren't same");
		}
		
		if(employee.getClass().getName().equals("Employee")) {
			System.out.println("This is an employee object");
		}
		
		Object o = "Hello World";
		if(o instanceof String) {
			System.out.println("is a string");
		}
		else {
			System.out.println("not a string");
		}
		
	}
	
	
}
