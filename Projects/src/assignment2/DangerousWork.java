package assignment2;

import java.util.Scanner;

public class DangerousWork {

	public static void main(String[] args) {
		double salaryDay = 0.01;
		int day = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("how much would you like to earn? ");
		int earn = sc.nextInt();
		
		while(salaryDay < earn) {
			salaryDay = salaryDay*2;
			day++;
		}
		System.out.println("You will have your money in days "+day);
		
		
	}

}
