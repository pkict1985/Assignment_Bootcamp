package week1.day3;

import java.util.Arrays;

public class ReverseEvenWordsHA {
private void reverseEvenWords() {
	// TODO Auto-generated method stub
 String input="I like Ice Cream I love it";
 System.out.println("Input given is: "+ input);
 String[] strings = input.split(" ");
 System.out.println(Arrays.toString(strings));
 System.out.println("Reversed even words in the input as follows,");
 //Get even words
 char[] str;
 for(int i=0;i<strings.length-1;i++) {
	 if(i%2==0) {
		 //System.out.println(strings[i+1]);
		 str=strings[i+1].toCharArray();
		 for(int j=str.length-1;j>=0;j--)
		 System.out.print(str[j]);
	 }
	 System.out.println();
 }
}
public static void main(String[] args) {
	ReverseEvenWordsHA reverse=new ReverseEvenWordsHA();
	reverse.reverseEvenWords();
}
}
