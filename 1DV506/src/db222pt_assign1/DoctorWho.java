package db222pt_assign1;
import java.util.Scanner;


public class DoctorWho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vilket år? ");
		int year = sc.nextInt();//Skanner funktionen tittar efter ett heltals input

		if(year <= 1989 && year >= 1963)// Här börjar programmet att titta efter vad den ska-
			System.out.print("Det var orginalserien");//printa ut, den använder värdet den fick-
		else if (year > 1989 && year < 2005)//av skanner funktionen
			System.out.print("då var det paus");
		else if (year >= 2005 && year <= 2020)
			System.out.print("Då var det den moderna versionen");
		else
			System.out.print("Förhoppningsvis");







		sc.close();
	}

}
