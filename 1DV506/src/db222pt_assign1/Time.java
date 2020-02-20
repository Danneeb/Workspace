package db222pt_assign1;
import java.util.Scanner;


public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of seconds");

		int sec = sc.nextInt();//Matematiska uträkningar
		int x = (sec/3600);
		int x2 = ((sec%3600)/60);
		int x3 = (sec%60);

		// Här börjar programmet att printa ut tiderna
		System.out.println("timmar: "  + x);
		System.out.println("Minuter: " + x2);
		System.out.println("Sekunder: " + x3);

		sc.close();

	}

}
