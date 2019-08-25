package JavaPrograms;

public class Swapping {

	public static void main(String[] args) {
		
		//Swapping a given two numbers without using third variable
		
		
		int a=10,b=50;
		System.out.println("Values before swaping:" +a+ " " +b);
		
		a= a+b;		//a=60
		b=a-b;		//b=10
		a=a-b;		//a=50
		
		System.out.println("Values after swaping:" +a+ " " +b);
		
	}

}
