package day17;

public class task {

	public static void main(String[] args) {
		
		int []a =new int [10];
		int b[] = {2,2,4,5,6,6,7};
		
//		int count=0;
		for(int i=0;i<=b.length-1;i++) {
			for(int j=i+1;j<=b.length-2;j++) {
					if(b[i]==b[j]) {
						a[i]=b[j];
					}
				 if(b[i]!=b[j]){
							a[i]+=a[i]=b[j];
						}
											}
			System.out.println(a[i]);
				}
			
			}
			
		}


