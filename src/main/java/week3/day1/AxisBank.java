package week3.day1;
//subclass class
public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit from AxisBank");
	}
	public static void main(String[] args) {
		AxisBank objAB = new AxisBank();
		//Deposit() from AxisBank is called as we intent to override the base class method
		objAB.deposit();
		
		objAB.fixed();
		objAB.saving();
		
		//If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed
		// If a Parent type reference refers
        // to a Parent object, then Parent's
        // method is called
        
  
        // If a Parent type reference refers
        // to a Child object Child's method
        // is called. This is called RUN TIME
        // POLYMORPHISM.
	
	}
}
