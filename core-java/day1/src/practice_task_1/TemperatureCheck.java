package practice_task_1;

public class TemperatureCheck {

	public static void main(String[] args) {
		int temp=25;
		
		if(temp<=20) {
			System.out.printf("Cold");
		}
		else if(temp>20 && temp<=30) {
			System.out.printf("Warm");
		}
		else if(temp>30) {
			System.out.printf("Hot");
		}

	}

}
