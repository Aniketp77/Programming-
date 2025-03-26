package day8;

public class dimond_pattern_withnumbers {

	public static void main(String[] args) {
		 int r,s,c;
			
			for(r=1;r<=4;r++) {
				for(s=4;s>r;s--) {
					System.out.print(" ");
				}
					for(c=1;c<=r;c++) {
						System.out.print(c+" ");
					}
					
				System.out.println();
			}
			
			for(r=1;r<=4;r++) {
				for(s=1;s<=r;s++) {
					System.out.print(" ");
				}
				for(c=4;c>r;c--) {
					System.out.print(c+" ");
				}
				System.out.println();
			}

	}

}
