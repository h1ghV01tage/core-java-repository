package corejava;

public class LaunchControlApp {

	public static void main(String[] args) {
		
		System.out.println("We are go for launch in T minus");
		for(int count = 10; count >= 0; count--) {
			
			if(count == 8) {
				System.out.println("Ignition sequence start");
			}
			
			System.out.println(count + "...");
			
		}
		
		System.out.println("All engines running!");
		System.out.println("Liftoff! we have a liftoff!");
		
	}
	
}
