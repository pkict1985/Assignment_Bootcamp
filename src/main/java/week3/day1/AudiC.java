package week3.day1;

public class AudiC extends Car {
	public void putSeatBelt() {
		// TODO Auto-generated method stub
		//System.out.println("wear seatbelt audi()");
		super.putSeatBelt();
	}
	public void handbrake() {
		System.out.println("brake() from Audi class called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudiC obja=new AudiC();
		obja.handbrake();
		
		obja.putSeatBelt();
	}

}
