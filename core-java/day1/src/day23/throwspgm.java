package day23;

class aniket {
	public void get(int a[], int n )throws ArrayIndexOutOfBoundsException,NullPointerException
	{
		System.out.println( a[n]);
	}
}
public class throwspgm {

	public static void main(String[] args) {
		int a[]= {23,43,65,76,9};
		
		aniket a1=new aniket();
		try {
		a1.get(a,7);
	}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of range");
		}

	}

}
