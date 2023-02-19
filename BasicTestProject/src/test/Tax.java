package test;

public class Tax {
	public int taxIn(int price) {
		double taxRate = 0.1;
		
		int postTax = (int)(price * (1 + taxRate));
		return postTax;
	}
}
