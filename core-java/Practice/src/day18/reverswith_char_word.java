package day18;

public class reverswith_char_word {

	public static void main(String[] args) {
		reverswith_char_word  rcw=new reverswith_char_word();
		rcw.third();
		
	}
		void third() {
			
			String revstr="";
			String str="you are very good person";
			
			//word reverse : 
			String strar[]=str.split(" ");
			
			for(int i=strar.length-1;i>=0;i--) {
				
				String word=strar[i];
				String revword=" ";
				for(int j=word.length()-1;j>=0;j--) {
					revword=revword+word.charAt(j);
				}
				revstr=revstr+revword;
			}
			System.out.println("word reverse : "+revstr);
	
	}

}
