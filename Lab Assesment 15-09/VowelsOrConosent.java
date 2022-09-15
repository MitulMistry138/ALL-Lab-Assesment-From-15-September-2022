/*
Program Q2:- Java progam to find whether the character entered is vowel ,consonant ,number and special character.	 
@author :- Mitul Vallabh Mistry
@date:- 15-09-2022 ( Lab Assessment )
						
*/
import java.util.Scanner;   //importing Scanner Class from java.util package 

//Declaring Class named as VowelsOrConosent	
	
class VowelsOrConosent 
{
	// using nested if 	
	static void checkingValue(char charVal)        // creating method checkingValue
	{
		int asciiVal= charVal;      
		if((asciiVal>=65)&&(asciiVal<=90))       // if the range of ascii value is between 65 to 90 then it contains Uppercase Character
		{
			System.out.println();
			System.out.println("The " +charVal+ " is uppercase letter");      // Print if the character is Uppercase
			
			if((charVal=='A')||(charVal=='E')||(charVal=='I')||(charVal=='O')||(charVal=='U'))       // if condition wheather the char are vowels or not in uppercase
			{
				System.out.println();  // adding extra blank line 
				System.out.println(charVal+ " is a vowel");     // Print if the char is vowel
			}
			else
			{
				System.out.println();  // adding extra blank line 
				System.out.println(charVal+ " is a conosent");		// else Print it is conosnant														
			}	
			
		    
		}
		else if((asciiVal>=97)&&(asciiVal<=122))                    //if the range of ascii value is between 97 to 122 then it contains lowercase Character       
		{
			System.out.println("The " +charVal+ " is lowercase letter");     // Print if the character is Lowercase
			if((charVal=='a')||(charVal=='e')||(charVal=='i')||(charVal=='o')||(charVal=='u'))     // if condition wheather the char are vowels or not in lowercase
			{
				System.out.println();  // adding extra blank line 
				System.out.println(charVal+ " is a vowel");      
			}
			else
			{
				System.out.println();  // adding extra blank line 
				System.out.println(charVal+ " is a conosent");
			}	
		}
		else if((asciiVal>=48)&&(asciiVal<=57))                    // if the range of ascii value is between 48 to 57 then it contains numbers
		{
			System.out.println();  // adding extra blank line 
			System.out.println(charVal+ " it is a number");         // else Print it is number
		}
		else{
			
			System.out.println();  // adding extra blank line 
			System.out.println(charVal+ " is a Special Character ");  // else Print it is Special character
		} 
		
	}
	
   public static void main(String ...args)
   {
	   char value;       // Declaring a character variable 
	   Scanner sc = new Scanner(System.in);  // creating a refrence of Scanner class and allocating memory 
	   System.out.println("-------------Enter Your Value to check ---------");
	   value= sc.next().charAt(0); // take input from user
	  
	  checkingValue(value);  //caling method
    
    }

   // end of main

}

// end of class