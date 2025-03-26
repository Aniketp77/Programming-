package day22;

public class exceptionhandlinng {

	public static void main(String[] args) {
		int a=20,b=0,c;
		
		
		try {
			System.out.println("this is aniket : ");
		 c=a/b;
		}
		catch (ArithmeticException e){
			
			try {
				String ap = null;
			 System.out.println("print length " + ap.length());
			}
			catch (NullPointerException e1){
//				
//				e.printStackTrace();

				System.out.println("error occur getMessage: "+e1.getMessage());
				System.out.println("error occur toString: "+e1.toString());
				e1.printStackTrace();
			
				
				}
			}
//				System.out.println("div is : "+c);
		finally {
			System.out.println("hello aniket");
		}

	}

}
