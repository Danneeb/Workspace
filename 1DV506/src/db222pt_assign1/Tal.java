package db222pt_assign1;

import java.util.Scanner;

public class Tal {

	public static void main(String[] args) {
		//H�r defineras Variabler samt en scanner startas
		Scanner sc = new Scanner(System.in);
		System.out.print("Vilket �r f�rsta talet? ");
		int tal1 = sc.nextInt();

		System.out.print("Vilket �r andra talet? ");
		int tal2 = sc.nextInt();

		System.out.print("Vilket �r tredje talet? ");
		int tal3 = sc.nextInt();

		//H�r startas kollen om det �r i nummerordning
		if(tal1 < tal2 && tal2 < tal3) {
			System.out.println("Korrekt ordning: "+tal1+" "+tal2+" "+tal3);
		}else if(tal2 < tal1 && tal2 < tal3) {
			System.out.println("Korrekt ordning: "+tal2+" "+tal3+" "+tal1);
		}else if(tal1 < tal2 && tal2 > tal3) {
			System.out.println("Korrekt ordning: "+tal3+" "+tal1+" "+tal2);
		}else if(tal1 > tal3 && tal2 > tal3) {
			System.out.println("Korrekt ordning: "+tal3+" "+tal2+" "+tal1);
		}else if(tal1 > tal2 && tal3 > tal2) {
			System.out.println("korrekt ordning: "+tal2+" "+tal1+" "+tal3);
		}



		sc.close();
	}

}
