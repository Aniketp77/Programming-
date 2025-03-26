package day26;

class sample extends Thread{
	public void run() {
		
	for(int i=0;i<10;i++) {
		if(i==25) {
			System.out.println("watting...");
		try {
		Thread.sleep(1000);
		}
		catch(Exception e){
	
		}
		}
		System.out.println("this is new beggening");
	}
	}
}


public class yieldmethod {

	public static void main(String[] args) {
sample s1= new sample();
s1.start();

Thread.yield();
for(int i=0;i<10;i++) {
	System.out.println("new opportunity");
}
	}

}
