package TestProjects;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hur stor rektangel vill du ha?");
		int s = sc.nextInt();
		
		for(int i = 0;i<s;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0;i<s-2;i++) {
			System.out.print("*");
			for(int j = 0;j<s-2;j++) {
				System.out.print(" ");
			}
		System.out.println("*");
		}
		for(int i = 0;i<s;i++) {
			System.out.print("*");
		}
	}

}
