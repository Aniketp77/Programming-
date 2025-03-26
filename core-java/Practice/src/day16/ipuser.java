package day16;

import java.util.Scanner;

public class ipuser {

	public static void main(String[] args) {

		
		System.out.println("enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		System.out.println("enter the specific letter");
		char ch =sc.next().charAt(0);
		
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
		
		}
		if(count!=0) {
			System.out.println("special charecter is present");
		}
		else {
			System.out.println("not present");
		}
	}
}
