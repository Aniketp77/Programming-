package day18;

public class WordCharReverse {

	public static void main(String[] args) {
		
		WordCharReverse wr =new WordCharReverse();
		
	wr.secoud();

	}
		void secoud() {
			String str ="very good friends";
			String strar[]=str.split(" ");
			String revstr="";
			
			for(int i=0;i<strar.length;i++) {
				String word=strar[i];
				
				String revword=" ";
				for(int j=word.length()-1;j>=0;j--) {
					revword=revword+word.charAt(j);
				}
				revstr=revstr+revword;
				
			}
			System.out.println(revstr);

	}

}
