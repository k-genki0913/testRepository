package test;

public class MonthCheck {

	static int chkDays(int year, int month) {
		int days = 1; //日
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			//31日の月か？
			days = 31;
		} else if(month == 2) {
			days = Calc.leapYear(year); 
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			//30日の月か？
			days = 30;
		} else {
			System.out.println("該当する年月がありません！");
		}
		return days;
	}

}
