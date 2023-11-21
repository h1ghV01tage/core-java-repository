package corejava;

import java.util.Scanner;

//write a program that loops infinitely until user says stop 
public class OctoPhobiaApp {

	public static void main(String[] args) {
		
		int num = 2;
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.println(num);
			System.out.println("Keep Counting" + "Y or N");
			input = scanner.next();
			if(input.equalsIgnoreCase("N")) break;
			
			num++;
		}
		
	}
	
	
}
