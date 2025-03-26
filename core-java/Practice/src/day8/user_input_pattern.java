package day8;
import java.util.*;
public class user_input_pattern {

	public static void main(String[] args) {
		 int r,s,c;
		 
		 Scanner s1=new Scanner(System.in);
		 
			System.out.println("enter number of rows");
			int user=s1.nextInt();
			
			for(r=1;r<=user;r++) {
				for(s=user;s>r;s--) {
					System.out.print(" ");
				}
					for(c=1;c<=r;c++) {
						System.out.print("* ");
					}
					
				System.out.println();
			}
			
			for(r=1;r<=user;r++) {
				for(s=1;s<=r;s++) {
					System.out.print(" ");
				}
				for(c=user;c>r;c--) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
