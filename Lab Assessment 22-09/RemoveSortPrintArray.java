/*
Program: (Lab Assesment Q1) Write a Java program to print the duplicate entries , 
                            Sort the array and then remove the duplicate entry.
		 
@author: Mitul V Mistry
@Date  : 22-09-2022
*/


// importing packages

import java.util.Scanner;
import java.util.Arrays;

// Declaring class 

class RemoveSortPrintArray
{
	
	static void userInput()  // creating method named as userInput
	
	{
		
		// creating  a Scanner 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("---------Enter elements:------");
		
		int num= sc.nextInt();  // taking input from user 
		
		
		int mynum[]= new int[num]; // creating an array
		
		System.out.println("-----Enter the numbers:-----");
		
		// for loop started
		for(int i=0;i<num;i++)
		{
				
	     	mynum[i]= sc.nextInt(); 
					
		}
		//end of for loop
		
       // enter blank line 
		System.out.println();
		
		System.out.println("------ Numbers are -------");
         displayArray(mynum);  // calling display method
		
		// enter blank line
		System.out.println();
		sortArray(mynum);   // calling sorting method
		
		// enter blank line
		System.out.println();
		
	
			// enter blank line
		System.out.println();
		
		System.out.println("--------After Removal of Duplicate numbers-------");
        System.out.println();
		removeDuplicate(mynum);  // calling removing method
		
		System.out.println();
		
		
		
		
	}
	
	static void sortArray(int sort[])    // creating method named as sorting of array
   {
	   // taking temporary variable
	   int temp;
	   
	   for(int i=0;i<sort.length-1;i++)   // outer for loop starts
	   {
		   for(int j=i+1;j<sort.length;j++)  // inner for loop starts
		   { 
			   if(sort[i]>sort[j])
			   {
				   temp = sort[i];      // swapping values
				   sort[i]=sort[j];
				   sort[j]=temp;
				}
				
			// inner loop ends 	
		   }
		   
		// outter loop ends   
	   }
	    System.out.println();
	    System.out.println("*********--Array after Sorting are --*********");
		
        displayArray(sort); // calling display method
	   
   }
  
	
	static void displayArray(int display[])
	{
		
	   System.out.println();
	
		for(int array:display)  // enhanced for loop to display the array
		{
		 System.out.print(array+ "  ");
					
		}
		
	}
   
   static void removeDuplicate(int removedup[])
   {
	   int lengthh= removedup.length;
	   
	   int n_lengthh;     // for new length
	   
	   // conditional statement starts
	   
	   if(lengthh==0||lengthh==1)
		   n_lengthh=lengthh;
	   
	   int temp[] = new int[lengthh]; // creating an array to store lengthh
	   
	   int j=0;   // taking variable and initializing
	   
	   
	   // Start of for loop
	   for(int i=0;i<lengthh-1;i++)
	   {
		   if(removedup[i]!=removedup[i+1])  // if th condition is not equal to removedup[i+1]
		   {
			   temp[j++]=removedup[i];       // then store value in temp[j++]
		   }
	   }
	   
	   temp[j++]=removedup[lengthh-1]; 
	   
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   removedup[i]= temp[i];
	   }
	   
	   
	   //printing after removing duplicate numbers
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(removedup[i]+"  "); // printing the values after removing the duplicate numbers
	   }
   }

   public static void main(String ...args)
  {

     userInput(); // calling userInput method

  }


}   