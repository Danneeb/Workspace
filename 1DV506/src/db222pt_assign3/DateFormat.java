package db222pt_assign3;



public class DateFormat {
	//variabler
	private int year = 0;
	private int month = 0;
	private int day = 0;
	private char punct;
	private char format;


	public DateFormat() {}

	public 	DateFormat(int n, int b, int x, char a,char c ) {
		setDate(n,b,x,a,c);
	}
	//getters och setters
	public void setDate(int Year, int Month, int Day, char i, char b) {

		year = Year;
		month = Month;
		day = Day;
		if(i == '!') {
			punct = ' ';
		}else punct = i;

		format = b;

	}

	public void setYear(int theYear) {
		year = theYear;

	}
	public int getYear() {
		return year;
	}
	public void setMonth(int theMonth) {
		month = theMonth;
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int theDay) {
		day = theDay;
	}
	public int getDay() {
		return day;
	}
	public void setPunct(char thePunct) {
		if(thePunct == '!') {
			punct = ' ';
		}else punct = thePunct;

	}
	public char getPunct() {
		return punct;
	}
	public String setDate(String theDate) {
		return theDate;
	}

	public void setFormat(char theFormat) {
		format = theFormat;
	}



	public String getDate(boolean fullYear) {
		//H�r b�rjar jag kolla om anv�ndaren vill ha hela �ret eller bara sista 2.

		//om anv�ndaren bara vill ha det sista 2 s� b�rjar programmet h�r
		if(fullYear == false) {
			String tmpyear = Integer.toString(year);
			char y1 = tmpyear.charAt(2);
			char y2 = tmpyear.charAt(3);


			//kollar om anv�ndaren har anv�nt korrekt input. 
			if(month <=12 && month >=1 && year > 1900 && year <2100 && day>=1 && day<=31) {
				//Om m�nad �r 10 eller �ver, s� kommer det inte att printas en nolla f�re m�nad.
				if(month >=10 ) {
					if(format == 'b') {
						System.out.print(y1+""+y2+""+punct+""+month+""+punct+""+day);
					}
					if(format == 'l') {
						System.out.print(day+""+punct+""+month+""+punct+""+y1+""+y2);
					}
					if(format == 'm') {
						System.out.print(month+""+punct+""+day+""+punct+""+y1+""+y2);
					}

				}	

			}
			//om m�nad �r mindre �n 10, s� kommer det att printas en nolla f�re m�nad
			if(month<10) {
				if(format == 'b') {
					System.out.print(y1+""+y2+""+punct+"0"+month+""+punct+""+day);
				}
				if(format == 'l') {
					System.out.print(day+""+punct+"0"+month+""+punct+""+y1+""+y2);
				}
				if(format == 'm') {
					System.out.print("0"+month+""+punct+""+day+""+punct+""+y1+""+y2);
				}

			}
			//om anv�ndaren har gett fel input s� kommer programmet att printa "invalid date"
			if(month <= 0 || month >=13 || year <= 1900 || year >= 2200 || day<=0 || day>=32) {
				System.out.print("invalid date");
			}	

		}
		//om anv�ndaren vill ha hela �r. s� b�rjar programmet h�r.
		if(fullYear == true) {
			if(month <=12 && month >=1 && year > 1900 && year < 2100 && day>=1 && day<=31) {
				//Kollar om vi ska printa en nolla f�re m�nad
				if(month>=10) {
					if(format == 'b') {
						System.out.print(year+""+punct+""+month+""+punct+""+day);
					}
					if(format == 'l') {
						System.out.print(day+""+punct+""+month+""+punct+""+year);
					}
					if(format == 'm') {
						System.out.print(month+""+punct+""+day+""+punct+""+year);
					}

				}	

			}
			//om m�nad �r mindre �n 10, s� kommer det att printas en nolla f�re m�nad
			if(month <10) {
				if(format == 'b') {
					System.out.print(year+""+punct+"0"+month+""+punct+""+day);
				}
				if(format == 'l') {
					System.out.print(day+""+punct+"0"+month+""+punct+""+year);
				}
				if(format == 'm') {
					System.out.print("0"+month+""+punct+""+day+""+punct+""+year);
				}

			}
			//om fel indata ges s� kommer det printas ett felmeddelande.
			if(month < 1 || month >=12 || year < 1900 || year > 2200 || day<1 || day>31) {
				System.out.print("invalid date");
			}
		}
		String text = " ";
		return text;
	}



}
