package practice_task_1;

public class NumberRangeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Range=15;
		
		if(Range>=1 && Range<=10) {
			System.out.println("Range 1");
		}
		else if(Range>10 && Range<=20) {
			System.out.println("Range 2");
		}
		else if(Range>20 && Range<=30) {
			System.out.println("Range 3");
		}
		else{
			System.out.println("Out of Range");
		}

	}

}
