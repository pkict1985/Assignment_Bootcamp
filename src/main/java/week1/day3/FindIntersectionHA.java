package week1.day3;

import java.util.Arrays;

public class FindIntersectionHA {
private void FindIntersection() {
	// TODO Auto-generated method stub
int[] number1= {1, 2, 7, 5};
int[] number2= {1, 7, 9, 0};
System.out.println(Arrays.toString(number1));
System.out.println(Arrays.toString(number2));
System.out.println("Intersection is as follows,");
for(int i=0;i<=number1.length-1;i++) {
	for (int j = 0; j < number2.length; j++) {
		if(number1[i]==number2[j]) System.out.println(number1[i]);
	}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindIntersectionHA obj=new FindIntersectionHA();
		
		obj.FindIntersection();
	}

}
