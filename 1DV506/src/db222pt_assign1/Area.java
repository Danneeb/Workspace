package db222pt_assign1;
import java.util.Scanner;



public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("vad �r radien?");
		double radie = sc.nextDouble();// Skannar efter resultat.
		double area = Math.PI * Math.pow(radie, 2.0);
		System.out.print("Arean = " +Math.rint(area));//Avrundar till ett b�ttre tal �n ett med massor av decimaler


		sc.close();
	}

}
