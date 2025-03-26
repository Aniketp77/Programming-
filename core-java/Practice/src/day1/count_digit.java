package day1;
import java.util.*;

public class count_digit {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s1 = new Scanner(System.in);
		int num=s1.nextInt();
		
		
		int c=0;
		int sum=0;
		while(num>0) {
			
			c++;
			num =num/10;
		}
		System.out.println("count the digit is:" +c);
		System.out.println("count the digit is:" +sum);
	}

}
