package series;

public class fibonachi_series {
	
	public static void fibonachi(int num) {
		int first=0;
		int secound=1;
		int third;
		
		
		for(int i=0;i<=num;i++) {
			
			third=first+secound;
			first=secound;
			secound=third;
			
			
			System.out.println(first);
			if(third>10) {
			
				System.out.println("otsideofloop");
				return ;
			}
			
		}
	
		}
	public static void main(String[] args) {	
		//0+1+1+2+3+5+8+13
		
		fibonachi(10);
	}

}
