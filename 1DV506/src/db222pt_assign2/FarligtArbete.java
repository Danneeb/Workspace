package db222pt_assign2;
import java.util.Scanner;

public class FarligtArbete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Hur mycket vill du tjäna? ");
		int lon = sc.nextInt();
		int dag = 0;
		double londag = 0.01;



		while(londag < lon) {

			londag = londag * 2;
			dag++;
		}


		System.out.print(dag);


		sc.close();
	}


}