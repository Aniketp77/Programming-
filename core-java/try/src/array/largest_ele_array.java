package array;

public class largest_ele_array {

	public static void main(String[] args) {
		
		int arr[]= {3,2,1,4,5,5,2};

		int largest=arr[0];
		int slargest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>largest) {
					largest=arr[i];
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>slargest && arr[j]!=largest) {
				slargest=arr[j];
			}
		}
		System.out.println(slargest);
		
	}

}
