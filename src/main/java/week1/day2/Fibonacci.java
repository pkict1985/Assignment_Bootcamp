package week1.day2;

public class Fibonacci {
	private void generateFibonacci() {
		// TODO Auto-generated method stub
		int n = 11, firstNo=0, secNo=1, thirdNo=0;
		System.out.println("Fibonacci series geberated for "+ n + " numbers");
		System.out.println(firstNo);
		System.out.println(secNo);
		for (int i = 2; i <n; i++) {
			thirdNo=firstNo+secNo;
			System.out.println(thirdNo);
			firstNo=secNo;
			secNo=thirdNo;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib=new Fibonacci();
		fib.generateFibonacci();
	}

}
