package corejava;

//This program throws an arithmetic exception when divided by zero

public class DivideByZero {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try {
			
			int c = a / b;
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("You can't divide by zero");
			
		}
		
	}
	
}
