package corejava;

public class HelloApp {
	
	String helloMessage;
	static String helloStaticMessage;
	static final int weekend= 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world !");
		sayStaticHello();
		
		//helloMessage = "Yellow";
		System.out.println("hay low");
		
		//saying hello locally w local variable
		String localHello = "saying hello locally";
		System.out.println(localHello);
		
		//print days in weekend
		daysInWeekend();
		
	}
	
	public static void sayStaticHello() {
		
		helloStaticMessage = "say static hello";
		
		System.out.println(helloStaticMessage);
		
	}
	
	public void sayHello() {
		// TODO Auto-generated method stub
		
		helloMessage = "yellow";
		
		
	}
	
	private static void daysInWeekend() {
		// TODO Auto-generated method stub
		System.out.println(weekend);
	}
}
