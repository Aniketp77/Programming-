package day5;
//task2:
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
public class task2 {

	public static void main(String[] args) {
		int r,c;
		
		int a[]= {1,2,3,4,5};
		int length = 5;
		
		
		for(r=0;r<length;r++) {
			for(c=0;c<5;c++) {
				System.out.print(a[c]);
			}
			System.out.println();
			
		}

	}

}
