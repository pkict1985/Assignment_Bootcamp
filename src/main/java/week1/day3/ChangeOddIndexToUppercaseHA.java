package week1.day3;

public class ChangeOddIndexToUppercaseHA {
	private void changeToUpperCase() {
		// TODO Auto-generated method stub
		String inputStr="abcede";
		;
		char[] inputStrArr=inputStr.toCharArray();
		for (int i = 0; i <= inputStrArr.length-1; i++) {
			if(i%2!=0) 
				System.out.println(Character.toUpperCase(inputStrArr[i]));

			else 
				System.out.println(inputStrArr[i]);

			inputStrArr[i]=Character.toUpperCase(inputStrArr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeOddIndexToUppercaseHA obj=new ChangeOddIndexToUppercaseHA();
		obj.changeToUpperCase();
	}

}
