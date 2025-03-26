package day9;

public class hollo_pattarn_5into5 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=5;c++) {
				if(r==1||r==5||c==1||c==5) {
					System.out.print("1");
				}
				else if(r==2||r==4||c==2||c==4){
					System.out.print("2");
				}
				else {
					System.out.print("3");
				}
			}
			System.out.println();
		}

	}

}
