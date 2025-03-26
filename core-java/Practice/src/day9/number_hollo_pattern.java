package day9;

public class number_hollo_pattern {

	public static void main(String[] args) {
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=4;c++) {
				if(r==1||r==4||c==1||c==4) {
					System.out.print("1");
				}
				else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}

}
