package day25;

class audio extends Thread{
	public void run() {
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<=6;i++) {
			System.out.println("aniket");
		}
	}
}

public class methods_exception_handling {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		audio a1=new audio();
		a1.start();
		
		for(int j=0;j<=6;j++) {
			System.out.println("paradeshi");
		}
	}

}
