package corejava;

import java.util.Scanner;

//This program improvises the guessing game
//by using methods to eliminate confusing code piling
//up in the main method

public class GuessingGameImprovMethods {
	
	//global variables
	
	
	public static void main(String[] args) {
			
		
			do {
				roundOfGame();
			}
			
			while(askForAnotherRound());
		
	}

	private static void roundOfGame() {
		// TODO Auto-generated method stub
		int randomNumber = getRandomNumber();
		//greet the user
		greetUser();
		//get guess
		int guessNumber = getGuess();
		//if the guess is true, play a round of
			//play a round of game
			if(guessNumber == randomNumber) {
				System.out.println("Woah! Incredible you guessed the right number");
			}
			
			else {
				System.out.println("Oops! Wrong answer. Would you like to play another round of game (Y / N)");

			}
		
	}

	private static void greetUser() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the guessing game");
		System.out.println("Please enter a number between 1 to 10");
	}

	private static boolean askForAnotherRound() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			String userSaid = scanner.next();
			if(userSaid.equalsIgnoreCase("y")) 
				return true;
			else if(userSaid.equalsIgnoreCase("n"))
				return false;
			
		}

	}


	private static int getGuess() {
		// TODO Auto-generated method stub
		
		while(true) {
			int guessNumber = 0;
			Scanner scanner = new Scanner(System.in);
			guessNumber = scanner.nextInt();
			//validate the guess number
			if(guessNumber >= 1 && guessNumber <= 10) {
				return guessNumber;
			}
			else {
				System.out.println("I said betn 1 and 10");
			}
		}
	
	}

	
	private static int getRandomNumber() {
		// TODO Auto-generated method stub
		int randomNumber = (int)Math.random() * 10 + 1;
		return randomNumber;
	}
	
	
	
}
