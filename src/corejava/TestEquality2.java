package corejava;

//This class implements the proper comparison of objects
//the .equals method is over ridden in the employee class

public class TestEquality2 {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Martin", "Anthony");
		Employee employee2 = new Employee("Martin", "Anthony");
		if(employee1.equals(employee2)) {
			System.out.println("same");
		}
		else {
			System.out.println("Different");
		}
		
	}
	
}
