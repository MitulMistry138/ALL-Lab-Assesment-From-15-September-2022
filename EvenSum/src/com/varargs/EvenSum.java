package com.varargs;

public class EvenSum {
	   static void printEvenSum(int ...a) 
	   {
		   int sum=0;
		
		   // for loop started
		   for(int i: a)
		   {
			   //if condition
			   if (i%2==0)
			   {
				   sum += i ;		
				   
				   // print output
				   System.out.println("sum is "+sum);
			   }
			 
		   }
		  
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//giving input
		 printEvenSum(1,4,5,8,8);
	}

}
// end of class