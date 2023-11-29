package corejava;

//we first test the toString method which returns the object
//then we override the toString method in the employee class to display the classname and the properties of the objects
public class TestToString {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Martin", "Anthony");
		System.out.println(employee.toString());
		
	}
	
}

