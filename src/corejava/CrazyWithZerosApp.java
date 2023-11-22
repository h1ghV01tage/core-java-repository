package corejava;


//This program uses try, catch and finally
//It attempts the division by zero and all the try catch and finally blocks
public class CrazyWithZerosApp {

	public static void main(String[] args) {
		
		int l;
		try {
			
			l = divideTheseNumbers(5, 0);
		}
		catch(Exception e) {
			
			System.out.println("Tried two times and still didn't work");
		}
		
		
		
		
		
	}

	private static int divideTheseNumbers(int i, int j) {
		// TODO Auto-generated method stub
		int k = 0;
		
		try {
			
			k = i / j;
			System.out.println("Great !" + k);
			
		}
		
		catch(Exception e) {
			
			System.out.println("That didn't work 1st time");
			k = i /j;
			System.out.println("Didn't work the second time either");
		}
		
		finally {
			
			System.out.println("Cleaning up the mess");
			
		}
		
		return k;
	}
	
	
	
}
