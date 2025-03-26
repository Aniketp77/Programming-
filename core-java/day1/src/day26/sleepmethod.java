package day26;

class prevent_thread extends Thread{
	
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

public class sleepmethod {

	public static void main(String[] args) {
		prevent_thread pt = new prevent_thread();
		pt.start();
		
		Thread.yield();
		
		for(int i=0;i<10;i++) {
			System.out.println("aniket");
		}
	
	}
}

