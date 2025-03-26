package Asked_in_interview;

public class sum_odd_ele {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,7};
		int oddsum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddsum=oddsum+arr[i];
			}
		}
		System.out.println(oddsum);
		

	}

}
