package JavaPrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		//collecting the user input into originalString variable using Scanner class
		System.out.println("Enter the string value: ");
		Scanner sc = new Scanner(System.in);
		String originalString = sc.nextLine();
		System.out.println("Original string value: " +originalString );
		
		int originalStringLength = originalString.length();
		String reverseString = "";
		
		//char[] chars = originalString.toCharArray();
		
		for(int i=originalStringLength-1; i>=0; i--) {
			
			
			//reverseString = reverseString + chars[i];
			
			reverseString = reverseString +  originalString.charAt(i);
			
			System.out.println(reverseString);
		}
		
		System.out.println(reverseString);
	}

}
