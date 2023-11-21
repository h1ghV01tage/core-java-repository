package corejava;

import java.util.Scanner;

//this program plays a betting game, gets amt of user's bet from console
//bet amt should be whole dollars
//bet amt has to be more than amt he has in the bank
//bet amt can't be negative or zero
public class GetABetApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int betAmt = 0;
		int bank = 1000;
		boolean validBet;
		do {
			validBet = true;
			System.out.println("Enter your bet");
			betAmt = scanner.nextInt();
			if((betAmt <= 0) || (betAmt > bank)) {
				validBet = false;
				System.out.println("You gotta be kidding me");
				
			}
		} while(!validBet);
		System.out.println("Your money is good");	
		
		
	}
	
}
