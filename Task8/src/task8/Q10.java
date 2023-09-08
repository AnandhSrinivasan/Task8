package task8;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("The number of digits in " + number + " is: " + count);
	sc.close();
	}
}
