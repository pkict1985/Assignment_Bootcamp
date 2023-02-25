package week3.day2;
//Classroom1:
//===========
//   1)Create an interface for Mobile
//   2)write 3 methods(abstract)->sendSms,dialNumber,switchOn
//   3)Create a concrete class->IPhone
//   4)Make sure all 3 methods appear 
public class IPhone implements IMobile{

	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("buy() from Iphone");
	}

	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("sell() from IPhone");
	}
public static void main(String[] args) {
	IPhone objIPhone=new IPhone();
	objIPhone.buy();
	objIPhone.sell();
}
}
