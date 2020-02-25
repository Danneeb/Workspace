package TestProjects;

import java.util.Scanner;

public class StringCompare {
	public static boolean strComp(String str) {
		
		for(int i = 0;i<str.length();i++) {
			for(int j = i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					return true;
				}
			}
		}
	return false;
	}
	public static void toLowerCase(String str) {
		String str1 = str.toLowerCase();
		System.out.println(str1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kolla efter dubletter i en string\nVilken mening/ord vill du kolla?");
		String str = sc.nextLine();
		
		
		toLowerCase(str);
		System.out.println(strComp(str));
	}

}
