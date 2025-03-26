package day1;

import java.util.Scanner;

public class Avrageofdigit {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s1 = new Scanner(System.in);
		int num=s1.nextInt();
		int sum=0;
		int c=0;
		
		
		while(num>0) {
			
			int rem =num%10;
				sum=sum+rem;
				num=num/10;
				c++;
			
			
		}
		float avg=sum/c;
		System.out.println("avg of digit is:" + avg);
	

	}

}
