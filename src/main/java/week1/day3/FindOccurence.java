package week1.day3;

public class FindOccurence {
//	Classroom2:Find the character occurence
//	===========
//	String:"TestLeaf"
//	output:2
//	1)Create a class called FindOccuerence
//	2)Declare a String
//	3)Convert the String to charArray
//	4)check whether the array has the character
//	5)Increase the count
//	6)Print the count
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr="TestLeaf";
		char[] inpStrArray=inputStr.toCharArray();
		char find='e';
		int cnt=0;
		for (int i = 0; i < inpStrArray.length; i++) {
			if(find==inpStrArray[i]) {
				cnt=cnt+1;
				
			}
			
		}
		System.out.println(cnt);
	}

}
