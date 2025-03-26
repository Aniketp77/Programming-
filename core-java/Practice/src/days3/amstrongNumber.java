package days3;

import java.util.Scanner;

//amstrong number =sum of power of number's digit is equal to number itself. learn from youtube
public class amstrongNumber {

	public static void main(String[] args) {
		int  number;
		
		int sum=0;
		int rem ;
		int c=0;
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("enter the number");
		number=s1.nextInt();
		
		int temp = number;
		
		while(number>0) {
			rem=number%10;
			sum=sum+c;
			
			while(number>0) {
				c++;
				number=number/10;
			}
			number=number/10;
		}
		if(temp==sum) {
			System.out.println(temp+" number is amstrong number");
		}
		else {
			System.out.println(temp+" number is not amstrong number");
		}

	}

}
