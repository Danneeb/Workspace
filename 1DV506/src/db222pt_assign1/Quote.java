package db222pt_assign1;

import java.util.Scanner;

public class Quote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me something to quote! ");//Programmet frågar efter något att citera
		String quote = sc.nextLine();
		System.out.print("You Said: "+"\"" + quote + "\"");// Här printar programmet ut den man gav programmet tidigare inom ""


		sc.close();

	}

}
