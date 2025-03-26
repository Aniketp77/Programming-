package day9;

import java.util.Scanner;

public class righpascalswith_charectors {

	public static void main(String[] args) {
		
Scanner s1= new Scanner(System.in);
		
		System.out.println("enter number of row");
		int row=s1.nextInt();
		
		for(int r=1;r<=row;r++) {
			 char ch = (char) ('A' + r - 1);
			for(int c=1;c<=r;c++) {
				
				System.out.print(ch);
			
			}
			
			System.out.println();
		}
		
		for(int r=row-1;r>=1;r--) {
			  //r=6-1=5;6>=1;4;
			  //r=5-1=4;5>=1
			  //
			char ch = (char) ('A' + r - 1);//
			for(int c=1;c<=r;c++) {
				//c=1;1<=5;2;
				//c=2;2<=5;3;
				//c=3;3<=5;4;
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
