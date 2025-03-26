package day4;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		
		Scanner ap= new Scanner(System.in);
		int n, temp, rev=0,rem;
		String choice;
	System.out.println("can you enter any number you going to reverse");
	n = ap.nextInt();
	temp=n;
		
	do {
		while(temp>0) {
			
			rem =temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==n) {
		System.out.println(rev);
		}
		
		System.out.println("enter yes if wnat to continue ");
		choice= ap.next();

	}while(choice.equals("yes"));
	
	}	

}
