package db222pt_assign1;
import java.util.Scanner;



public class Avstand {
	//Börjar med att sätta igång en funktion som söker efter ett iput.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       
		System.out.print("Vad är ditt x värde? ");//Börjar med att bestämma x-värden
		int x1 = sc.nextInt();
		System.out.print("Vad är ditt x2? ");
		int x2 = sc.nextInt();

		System.out.print("vad är ditt y? ");// här defineras alla y-värden
		int y1 = sc.nextInt();
		System.out.print("Vad är ditt y2? ");
		int y2 = sc.nextInt();

		double xvalues = Math.pow((x1-x2), 2);//här börjar jag räkna på avståndet
		double yvalues = Math.pow((y1-y2), 2);

		double xy = xvalues + yvalues;// lägger ihop både x och y
		double svar = Math.pow(xy, 0.5);// här tar jag xy och höjer upp till 0.5 istället för att ta roten ut

		double svar1 = Math.round(svar * 1000d) / 1000d;//avrundning till rätt antal decimaler


		System.out.println("Punkt x1: "+x1);//här börjar jag printa ut resultaten
		System.out.println("Punkt y1: "+y1);
		System.out.println("Punkt x2: "+x2);
		System.out.println("Punkt y2: "+y2 );
		System.out.println("Avståndet är: "+svar1);


		sc.close();

	}

}
