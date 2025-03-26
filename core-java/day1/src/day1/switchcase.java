package day1;

public class switchcase {

	public static void main(String[] args) {
		int a=10,b=30,c;
		
		int choice=2;
		
		switch(choice) {
		case 1:
			c=a+b;
			System.out.println("Addition is " + c);
			break;
		case 2:
			c=a-b;
			System.out.println("Substraction is " + c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication is " +c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division of " + c);
			break;
		case 5:
			c=a%b;
			System.out.println("Modules of " +c);
			break;
		default:
			System.out.println("plz enter correct choice");
			break;
		}
		

	}

}
