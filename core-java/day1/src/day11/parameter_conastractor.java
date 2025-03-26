package day11;

class parameter{
	 int a=10;
	 int b=20;
	 parameter(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
}
public class parameter_conastractor {

	public static void main(String[] args) {
		new parameter(45,54);

	}

}
