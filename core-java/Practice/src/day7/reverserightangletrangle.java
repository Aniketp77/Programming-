package day7;

public class reverserightangletrangle {

	public static void main(String[] args) {
		int r,c;
		for(r=1;r<=4;r++) {
			for(c=4;c>=r;c--) {
				if(r%2!=0) {
				System.out.print("@");
				}
				else {
		System.out.print("*");}
		}
			System.out.println();
		}

	}

}
