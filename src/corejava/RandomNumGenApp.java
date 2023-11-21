package corejava;


//get a random num in the range 1 to 10 implementing a value returning method
public class RandomNumGenApp {

	public static void main(String[] args) {
	
		int number = getRandomNumber();
		System.out.println(number);
		
	}

	private static int getRandomNumber() {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random() * 10) + 1;
		
		return num;
		
	}
	
	
	
	
}
