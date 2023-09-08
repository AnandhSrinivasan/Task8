package task8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number: ");
	      
		  int number = sc.nextInt();

	        long factorial = 1;

	        if (number < 0) {
	            System.out.println("Factorial is not for negative numbers.");
	        } else {
	            for (int i = 1; i <= number; i++) {
	                factorial *= i;
	            }
	            System.out.println("The factorial of " + number + " is: " + factorial);
	        }sc.close();
	}

}
