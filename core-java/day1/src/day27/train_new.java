package day27;

class trainn{
	public void check(int num)
	{
		int a[]= {10,45,67,89};
		
		System.out.println(a[num]);
	}
}

class personn1 extends Thread{
	trainn t1=new train();
	
	
	public void run() {
		t1.check(21);
	}
}

public class train_new {

	public static void main(String[] args) {
		person1 t1=new person1();
		t1.start();

	}

}
