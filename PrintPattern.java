/*
Program Q1:- Java program to print a pattern 		
                               *		  
                              * *		
                             * * *		
                            * * * *		 
@author :- Mitul Vallabh Mistry
@date:- 15-09-2022 ( Lab Assessment )
						
*/
import java.util.Scanner;    // importing

class PrintPattern  // declaring class name as PrintPattern
{
	static void pattern(int noStars)   //method created named as pattern  
	{
		for(int i=1; i<=noStars; i++)         // outer loop for my rows 
		 {
		   System.out.println();
		   for(int s=noStars-i; s>0; s--)      
		    {
		     System.out.print(" ");            // printing space between stars
		    }
			for(int j=1;j<=i; j++)				// inner loop for columns				
       		 {
			 System.out.print(" *");           // printing Star ( * )
	    	 } 
			 // inner loop ended
		  }	
		  // end of outer loop
	}
	// end of method
	
public static void main(String ...args)  // command line arguement
 {  
	
	Scanner sc = new Scanner(System.in);                // creating a new Scanner 
	System.out.println("Enter the number of stars");    // printing the statement 
	int num=sc.nextInt();                               // take input 
	pattern(num);                                       
 }
	
} // end of class 