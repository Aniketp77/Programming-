package day9;

import java.util.Scanner;

public class hollo_with_userip {

	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
		
		System.out.println("enter number of row");
		int row=s1.nextInt();
		
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=row;c++) {
				if(r==1||r==row||c==1||c==row) {
					System.out.print("9");
				}
				else if(r==2||r==row-1||c==2||c==row-1){
					System.out.print("8");
				}
				
				else if(r==3||r==row-2||c==3||c==row-2){
					System.out.print("7");
				}
				else if(r==4||r==row-3||c==4||c==row-3){
					System.out.print("6");
				}
				else if(r==5||r==row-4||c==5||c==row-4){
					System.out.print("5");
				}
				else {
					System.out.println("4");
				}
			}
			System.out.println();
		}

	}

}
