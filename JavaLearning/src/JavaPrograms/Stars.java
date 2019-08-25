package JavaPrograms;

import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of rows for pattern");
		int rows=s.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=rows;k>=(i*2-1);k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	        }
}
