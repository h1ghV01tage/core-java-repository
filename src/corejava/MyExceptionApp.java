package corejava;

//This application focuses on creating a method that throws exception
public class MyExceptionApp {

	public static void main(String[] args) {
		
		try {
			
			doSomething(true);
			
		}
		catch(Exception e) {
			System.out.println("Exception!");
		}
		
	}

	private static void doSomething(boolean b) throws Exception {
		// TODO Auto-generated method stub
		if(b)
			throw new Exception();
		
		}
	
}
