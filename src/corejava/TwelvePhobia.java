package corejava;

//This program exits out when it sees number 12 because you know, who isn't afraid of the number 12
public class TwelvePhobia {

	public static void main(String[] args) {
		
		int num = 2; 
		
		while(num <= 20) {
			if(num == 12) continue;
			System.out.println(num);
			num+=2;
		}
		
		
	}
	
}
