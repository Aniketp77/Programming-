package day6;
import java.util.*;
public class arrayaddition {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int a[][] = new int [3][3];
//		int c[][] = new int [3][3];
		int r,c,sum=0;
		
		System.out.println("Enter array ele");
		
		for(r=0;r<3;r++) {
			for(c=0;c<3;c++) {
				a[r][c]=s1.nextInt();
			}
		}
		
		for(r=0;r<3;r++) {
			for(c=0;c<3;c++) {
				System.out.print(a[r][c] + "  ");
			}
			System.out.println("");
		}
		
		int b[][] = new int [3][3];
		
		System.out.println("Enter array ele");
		
		for(r=0;r<3;r++) {
			for(c=0;c<3;c++) {
				b[r][c]=s1.nextInt();
			}
		}
		
		for(r=0;r<3;r++) {
			for(c=0;c<3;c++) {
				System.out.print(b[r][c] + "  ");
			}
			System.out.println("");


	}
		for(r=0;r<3;r++) {
			for(c=0;c<3;c++) {
				sum=a[r][c]+b[r][c];
				
				System.out.print(sum + " ");
			}
			System.out.println();

		
		}
		
	}

}
