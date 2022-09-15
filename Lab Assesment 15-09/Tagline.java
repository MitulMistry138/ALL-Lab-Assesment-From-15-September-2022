/*
Program : Write a java program to print the Tagline of any 5 companies (Enahnced switch case)
@author :  Mitul Mistry
@date   :15-09-2022 (Labb Assessment)
*/

import java.util.Scanner;  // importing scanner class from java.util Package

//Declaring class
class Tagline
{

	static void brandName(int brand)   //  method name  brandName
	{
		//String brand= "puma"; //input given 
        
        switch(brand)        // creating a switch case
		{
		                         			
		    case 1 -> System.out.println( " Tagline of " + brand +" is  'Addidas is all'. "); // print if input is 1
				
			case 2 ->  System.out.println( " Tagline of " + brand +" is 'Just do it'. ");  // print if input is 2
						
 			case 3 ->  System.out.println( " Tagline of " + brand +" is  'FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD'.");  // print if input is 3
			
			case 4->  System.out.println( " Tagline of " + brand +" is 'I'm loving it'. "); // print if input is 4
			
			case 5->  System.out.println( " Tagline of " + brand +" is  'OH yes We did It'. ");  // print if input is 5
			 			        
			default-> System.out.println("Wrong input");		// for looping out if the input is wrong
		}
 				
	}
	// end of method

	public static void main(String ...args)
	{
		int name;  // declaring variable 
		Scanner sc = new Scanner(System.in); // creating scanner class reference and alocating memory to it 
		
		System.out.println("------------Enter The brand number from below list ----------");
		System.out.println("1:-) Addidas");
		System.out.println("2:-) Nike");
		System.out.println("3:-) Puma");
		System.out.println("4:-) Mcdonalds");
		System.out.println("5:-) Dominos");
		System.out.println(); // adding extra blank line 
		
		name= sc.nextInt();  		// taking input from user
		System.out.println("----------Tagline for above mentioned brand number is --------");
		System.out.println(); // adding extra blank line 
		brandName(name);		// calling method as brandName
	    
	}
	
}	// end of class