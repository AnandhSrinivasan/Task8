package task8;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        sc.close();
		        
		        boolean isPrime = isPrimeNumber(num);
		        
		        if (isPrime) {
		            System.out.println(num + " is a prime number.");
		        } else {
		            System.out.println(num+ " is not a prime number.");
		        }
		    }
		    
		    public static boolean isPrimeNumber(int num) {
		        if (num < 51) {
		            return false;
		        }
		        
		        for (int i = 51; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false; 
		            }
		        }        
		        return true; 
		    }
	}
