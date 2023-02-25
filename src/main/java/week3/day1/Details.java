package week3.day1;
//
//Classroom2:
//===========
//   1)Create a class Details
//   2)Create a method employeeDetails() with empty arguments and have a print statement
//   3)Create a method employeeDetails() with int data inside the argument and have a print statement inside the method
//   4)Create a method employeeDetails() with int and String arguments and have a print statement inside the method
//   5)Create a method employeeDetails() with String argument and have a print statement inside the method
//   6)Inside the main method call the methods and run
//   

public class Details {
	public void employeeDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Print() of Details_employeeDetails");
	}

	public void employeeDetails(int id) {
		// TODO Auto-generated method stub
		System.out.println(id + " Print() of Details_employeeDetails(int)");
	}
	public void employeeDetails(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println(id + name +  " Print() of Details_employeeDetails(int,string)");
	}
	public void employeeDetails(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " Print() of Details_employeeDetails(string)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details objDetails=new Details();
		objDetails.employeeDetails();
		objDetails.employeeDetails(5);
		objDetails.employeeDetails(5,"Fahin");
		objDetails.employeeDetails("Ravii");
	}

}
