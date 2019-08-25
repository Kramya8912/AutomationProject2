package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountNoOfWordsUsingHashMap {

	public static void main(String[] args) {
		
		System.out.println("Enter the string value: ");
		Scanner sc = new Scanner(System.in);
		String originalString = sc.nextLine();
		System.out.println("Original string value: " +originalString );
		
		String[] words = originalString.split(" ");
		
		//System.out.println(words.length);
		
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();
		
		for(String s:words) {
			
			
			hmap.put(s, 1); 
		}
		
		
		System.out.println(hmap.size());
		System.out.println(hmap);

	}

}
