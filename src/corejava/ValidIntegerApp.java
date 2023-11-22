package corejava;

import java.util.InputMismatchException;
import java.util.Scanner;

//This program uses a method to get a valid integer from the user
//if the user enters a value that isn't a valid integer
//the catch block catches the error and forces the loop to repeat
public class ValidIntegerApp {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer");
		int i = getAnInteger();
		System.out.println("You entered " + i);
		
	}

	private static int getAnInteger() {
		// TODO Auto-generated method stub
		while(true) {
		
			try {
				
				return scanner.nextInt();
				
			}
			
			catch(InputMismatchException e) {
				
				scanner.next();
				System.out.println("That's not an integer, try again !");
				
			}
			
		}
		
		
	}
	
	
	
	
	
}
