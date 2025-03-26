package day5;
//task3:
//* * * *
//1 1 1 1
//* * * *
//1 1 1 1
public class task_3 {

	public static void main(String[] args) {
		int r,c;
		
		
		for(r=0;r<4;r++) {
			for(c=0;c<4;c++) {
				if(r%2!=0) {
					System.out.print("* ");
				}
				else {
					System.out.print("@ ");
				}
				
			}
			System.out.println();
		}

	}

}
