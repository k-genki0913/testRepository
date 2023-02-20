package test;

public class Discount {
	public double sexCheck(String sex) {
		if(sex == "f") {
			//女性なら２割引
			return 0.2;
		} else {
			//男性なら1割引
			return 0.1;
		}
	}
	
	public boolean priceCheck(int price) {
		if(price >= 50000) {
			return true;
		} else {
			return false;
		}
	}
	
	public int ageCheck(int age) {
		if(age < 20) {
			return 3000;
		} else {
			return 0;
		}
	}
}
