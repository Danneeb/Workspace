package db222pt_assign2;
import java.util.Scanner;


public class VarannanSiffra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Första siffran: ");
		int s1 = sc.nextInt();
		System.out.print("Andra siffran: ");
		int s2 = sc.nextInt();
		sc.close();

		for(int i = s1; i <= s2; i = i + 2) {
			System.out.print(i+" ");

		}
	}

}
