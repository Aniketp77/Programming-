package day1;

public class wu3rdvariable {

	public static void main(String[] args) {
		
		
		int num1=10;
		int num2=40;
		
		
		System.out.println("Before Swapping value of num1 = "+num1+ " num2 = "+num2);
		
		num1=num1+num2;//50
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping value of num1 = " +num1 + " num2 = "+num2);

	}

}
