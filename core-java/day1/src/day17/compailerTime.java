package day17;
class staff{
	public void disp(double x, int y) {
		System.out.println("way to pune");
	}
	void disp(int y, double x) {
		
		this.disp(2,2.2);
		System.out.println("come to india");
	}
}
public class compailerTime {

	public static void main(String[] args) {
		staff s1=new staff();
//		s1.disp(12.2, 34);
		s1.disp(20,32.2);
	}

}
