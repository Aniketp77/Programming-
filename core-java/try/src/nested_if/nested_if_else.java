package nested_if;

import java.util.Scanner;

public class nested_if_else {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("enter any numbere :");
		int number =s1.nextInt();
				
		
		if(number==0){
		System.out.println("the given number is 0");
			}
			else if(number>0){
		System.out.println("number is positive ");
			}
			else {
			System.out.println("number is negative");
			}

	}

}
