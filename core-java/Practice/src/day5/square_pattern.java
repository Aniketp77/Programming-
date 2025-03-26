package day5;
//task 1
//5 5 5 5 5
//4 4 4 4 4
//3 3 3 3 3
//2 2 2 2 2
//1 1 1 1 1
public class square_pattern {

	public static void main(String[] args) {
//		int i;
//		
//		int a[]= {5,4,3,2,1};
//		int length = 5;
//		int r,c;
//		for(r=0;r<length;r++) {
//			for(c=0;c<5;c++) {
//				System.out.print(a[r]);
//		}
//			System.out.println();
//	}
		
		int r,c,i;
		for(r=5;r>=1;r--) {
			for(c=0;c<5;c++) {
				System.out.print(r);
			}
			System.out.println();
		}

}
}
