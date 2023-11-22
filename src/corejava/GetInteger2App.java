package corejava;

import java.util.Scanner;

//validate if the given user input is an integer
public class GetInteger2App {

	//get the user input
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer number");
		int i = isAnInteger();
		System.out.println("You have entered " + i);
		
	}

	private static int isAnInteger() {
		// TODO Auto-generated method stub
		while (!scanner.hasNextInt()) {
			
			scanner.next();
			System.out.println("Please enter an integer number");
			
		}
		
		return scanner.nextInt();
	}

	
	
}
