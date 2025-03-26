package digit;

public class sum_of_digit_of_number {

	public static int sum(int num) {
		
		int sum=0;
		int number = num;;
		int last;
		
		while(number>0) {
			
			last=number%10; //it indentify the last number
			sum=sum+last;
			number=number/10; //last number is removed
			
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(sum(123));
		

	}

}
