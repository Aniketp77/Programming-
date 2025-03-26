package series;

public class prime_number {
	
	
	public static int prime_number(int num) {
		if(num==0||num==1) {
			return -1;
		}
	for(int i=2;i<num/2;i++) {
		if(num%i==0) {
			return -1;
		}
		
	}
	return 1;
	
	}
	public static void main(String[] args) {
		//devisible it-self and 1;
		
		//2,3,5,7,
		
	int res=	prime_number(46);
		if(res==-1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		

	}

}
