package db222pt_assign2;
import java.util.Scanner;


public class Primtal {

	public static void x(int n) {

		int kvot = n/2;
		int prim = 0;

		if(n==0 || n==1) {
			System.out.print("Det är inte ett primtal ");
		}
		if(n<0){
			System.out.print("adjö");
			System.exit(1);
		}
		else{
			for(int i = 2; i<=kvot; i++) {
				if(n % i==0) {
					System.out.print("Det är inte ett primtal ");
					prim = 1;
					break;
				}


			}
			if(prim == 0) {
				System.out.print("Det är ett primtal. ");
			}

		}


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv en siffra: ");
		while(sc.hasNext())	{
			int n = sc.nextInt();

			x(n);
		}
		sc.close();
	}

}
