package assignment2;

import java.util.Scanner;

public class SimpleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a positive number: ");
		
		int n = sc.nextInt();
		
		for(int i = n ; i>0 ; i--) {
			System.out.print("*");
			for(int j = i; j>0 ; j--) {
				System.out.print(" ");
			}
		}
	}

}
