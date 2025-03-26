package day2;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter year");
		int n=s1.nextInt();
		int num;
		num=n/4;
		
		if(num%2==0) {
			System.out.println("is leap year");
		}
		else {
			System.out.println("not leap year");
		}

	}

}
//take the ip from user and print the value of 