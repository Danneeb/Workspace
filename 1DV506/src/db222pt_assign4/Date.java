package db222pt_assign4;

public class Date {
	private int year = 0;
	private int month = 0;
	private int day = 0;


	public Date() {}


	//getters och setter
	public void setYear(int theYear) {
		year = theYear;
		if(year == 0) {
			System.out.println("Bye, bye!");
			System.exit(1);
		}
	}
	public int getYear() {
		if(year <1900 || year > 2200) {
			//Här skickas det en varning om användaren har fel år. samma på alla getters och setters
			throw new IllegalArgumentException("Error: Year must be between 1900 and 2200");
		}
		return year;
	}
	public void setMonth(int theMonth) {
		month = theMonth;
	}
	public int getMonth() {
		if(month < 1 || month > 12) {
			throw new IllegalArgumentException("Error: Month must be between 1 and 12");
		}
		return month;
	}
	public void setDay(int theDay) {
		day = theDay;
	}
	public int getDay() {
		if(day <1 || day > 31) {
			throw new IllegalArgumentException("Error: Day must be between 1 and 31");
		}

		return day;
	}
}
