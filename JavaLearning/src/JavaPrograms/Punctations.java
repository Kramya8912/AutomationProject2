package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Punctations {
	public static void main(String[] args) {
		String S1= "Hai ####is this Java";
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
		
		String[] arr = S1.split("");
		
		for (int i=0; i<arr.length; i++) {
			
			
			if (hmap.containsKey(arr[i])) {
				
				hmap.put(arr[i], hmap.get(arr[i]) + 1);
			}
			else {
				
				hmap.put(arr[i], 1);
			}
			
		}
		
		System.out.println(hmap);
		
		Iterator itr = hmap.entrySet().iterator();
		
		
		ArrayList al = new ArrayList();
		
		while(itr.hasNext()) {
			
			Map.Entry pair = (Map.Entry)itr.next();
			
			al.add(pair.getValue());
			
		}
		
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
		int smallNum = (int)al.get(0);
		int bigNum = (int)al.get(al.size()-1); 
		
		Iterator itr1 = hmap.entrySet().iterator();
		while(itr1.hasNext()) {
			
			Map.Entry pair = (Map.Entry)itr1.next();
			
			if ((int)pair.getValue() == smallNum) {
				
				System.out.println("min repeat character" +pair.getValue()+ " " + pair.getKey());
			}else if((int)pair.getValue() == bigNum) {
				
				System.out.println("max repeat charcter" +pair.getValue()+ " " + pair.getKey());
			} 
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
