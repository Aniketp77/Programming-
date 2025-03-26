package day18;


abstract class RBI{
	
	abstract void BOIImp();
	abstract void SBIImp();
	
	
	void rules() {
		System.out.println("come early");
		System.out.println("go late");
		System.out.println("dont use mod when doing work");
	}
}
class BOI extends RBI{
	void BOIImp() {
		System.out.println("Bank Of India");
		
	}
	
	void rules() {
		super.rules();
	}

	@Override
	void SBIImp() {
		// TODO Auto-generated method stub
		
	}
}

class  SBI extends RBI{
	
	void SBIImp() {
		System.out.println("SBI");
	}
	void rules() {
		super.rules();
	}
	@Override
	void BOIImp() {
		// TODO Auto-generated method stub
		
	}
}

public class abstractionclass {

	public static void main(String[] args) {
		
		RBI r1 = new BOI();
		r1.BOIImp();
		r1.rules();
		
		RBI r2 = new SBI();
		r2.rules();
		r2.SBIImp();

	}
}
