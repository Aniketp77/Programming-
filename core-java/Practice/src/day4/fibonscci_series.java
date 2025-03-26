package day4;

public class fibonscci_series {

	public static void main(String[] args) {
	    {
	        int n2=1,n1=0;
	        int cnt=0;
	        int num=10;
	    System.out.println(n1+" "+n2);
	        while(cnt<=num){ 
	              int n=n1+n2;
	            System.out.println(n);
	         
	            
	            n1=n2;
	            n2=n;
	            cnt+=1;

	        }

	}

 }
}
