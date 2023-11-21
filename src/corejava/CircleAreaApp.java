package corejava;

import java.util.Scanner;

public class CircleAreaApp {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the circle area calc");
		System.out.println("Enter the radius");
		double r = scanner.nextDouble();
		double area = Math.PI * r * r;
		System.out.println(area);
		
	}
	
}
