package day22;

public class methodsinException {

	public static void main(String[] args) {

		int a=20,b=0,c;
		String ap = null;
		
		try {
		 c=a/b;
		}
		catch (ArithmeticException e){
			
			e.toString();
			
			try {
	
			 System.out.println("print length " + ap.length());
			}
			catch (NullPointerException e1){
//				
				e1.getMessage();
				
				System.out.println("error occur");
				System.out.println("aniket");
//				e.printStackTrace();
			
				
				}
			}

	}

}
