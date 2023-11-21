package corejava;

import java.text.NumberFormat;

public class NumFormatApp {

	public static void main(String[] args) {
		
		//format a currency
		double salesTax = 2.426;
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		System.out.println(numberFormat.format(salesTax));
		
		//format a percentage
		double grade = .92;
		NumberFormat numFormat = NumberFormat.getPercentInstance();
		System.out.println(numFormat.format(grade));
		
		//
		
	}
}
