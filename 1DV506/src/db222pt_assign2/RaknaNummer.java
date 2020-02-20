package db222pt_assign2;

import java.util.Scanner;

public class RaknaNummer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int varde = -1;
		int summa = 0;


		while(varde != 0) {
			System.out.print("Skriv in en siffra: ");
			varde = sc.nextInt();
			summa = summa + varde;
		}

		System.out.print("Totala summan blev "+summa);

	}

}
