package db222pt_assign1;

import java.util.Scanner;

public class Quote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me something to quote! ");//Programmet fr�gar efter n�got att citera
		String quote = sc.nextLine();
		System.out.print("You Said: "+"\"" + quote + "\"");// H�r printar programmet ut den man gav programmet tidigare inom ""


		sc.close();

	}

}
