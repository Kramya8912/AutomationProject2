package JavaPrograms;

public class VowelConsonants {
	public static void main(String[] args) {
		int vcont=0,ccount=0;
		
		String s= "Helo World";
		     String arr[]=s.split("");
		     
		      for(int i=0;i<arr.length;i++) {
		    	  
		    	  if(arr[i].contains("a")  || arr[i].contains("e")|| arr[i].contains("i") ||arr[i].contains("o") || arr[i].contains("u")) {
		    		 
		    		  
		    		  vcont++;
		    		  
		    	  }
		    	  
		    	  else {
		    		  ccount++;
		    	  }
		      }
		     
		     System.out.println(vcont);
		     System.out.println(ccount);
		     
	}

}
