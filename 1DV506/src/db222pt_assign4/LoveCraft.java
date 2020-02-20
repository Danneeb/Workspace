package db222pt_assign4;

import java.io.*;
import java.util.Scanner;



public class LoveCraft {

	public static void main(String[] args) {
		//variabler
		int lines = 0;
		int empLines = 0;
		int n = 0;
		int linesText = 0;
		int pageNumber = 0;


		try {
			File file = new File("E:\\Lovecraft\\lovecraft.txt");
			Scanner sc = new Scanner(file);



			while(sc.hasNext()) {
				//h�r kollar jag efter hur m�nga linjer det �r totalt
				String line = sc.nextLine();
				lines++;

				//h�r kollar jag hur m�gna tomma linjer det finns
				if(line.isEmpty()) {
					empLines++;
				}
				//H�r kollar jag hur m�nga linjer med sidnummer det finns
				if(!line.isEmpty() && sc.hasNextInt()) {
					pageNumber++;
				}
				//h�r kollar jag efter linjer med text
				if(!line.isEmpty() && sc.hasNext()) {
					linesText++;
					n = linesText - pageNumber;
				}

			}


			sc.close();
			//h�r printar alla information
			System.out.println("Lovecraft statistics: ");
			System.out.println("Total Lines: \t\t"+lines);
			System.out.println("Empty lines: \t\t"+empLines);
			System.out.println("Lines with text: \t"+n);
			System.out.println("Line with page number: \t"+pageNumber);


		}catch(IOException e) {e.printStackTrace();} 

	}

}