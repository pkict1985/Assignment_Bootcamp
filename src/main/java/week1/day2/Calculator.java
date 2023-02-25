package week1.day2;



public class Calculator {
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;

	}
	public int multt(int num1, int num2) {
		return num1*num2;
	}
	public void checkNo() {
		// TODO Auto-generated method stub
		int number=5;
		if (number>0) {
			System.out.println("positive");
		}else if(number<0){
			System.out.println("negative");
		}
		else {
			System.out.println("neutral");
		}

	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int substract = c.substract(5, 3);
		int multt = c.multt(4, 5);
		System.out.println("Sub result is "+ substract);
		System.out.println("mult result is "+ multt);
	    c.checkNo();
	}
}
