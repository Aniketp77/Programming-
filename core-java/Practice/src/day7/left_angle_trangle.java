package day7;
//5*5

import java.util.*;
public class left_angle_trangle {

	public static void main(String[] args) {
		int r,s,c;
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("enter row");
		int row = s1.nextInt();
		for(r=1;r<=row;r++) {
			for(s=row;s>=r;s--) {
				System.out.print(" ");
			}
			for(c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
