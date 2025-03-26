package day19;

//fortune cloud
import java.util.*;

public class removespecificchar {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter any String ");
		String str=s1.next();
		
		System.out.println("Enter charector to be going to remove");
		char ch = s1.next().charAt(0);
		
		System.out.println("Enter what you going to replace");
		char ch1 = s1.next().charAt(0);
		
		int flag=0;
		
		int i=0;
		while(i<str.length()-1) {
			
			if(str.charAt(i)==(ch)) {
				flag=1;
				str=str.replace(ch, ch1);
			}
			i++;
		}
		System.out.println("modify string :"+str);


	}

}

