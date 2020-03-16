package assignment2;

import java.util.Scanner;

public class CalcNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		int total = 0;
		
		do {
			
			System.out.print("Give me a number: ");
			n = sc.nextInt();
			total = total + n;

		}while(n != 0);
		
		System.out.println("The sum is: "+total);
		
		
		sc.close();
	}

}
