/*
Program: (Lab Assesment Q2) Write a Student and create an array of 10 students
                            and display the students whose marks are more than 90%.
		 
@author: Mitul V Mistry
@Date  : 22-09-2022
*/


// declaring class
class Student
{
	//instance variable
 private int id;
 private String name;
 private float marks;
 public double percentage;
 
  
 Student() // no argument constructor
 {
	 
 }
 // parametarized constructor 
  Student(int id,String name,float marks,double percentage) // parameterized constructor
  {
	  //System.out.println("---- Details----");
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
	  this.percentage= percentage;
	 
  }
  
  
   // diplay method 
public void displayDetails()
 {
	 
   //String course; local variable is not initialized
   System.out.println();   
   System.out.println();   
   System.out.println("-------Details----------");
   System.out.println(); 
  
  System.out.println("ID:"+id);
  System.out.println("Name:"+name);
    System.out.println("Marks:"+marks);
	 System.out.println("Percentage "+percentage);
	 System.out.println();
	  System.out.println("--------------------");
	  
	  
	
	  
	  
  }
  
  
 
 // end of class
}
// declairng class
class PrintOfDetails
{
	// main method
 public static void main(String ...args)
 {
	
	 
	Student details[]= new Student[5];            // creating new array 
	
	// giving values
	    details[0]= new Student(1,"XYZ",7.6f,50.0);
		details[1]= new Student(10,"Mitul",8.6f,75.5);
		details[2]= new Student(30,"Pyro",9.5f,91.0);
		details[3]= new Student(31,"Simbha",10.2f,40.0);
		details[4]= new Student(55,"Guru",15.6f,95.5);
	 
	 // to diplay the details 
	 for (int i=0;i<5;i++)
	  {
		if(details[i].percentage>90.00)
		{
			details[i].displayDetails();
		}
		
	  } 
			 	  	
 }// end of main method 

   } // end of class