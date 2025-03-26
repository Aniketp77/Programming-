package day9;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
Scanner s1= new Scanner(System.in);
		
		System.out.println("enter number of row");
		int row=s1.nextInt();
		
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		for(int r=row;r>=1;r--) {
			for(int c=1;c<=r-1;c++) {
				System.out.print(c);
			}
			System.out.println();
		}


	}

}
