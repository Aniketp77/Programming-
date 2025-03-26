package day10;

public class pyaramid_withnumber {

	public static void main(String[] args) {
		int num=0;
		for(int r=1;r<=4;r++) {
			for(int s=4;s>r;s--) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print(num+" ");
				num++;
		
			}
			System.out.println();
		}
		
		

	}

}
