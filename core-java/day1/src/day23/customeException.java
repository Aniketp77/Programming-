package day23;

class AgepgmException extends RuntimeException{
	public AgepgmException(String s){
		super(s);
		System.out.println("Good Morning ");
		
	}
}

public class customeException {

	public static void main(String[] args) {

		int age=12;
		
		if(age>=18) {
			System.out.println("valid for voting");
		}
		else{
			
			try
			{
			throw new AgepgmException("age is invalid for voting");
			}
			catch(Exception e)
			{
				 System.out.println(e.getMessage());
			}
			

		}
		System.out.println("plase come and vote");
	}

}
