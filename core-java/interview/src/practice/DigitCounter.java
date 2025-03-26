package practice;
import java.util.Scanner;



		public class DigitCounter {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input integer from user
		        System.out.print("Enter an integer: ");
		        int num = scanner.nextInt();
		        int sum=0;
		        
		        // Convert to positive if negative
		        num = Math.abs(num);

		        // Count digits
		        int count = (num == 0) ? 1 : 0;
		        while (num > 0) {
		            num /= 10;
		         
		            count++;
		        }

		        // Output the number of digits
		        System.out.println("Number of digits: " + count);
		        
		        scanner.close();
	


	}

}
