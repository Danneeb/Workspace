package db222pt_assign2;
import java.util.Scanner;



public class DatumFormat {
	int year = 0;
	int month = 0;
	int day = 0;
	char format;

	public DatumFormat() {}

	public static void changeDate(int year, int month, int day, int format) {
		if(format == 'b') {
			if(month >= 10) {
				System.out.print(year+"/"+month+"/"+day);
			}
			else
				System.out.print(year+"/"+"0"+month+"/"+day);
		}

		if(format == 'l') {
			if(month >=10) {
				System.out.print(day+"/"+month+"/"+year);
			}
			else
				System.out.print(day+"/"+"0"+month+"/"+year);
		}
		if(format == 'm') {
			if(month >= 10) {
				System.out.print(month+"/"+day+"/"+year);
			}
			else
				System.out.print("0"+month+"/"+day+"/"+year);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int f = 0;


		System.out.print("Skriv ett år: ");
		int year = sc.nextInt();

		System.out.print("SKriv en månad (nummer): ");
		int month = sc.nextInt();

		System.out.print("Skriv en dag (nummer): ");
		int day = sc.nextInt();

		System.out.print("ange format (b/l/m): ");
		f = sc.next().charAt(0);



		changeDate(year,month,day,f);





		sc.close();
	}

}