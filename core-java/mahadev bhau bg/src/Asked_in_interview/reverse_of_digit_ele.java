package Asked_in_interview;

import java.util.Arrays;

public class reverse_of_digit_ele {

	public static void main(String[] args) {
		int arr[]= {41,98,12,13,24,94};
		
		int length =arr.length-1;
	
		int rem=0;
		
	for(int i=length;i>=0;i--) {
		int data=arr[i];
		int rev=0;
			while(data>0) {
				
				rem=data%10;//4//9
				rev=rev*10+rem;//4//49
				data=data/10;//9//0
			}
		System.out.println(rev);
	
	}

	}

}
