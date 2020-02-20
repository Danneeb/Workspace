package db222pt_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {
		int word = 0;
		int linesText = 0;
		int n = 0;
		int pageNumber = 0;

		try { 
			File file = new File("E:\\Lovecraft\\lovecraft.txt");
			Scanner sc = new Scanner(file);

			while(sc.hasNext() ) {
				String words = sc.next();
				//tittar efter hur många or det finns och sparar det i en variabel
				word++;
			}
			sc.close();
		}catch(IOException e) {e.printStackTrace();}
		try {
			File file = new File("E:\\\\Lovecraft\\\\lovecraft.txt");
			Scanner sc = new Scanner(file);

			while(sc.hasNext()) {
				String line = sc.nextLine();
				//kollar efter sidnummer, som inte ska vara med i totala räkningen
				if(!line.isEmpty() && sc.hasNextInt()) {
					pageNumber++;
				}

			}
			sc.close();
		}catch(IOException e) {e.printStackTrace();}
		System.out.println("Number of words "+(word-pageNumber));
	}

}
