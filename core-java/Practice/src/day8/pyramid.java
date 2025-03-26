package day8;

public class pyramid {

	public static void main(String[] args) {
		int r,s,c;
		
		for(r=1;r<=4;r++) {
			for(s=4;s>r;s--) {
				System.out.print(" ");
			}
				for(c=1;c<=r;c++) {
					System.out.print("* ");
				}
				
			System.out.println();
		}
	

	}

}
