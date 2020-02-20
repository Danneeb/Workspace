package db222pt_assign1;
import java.util.Scanner;



public class Avstand {
	//B�rjar med att s�tta ig�ng en funktion som s�ker efter ett iput.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       
		System.out.print("Vad �r ditt x v�rde? ");//B�rjar med att best�mma x-v�rden
		int x1 = sc.nextInt();
		System.out.print("Vad �r ditt x2? ");
		int x2 = sc.nextInt();

		System.out.print("vad �r ditt y? ");// h�r defineras alla y-v�rden
		int y1 = sc.nextInt();
		System.out.print("Vad �r ditt y2? ");
		int y2 = sc.nextInt();

		double xvalues = Math.pow((x1-x2), 2);//h�r b�rjar jag r�kna p� avst�ndet
		double yvalues = Math.pow((y1-y2), 2);

		double xy = xvalues + yvalues;// l�gger ihop b�de x och y
		double svar = Math.pow(xy, 0.5);// h�r tar jag xy och h�jer upp till 0.5 ist�llet f�r att ta roten ut

		double svar1 = Math.round(svar * 1000d) / 1000d;//avrundning till r�tt antal decimaler


		System.out.println("Punkt x1: "+x1);//h�r b�rjar jag printa ut resultaten
		System.out.println("Punkt y1: "+y1);
		System.out.println("Punkt x2: "+x2);
		System.out.println("Punkt y2: "+y2 );
		System.out.println("Avst�ndet �r: "+svar1);


		sc.close();

	}

}
