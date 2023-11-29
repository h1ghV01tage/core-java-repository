package corejava;

//This class demonstrates that the equality operator compares the object references and 
//not the data contained in the objects
//the solution would be to use the equals method which does the same unless overridden to compare based on data
//the first two if conditions return based on comparison of obj references
//This is an example of how two objects should not be compared for equality

public class TestEquality1 {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Martinez", "Anthony");
		Employee employee2 = new Employee("Martinez", "Anthony");
		
		if(employee1 == employee2) {
			System.out.println("They are the same");
		}
		else {
			System.out.println("They are different");
		}
		
		/*
		 * 
		 */
		if(employee1.equals(employee2)) {
			System.out.println("They are the same");
		}
		else {
			System.out.println("They are different");
		}
		
		
	}
	
}
