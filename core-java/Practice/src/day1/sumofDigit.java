package day1;

import java.util.Scanner;

public class sumofDigit {

	public static void main(String[] args) {

		
		System.out.println("Enter the number");
		Scanner s1 = new Scanner(System.in);
		int num=s1.nextInt();
		int sum=0;
		
		
		while(num>0) {

			int rem =num%10;
				sum =sum+rem;
				num =num/10;

		}
		System.out.println("Sum of digit is:" +sum);
	
		

	}

}
