package array;

public class remove_ele {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};  
	        int n = arr.length;

	        // Remove duplicates
	        int[] temp = new int[n]; // Temporary array to store unique elements
	        int j = 0; 

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int k = 0; k < j; k++) {
	                if (arr[i] == temp[k]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                temp[j] = arr[i];
	                j++;
	            }
	        }

	        // Print the unique elements
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }

	}

}
