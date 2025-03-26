package day5;
import java.util.*;
public class oddNumber {

	public static void main(String[] args) {
		
		Scanner ap= new Scanner(System.in);
		
		
		int n,i;
		
		System.out.println("enter size of array");
		n=ap.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		
		System.out.println("Enter array ele ");
		for(i=0;i<n;i++) {
			
			a[i]=ap.nextInt();
		}
		for(i=0;i<n;i++) {
		if(a[i]%2==0) {
			b[i]=a[i];
			System.out.println("evan numbers" + b[i]);
		}
		else {
			System.out.println("odd numbers" + a[i]);
		}
		}

	}

}
