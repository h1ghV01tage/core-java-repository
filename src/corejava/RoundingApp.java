package corejava;

public class RoundingApp {

	public static void main(String[] args) {
		
		double x = 29.4;
		double y = 94.5;
		double z = -19.3;
		
		System.out.println(Math.round(x));
		System.out.println(Math.ceil(x));
		System.out.println(Math.floor(x));
		System.out.println();
		
		System.out.println(Math.round(y));
		System.out.println(Math.ceil(y));
		System.out.println(Math.floor(y));
		System.out.println();
		
		System.out.println(Math.round(z));
		System.out.println(Math.ceil(z));
		System.out.println(Math.floor(z));
		
		System.out.println();
		System.out.println(Math.rint(x));
		System.out.println(Math.rint(x));
		System.out.println(Math.rint(x));
		
		System.out.println();
		System.out.println(Math.rint(y));
		System.out.println(Math.rint(y));
		System.out.println(Math.rint(y));
		
	}
	
}
