package db222pt_assign1;
import java.util.Scanner;


public class Fahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("grader i fahrenheit? ");
		double f = sc.nextDouble();
		double x1 = (f-32);// Här börjar omvandligen ifrån F till C
		double x2 = (x1/1.8);



		System.out.println("Motsvarande grader i celcius "+x2);


		sc.close();
	}
}
