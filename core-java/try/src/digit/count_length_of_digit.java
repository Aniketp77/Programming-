package digit;

public class count_length_of_digit {

	public static int digit(int n) {
//		String s = String.valueOf(n);
//		return String.valueOf(n).length();
		
		int num=n;
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		digit(20000);
		
		System.out.println(digit(20000));
	}

}
