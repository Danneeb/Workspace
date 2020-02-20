package db222pt_assign3;

public class DateMain {

	public static void main(String[] args) {

		DateFormat date = new DateFormat(1977,5,30,'!','l');
		DateFormat date2 = new DateFormat();

		date2.setYear(1980);
		date2.setMonth(5);
		date2.setDay(17);
		date2.setPunct('/');
		date2.setFormat('l');

		DateFormat date3 = new DateFormat(1983, 12, 24, '-', 'm');
		DateFormat date4 = new DateFormat(1999, 13, 34, '-', 'm');

		System.out.println(date.getDate(false));
		System.out.println(date2.getDate(true));
		System.out.println(date3.getDate(false));
		System.out.println(date4.getDate(true));

	}

}
