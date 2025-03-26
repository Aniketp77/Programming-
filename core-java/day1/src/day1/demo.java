package day1;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks= 100;
		
		if(marks>=90) {
			System.out.println("very exalent");
		}
		else if(marks>=75 && marks<=90) {
			System.out.println("distinc");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("first class");
		}
		else if(marks>35 && marks<60) {
			System.out.println("just pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
