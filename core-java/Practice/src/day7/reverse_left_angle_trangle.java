package day7;

public class reverse_left_angle_trangle {

	public static void main(String[] args) {
		int r,s,c;
		for(r=1;r<=4;r++) {
			for(s=1;s<r;s++) {
			System.out.print(" ");
			}
			for(c=4;c>=r;c--) {
				System.out.print("1");
			}
			System.out.println();
			
		}

	}

}
