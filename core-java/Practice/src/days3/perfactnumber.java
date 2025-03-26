package days3;
import java.util.*;
//perfect number
public class perfactnumber {

	public static void main(String[] args) {
		
		int number;
		int sum=0;
		Scanner s1=new Scanner(System.in);
		
		
		System.out.println("enter the number");
		number=s1.nextInt();
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(number==sum) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" number is not perfect");
		}

	}

}
