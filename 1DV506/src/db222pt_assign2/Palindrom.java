package db222pt_assign2;
import java.util.Scanner;


public class Palindrom {

	static boolean x(String pal) {
		int i = 0;


		pal.toLowerCase();
		String pal1 = pal.replaceAll("\\s", "");

		int y = pal1.length() - 1;	 
		while(i<y) {
			if(pal1.charAt(i) != pal1.charAt(y)) 
				return false;

			i++;
			y--;

		}
		return true; 

	}


	public static void main(String[] args) {

		do {
			System.out.print("Skriv ett ord eller en mening ");
			Scanner sc = new Scanner(System.in);
			String pal1 = sc.nextLine();


			if(pal1.equals("stopp")) {
				System.exit(1);
			}

			if(x(pal1)) {
				System.out.println("Det var ett paldindrom");
			}
			else
				System.out.println("Det var inte ett palindrom");

		}while(true);


	}	
}
