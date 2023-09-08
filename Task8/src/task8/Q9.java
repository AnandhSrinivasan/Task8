package task8;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();
	        sc.close();
	        
	        boolean isSeniorCitizen = (age >= 60);
	        if (isSeniorCitizen) {
	            System.out.println("You are a senior citizen.");
	        } else {
	            System.out.println("You are not a senior citizen.");
	        }
	}

}
