/*
Program: (Lab Assesment Q2): Write a  java program to create a BankAccount and display the people with balance less than 1000.
		 
@author: Mitul V Mistry
@Date  : 22-09-2022
*/

import java.util.*; // importing package
// declaing class
class Bank
{
	// creating instance variable 
	private int accountNumber;
	private String name;
	private long phoneNumber;
	private double balance;
	
	
	// no argument constructor
	Bank()
    {
			
	}	
	
	//parameterized constructor
	
	void insertBankDetails()
	{
		Scanner sc= new Scanner(System.in);     // creating scanner class
	
	System.out.println("Enter the bank details ");
		
	// taking into from user
	System.out.println("Enter the Account Number:");
	this.accountNumber=sc.nextInt();
	
	// taking input from user
	System.out.println("Enter the name:");
	this.name=sc.next();
	
	//taking input from user
	System.out.println("Enter the phone number:");
	this.phoneNumber=sc.nextLong();
 	
     //taking input from user	
	System.out.println("Enter the balance");
	this.balance=sc.nextDouble();	

		
	}
	
	// creating method to check bank balance
	
	// creating method to display Bank Details-
	void printBankDetails()
	{
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Account Holder Name :"+this.name);
		System.out.println("Phone Number :"+this.phoneNumber);
		System.out.println("Account Balance :"+this.balance);
		
	}
	
}
// end of class

// declaring class
class Account
{
	// main method 
	public static void main(String ...args)
	{
		
		Bank b1 = new Bank(); // creating object 
		b1.insertBankDetails();
		
		System.out.println();
		System.out.println("--------------------The Bank Details---------------------");
		b1.printBankDetails();
		System.out.println();
		System.out.println("---------------------xxxxxxxxxxxxxxxxxxxxxxx--------------------");	
	
	
	}// end of main method

}// end of class