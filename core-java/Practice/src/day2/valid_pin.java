package day2;
import java.util.*;
import java.util.Scanner;

public class valid_pin {

	public static void main(String[] args) {
		
		int pin=2014;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter year");
		int n=s1.nextInt();
		
		if(pin==n) {
			System.out.println("yess transaction is seccessful");
		}
		else {
			System.out.println(" oops!! transaction not seccessful");
		}
	}

}
