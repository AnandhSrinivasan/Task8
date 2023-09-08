package task8;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the FirstNum :" );
		int FirstNum = sc.nextInt();

		System.out.print("Enter the SecNum:" );
		int SecNum= sc.nextInt();
		
		int temp = FirstNum;
		FirstNum=SecNum;
		SecNum=temp;
		
		System.out.println("Swapping:");  
		System.out.println("First number: " + FirstNum);
	    System.out.println("Second number: " + SecNum);
	      sc.close();
	}

}
