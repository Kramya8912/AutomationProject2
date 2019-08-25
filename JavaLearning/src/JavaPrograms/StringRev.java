package JavaPrograms;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
		String reverse="";
		Scanner s= new Scanner(System.in);
		System.out.println("Enter original string");
		String Orginal=s.nextLine();
		for(int i=Orginal.length()-1;i>=0;i--) {
			reverse= reverse+ Orginal.charAt(i);
		}
		System.out.println("Reversed string is:" +reverse);
	}

}

