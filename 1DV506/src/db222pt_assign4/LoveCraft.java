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
				//här kollar jag efter hur många linjer det är totalt
				String line = sc.nextLine();
				lines++;

				//här kollar jag hur mågna tomma linjer det finns
				if(line.isEmpty()) {
					empLines++;
				}
				//Här kollar jag hur många linjer med sidnummer det finns
				if(!line.isEmpty() && sc.hasNextInt()) {
					pageNumber++;
				}
				//här kollar jag efter linjer med text
				if(!line.isEmpty() && sc.hasNext()) {
					linesText++;
					n = linesText - pageNumber;
				}

			}


			sc.close();
			//här printar alla information
			System.out.println("Lovecraft statistics: ");
			System.out.println("Total Lines: \t\t"+lines);
			System.out.println("Empty lines: \t\t"+empLines);
			System.out.println("Lines with text: \t"+n);
			System.out.println("Line with page number: \t"+pageNumber);


		}catch(IOException e) {e.printStackTrace();} 

	}

}