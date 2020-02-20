package db222pt_assign2;
import java.util.Scanner;


public class EnkelTriangel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv ett positivt tal: ");
		int size = sc.nextInt();
		int i, x, y;


		if(size >= 1) {
			for(i = size; i >= 1; i--) {
				for(x = size; x > i; x--) {
					System.out.print(" ");
				}
				for(y = 0; y < i; y++) {
					System.out.print("*");
				}
				System.out.println();	

			}

		}

		else
			System.out.print("Något gick fel, försök igen");

		sc.close();
	}

}
