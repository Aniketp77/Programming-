package day5;

import java.util.Scanner;

public class maxNumber {
 	public static void main(String[] args) {
		
Scanner ap= new Scanner(System.in);
		
		
		int n,i;
		int max[]= new int[1];
		max[0]=0;
		System.out.println("enter size of array");
		n=ap.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		
		System.out.println("Enter array ele ");
		for(i=0;i<n;i++) {
			a[i]=ap.nextInt();
		}
		
		for(i=0;i<a[i];i++) {
			if(a[i]%2==0) {
				b[i]=a[i];
			}
	
		}
		
		if(b[i]>max[i]) {
			max[0]=b[i];
			System.out.println("max numbers" + max[0]);
		}


	}

}


