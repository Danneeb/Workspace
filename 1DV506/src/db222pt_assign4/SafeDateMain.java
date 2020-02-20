package db222pt_assign4;

import java.util.Scanner;

public class SafeDateMain {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//skapar ett datum
		Date d = new Date();

		do {
			try {
				
				System.out.print("Give me a year: ");
				d.setYear(sc.nextInt());

				System.out.print("Give me a month: ");
				
				d.setMonth(sc.nextInt());

				System.out.print("give me a day: ");
				d.setDay(sc.nextInt());
				if(d.getMonth() < 10) {
					System.out.println("The date is : "+d.getDay()+"/0"+d.getMonth()+"/"+d.getYear());
				}else
				System.out.println("The date is : "+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
			}
			//om något fel inträffar fångar programmet det här och printar ett meddelande med felet.
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}while(true);
	}

}