package day24;

class video extends Thread{
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("video playing");
		}
	}
}
class audio extends Thread{
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.println("audio playing");
		}
	}
}
public class multi_threading_pgm {

	public static void main(String[] args) {
		
		video v1=new video();
		v1.start();
		
		audio a1=new audio();
		a1.start();
	}


}
