package corejava;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int magicNumber = 0;
		Random random = new Random();
		int randomNumber = 0;
		String repeatMagic = "";
		//initial welcome message
		System.out.println("Let's play a guessing game");
		
		//looped prompt
		//true at first and can be true or false after
		boolean playAgain = true;
		
		//start a play loop
		while(playAgain) {
			
			System.out.println("I'm thinking of a number between 1 and 10");
			System.out.println();
			System.out.println("What do you think it is?"); 
			
			magicNumber = scanner.nextInt();
			
			if(magicNumber >= 1 && magicNumber <= 10) {
				
				randomNumber = random.nextInt(10) + 1;  
				
				if(magicNumber == randomNumber) {
					System.out.println("You're right ! Play again ? (Y / N)");
					repeatMagic = scanner.next();
					
					if(repeatMagic.equalsIgnoreCase("y")) {
						
						playAgain = true;
						
					}
					
					else {
						playAgain = false;
					}
					
				}		
				else {
					
					System.out.println("You're wrong! the number was " + randomNumber);
					System.out.println("Play Again? (Y / N)");
					repeatMagic = scanner.next();
					
					if (repeatMagic.equalsIgnoreCase("y")) {

						playAgain = true;

					}

					else {
						playAgain = false;
					}	
				}
			}
			else {
				System.out.println("Please pick a number in the range 1 - 10");
				continue;
			}
		}
	}
}
