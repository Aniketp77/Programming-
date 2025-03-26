package day11;
import java.util.*;
class method{
	
	void min(Scanner s1) {
		
	
		System.out.println("Enter the size of array");
		int size=s1.nextInt();
		
		int []arr = new int [size];
		
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			 arr[i] =s1.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println("Minimun number of an given array : "+min);
		
		
	}
	void even_no(Scanner s1) {
		
		System.out.println("Enter the size of array");
		int size=s1.nextInt();
		
		int []arr = new int [size];
		
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			 arr[i] =s1.nextInt();
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.println("Total even number of an array : "+count);
	
	}
	
	void avg(Scanner s1) {
		
		System.out.println("Enter the size of array");
		int size=s1.nextInt();
		
		int []arr = new int [size];
		
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			 arr[i] =s1.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int avg= sum/arr.length;
		System.out.println("The arrray element of given array : "+avg);
	}
	
	
}

public class CreateThreeMethod {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		method m1=new method();
		
		while(true) {
	        System.out.println("\nChoose an operation:");
            System.out.println("1. Find Minimum");
            System.out.println("2. Count Even Numbers");
            System.out.println("3. Calculate Average");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
		
		
		int choice =s1.nextInt();
	
		
		switch(choice) {
			case 1:
				m1.min(s1);
				break;
			case 2:
				m1.even_no(s1);
				break;
			
			case 3:
				m1.avg(s1);
				break;
			case 4:
				break;
			}
		}
		
	}

}
