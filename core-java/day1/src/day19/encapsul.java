package day19;

class car{
	private int cnumber;//data hiding

	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	/*
	 * public void set(int x) {//setter cnumber =x; } public int display() {//getter
	 * return cnumber; }
	 */
	
}
public class encapsul {

	public static void main(String[] args) {
		car c1=new car();
		c1.setCnumber(85657);
//		int a= c1.display();
//		System.out.println("engine number is : "+ a);
		System.out.println("engine number is : " + c1.getCnumber());
	}

}
