package db222pt_assign1;
import java.util.Scanner;


public class SumOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv tre nummer: ");
		int x = sc.nextInt();

		int x1 = x % 10;//H�r b�rjar de matematiska utr�kningarna f�r att senare kunna- 
		int x2 = x % 100;//addera talen.
		int x3 = x2 / 10;
		int x4 = x / 100;


		System.out.println("Summan av de tre talen: " +(x1+x3+x4));


		//System.out.println(x1); Det h�r var f�r att under tiden testa och se-
		//System.out.println(x2); vad jag fick f�r olika resultat i utr�kningarna.
		//System.out.println(x3);
		//System.out.println(x4);



		sc.close();
	}

}
