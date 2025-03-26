package day2;
import java.util.*;
public class largest_amongfour_number {

	public static void main(String[] args) {
		
		Scanner s1 =new Scanner(System.in);
		
		System.out.println("enter four numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		int d=s1.nextInt();
		
		System.out.println("four numbers are "+a+" "+b+ " "+c+ " "+d);

	
	if(a>b && a>c && a>d) {
		System.out.println("Grest numbers are "+a);
	}
	else if(b>a && b>c && b>d) {
		System.out.println("Grest numbers are "+b);
	}
	else if(c>b && c>a && c>d) {
		System.out.println("Grest numbers are "+c);
	}
	else {
		System.out.println("Grest numbers are "+d);
	}
		
	}

}
