package corejava;

import java.util.Scanner;

public class MarblesApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//declarations
		int numOfMarbles;
		int numOfChildren;
		int marblesPerChild;
		int marblesLeftOver;
		
		//get the input data
		System.out.println("Welcome to the marbles divvy-upper");
		System.out.println("Enter the number of marbkes");
		numOfMarbles = sc.nextInt();
		System.out.println("Number of children");
		numOfChildren = sc.nextInt();
		
		//calculate the results
		marblesPerChild = numOfMarbles / numOfChildren;
		marblesLeftOver = numOfMarbles % numOfChildren;
		
		//print the results
		System.out.println("Total number of marbles per child " + marblesPerChild);
		System.out.println("Left Over marbles " + marblesLeftOver);
		
	}
	
}
