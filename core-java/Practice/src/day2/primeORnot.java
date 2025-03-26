package day2;
import java.util.*;
import java.util.Scanner;
//number divisial by 1 or itself.
public class primeORnot {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter number");
		int n=s1.nextInt();
		
		int flag=0;
		
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			flag=1;
			break;
		}
		}
		if(flag==0) {
			System.out.println(n+ "  is  prime");
		}
		else {
			System.out.println(n + "  not prime");
		}

	}

}
