package week1.day2;

public class CheckPrime {
	private void isPrime() {
		// TODO Auto-generated method stub
		int n=10,cnt=0;
		for (int i = 2; i <= n-1; i++) {

			for(int j=1;j<=i;j++)
			{
				if(i%j==0){ 
					cnt=cnt+1;

				}
			}
			if(cnt==2)
			{
				System.out.println(i + "  is a prime number");
			}
			else
			{
				System.out.println(i + " is not a prime number");
			}
			cnt=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime prime=new CheckPrime();
		prime.isPrime();
	}

}
