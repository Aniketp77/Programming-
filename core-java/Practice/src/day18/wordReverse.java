package day18;

public class wordReverse {

	public static void main(String[] args) {
		
		wordReverse	 wr =new wordReverse();
		wr.first();

	}
	
	void first() {
		
		String revstr="";
		String str="you are very good person";
		
		//word reverse : 
		String strar[]=str.split(" ");
		
		for(int i=strar.length-1;i>=0;i--) {
				
			revstr=revstr+strar[i]+" ";
		}
		System.out.println("word reverse : "+revstr);
	}
	

}
