package db222pt_assign1;
import java.util.Random;


public class Slumptal {
	public static void main(String[] args) {
		Random rng = new Random();
		int x1 = rng.nextInt(1101);	//H�r skapas alla variabler med random funktion-	
		int x2 = rng.nextInt(1101); //som kommer att anv�ndas senare f�r att r�kna ut-
		int x3 = rng.nextInt(1101); //Den totala summan av de fem talen
		int x4 = rng.nextInt(1101);
		int x5 = rng.nextInt(1101);
		System.out.println("De fem slumptalen: " +x1+" "+x2+" "+x3+" "+x4+" "+x5);//Printar ut i konsolen de fem slump�ssiga talen
		System.out.println("Summan av de fem talen: "+(x1+x2+x3+x4+x5));//matematiken

	}
}
