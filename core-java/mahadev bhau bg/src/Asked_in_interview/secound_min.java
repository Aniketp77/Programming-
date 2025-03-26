package Asked_in_interview;

public class secound_min {

	public static void main(String[] args) {
		int arr[]= {2,4,6,7,3,1};
		int firstmin=arr[0];
		int secoundmin=arr[0];
		
//		int length =arr.length();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstmin) {
				firstmin=arr[i];
			}
			
		}
		for(int j=0;j<arr.length;j++) {
		
			if(arr[j]<secoundmin && arr[j]!=firstmin) {
				secoundmin=arr[j];
			}
		}
		System.out.println(secoundmin);
		
	}

}
