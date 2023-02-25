package week3.day2;
//Classroom1:
//===========
//   1)Create an interface for Mobile
//   2)write 3 methods(abstract)->sendSms,dialNumber,switchOn
//   3)Create a concrete class->IPhone
//   4)Make sure all 3 methods appear 

import org.apache.poi.ss.formula.atp.Switch;

public abstract class Ab implements IMobile{

	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("called from abstract_buy()");
	}
	public abstract void sendSms();
	public abstract void dialNumber();
	public abstract void switchOn();
}
