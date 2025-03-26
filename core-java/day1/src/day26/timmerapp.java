package day26;

public class timmerapp {

	public static void main(String[] args) {
		
		int sec=0,min=0;
		for(int hours=1;hours<=2;hours++) {
		
		for(min=1;min<=60;min++) {
		
		for(sec=0;sec<=60;sec++) {
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e) {
				
			}
		System.out.println("secound is:" +sec);
		}
		System.out.println("minutes is:"+min);
		}
		System.out.println("hours is :"+hours);
		
		}
	


	}

}
