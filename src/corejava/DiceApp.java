package corejava;

import java.util.Random;

//WAP to display 100 random rolls in a dice

public class DiceApp {

	public static void main(String[] args) {
		
		//declare an integer to hold the dice roll value
		int diceroll = 0;
		
		//instantiate the random class
		Random random = new Random();
		
		//loop 100 times
		for(int i =0; i < 100; i++) {
			
			//get a random integer inclusive (+1)
			diceroll = random.nextInt(6) + 1;
			
			//print to standard output
			System.out.println(diceroll);
		}

	}
}
