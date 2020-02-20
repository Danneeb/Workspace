package db222pt_assign4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ObscureLovecraft {
	/*
	 * klarade inte den här uppgiften, han inte komma tillräckligt -
	 * långt för att kunna ta upp det här på laborationstillfällen. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Obscure\n=======");
		System.out.println("1. Make obscure");
		System.out.println("2. Make readable");
		System.out.println("3. Print obscure");
		System.out.println("4. Print readable");
		System.out.println("0. Exit");
		String n1 = sc.nextLine();
		String str = "";

		StringBuilder text = new StringBuilder();

		if(n1.charAt(0) == '1') {

			try {
				File file = new File("E:\\Lovecraft\\lovecraft.txt");

				File outFile = new File("E:\\Lovecraft\\obscure.txt");

				PrintWriter printer = new PrintWriter(outFile);

				Scanner sc1 = new Scanner(file);
				int ascii = 0;
				
				while(sc1.hasNext()) {

					str = sc1.nextLine();

					for(int i = 0 ; i<str.length();i++) {
						
						char c = str.charAt(i); //c = character
						ascii = (int) c;
						ascii = ascii +3;
						printer.print((char)ascii);
					}
					
					
					
				}
				
				
				printer.close();
				sc1.close();
			}catch(IOException e) {e.printStackTrace();}
		}


		if(n1.charAt(0) == '2') {
			
		}
		if(n1.charAt(0) == '3') {
			try {
				File file = new File("E:\\Lovecraft\\obscure.txt");
				Scanner sc2 = new Scanner(file);
				StringBuilder text3 = new StringBuilder();
				while(sc2.hasNext()){
					String str1 = sc2.nextLine();
					text3.append(str1+"\n");
					System.out.println(text3);
				}
			}catch(IOException e) {e.printStackTrace();}
		}
		if(n1.charAt(0) == '4') {

		}
		if(n1.charAt(0) == '0') {
			System.out.println("Bye, bye!");
			System.exit(1);
		}





	}

}
