package corejava;

public class EnumTest {

	enum CardSuit{HEARTS, SPADES, CLUBS, DIAMONDS}
	
	public static void main(String[] args) {
		
		CardSuit suit;
		suit = CardSuit.HEARTS;
		System.out.println(suit);
	}
	
}
