package corejava;

import java.util.Scanner;

public class CarWashApp {

	public static void main(String[] args) {
		
		System.out.println("HighVoltage Car Wash!");
		System.out.println("Please select package a - e");
		Scanner scanner = new Scanner(System.in);
		String scanned = scanner.next();
		char key = scanned.charAt(0);
		String desire = "";
		switch (key) {
			case 'A':
			case 'a':
			desire = PackageA();
			break;
			
			case 'B':
			case 'b':
			desire = PackageB();
			break;
			
			case 'c':
			case 'C':
			desire = PackageC();
			break;
			
			case 'D':
			case 'd':
			desire = PackageD();
			break;
			
			case 'E':
			case 'e':
			desire = PackageE();
			break;
			
			default:
				desire = "Please select a package";
				break;
		}
		
		System.out.println("Thank you for selecting " + desire);
		
	}
	
	public static String PackageA() {
		return "Wash, Vacc and handDry"; 
	}
	
	public static String PackageB() {
		return "Wash, Vacc and handDry " + "WAX"; 
	}
	
	public static String PackageC() {
		return "Wash, Vacc and handDry , Wax " + "Leather / vinyl treatment"; 
	}
	
	public static String PackageD() {
		return "Wash, Vacc and handDry , Wax, Leather / vinyl treatment " + "Tire treatment"; 
	}
	
	public static String PackageE() {
		return "Wash, Vacc and handDry, wax, leather / vinyl treatment, tire treatment " + "new-car scent" ; 
	}
}
