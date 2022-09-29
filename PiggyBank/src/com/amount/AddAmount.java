package com.amount;

public class AddAmount {

		private int amount = 50;
		private int additionalAmount;
		
	    // default constructor
		public AddAmount() {
			
		}

		// parameterized constructor
		public AddAmount(int amount, int additionalAmount) {
			super();
			this.amount = amount;
			this.additionalAmount = additionalAmount;
		}

		// getter setter
		public int getAmount() {
			return amount;
		}


		public void setAmount(int amount) {
			this.amount = amount;
		}


		public int getAdditionalAmount() {
			return additionalAmount;
		}


		public void setAdditionalAmount(int additionalAmount) {
			this.additionalAmount = additionalAmount;
		}

		// to string method
		
		@Override
		public String toString() {
			return "AddAmount [amount=" + amount + ", additionalAmount=" + (amount+additionalAmount) + "]";
		}
		 
		// display method
		static void display(AddAmount a)
		{
			System.out.println("initial "+a.getAmount());
			System.out.println("number to add "+a.getAdditionalAmount());
			System.out.println("total amount "+(a.getAdditionalAmount()+a.getAmount()));
		}
		
		
public static void main(String[] args)
{
	AddAmount a1=new AddAmount(50, 100);
	System.out.println("Detail are :");
	display(a1);
}
		
}
