package JavaPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the required string palindrome");
		String S= s.nextLine();
		String reverse="";
		for(int i=S.length()-1;i>=0;i--) {
			reverse= reverse+S.charAt(i);
		}
		System.out.println("Reverse string is:" +reverse);
		
		if(S.equals(reverse)) {
			System.out.println("String is palindrome");
	
	}
		else {
			System.out.println("String is not palindrome");
		}
	}
	

}
