package vaibhav_sir;

public class space {

	public static void main(String[] args) {
		
		int a[]= {23,45,67,23,57,57,67,25};
		
		int []b = new int  [10];
		
//		int count=0;
		for(int i=0;i<a.length;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
				  if(a[i]!=a[i+1])
				  {
					   b[i]=a[j];
				  }
		
			 }
			 
			 System.out.println("Duplicats Nu: " + b[i]);
		}
		
		

	}

}
