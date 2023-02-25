package week1.day1;

public class Car {
	public static void main(String[] args) {
		//Program started
		Car car1=new Car();
		car1.driveCar();
		car1.applyBrake();
		car1.soundHorn();
		car1.isPuncture();
		//Program ended
	}
	public void driveCar() {
		System.out.println("Start the Car!");
	}
	public void applyBrake() {
		System.out.println("Prepare for the Jerk!");
	}
	public void soundHorn() {
		System.out.println("Beep Beep!");;
	}
	public void isPuncture() {
		System.out.println("Check If we need to change the wheel!!!");
	}
}
