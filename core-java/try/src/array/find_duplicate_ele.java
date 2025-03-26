package array;

public class find_duplicate_ele {

	public static int[] duplicate(int a[]) {
		
		int b[] = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[i] =a[i];
				}
			}
		}
		return b;
	}	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,4,5,6,6};
	
		int b[] =duplicate(a);
		for(int i=0;i<a.length;i++) {
			if(b[i]!=0)
			System.out.println(b[i]);
		}

	}

}
