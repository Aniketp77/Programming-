package practice_task_1;

public class Grade_assignment {

	public static void main(String[] args) {
		char marks = 84;
		
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=50) {
			System.out.println("Grade C");
		}
		else if(marks<50) {
			System.out.println("Fail");
		}

	}

}
