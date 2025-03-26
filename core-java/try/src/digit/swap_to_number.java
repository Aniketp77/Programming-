package digit;

public class swap_to_number {
	
	
	public static String swap(int a, int b) {
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		return " "+a+" "+b ;
	}

	public static void main(String[] args) {
		
		System.out.println(swap(20,10));

	}

}
