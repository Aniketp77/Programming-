package day11;
//find maximum number from the array.
public class findMAxofArray {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,7,5,6,6,};
		int m=0;
		int i;
		for( i=0;i<arr.length;i++)
			if(arr[i]>m) {
				m=arr[i];
			
			}
		System.out.println(m);
	}

}
