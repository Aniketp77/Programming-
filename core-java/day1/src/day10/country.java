package day10;


class countryy{
	void states() {
		System.out.println("states");
	}
	void kendra_shashit_pradesh() {
		System.out.println("jammu-kashmit,delhi.....");
	}
}
class state extends countryy{
		void karnataka(){
			System.out.println("speaking kannada language");
		}
		void maharashtra () {
			System.out.println("speaking marathi language");
		}
}
class village extends countryy{
		void kadoli() {
			System.out.println("famous in dasara");
		}
		void marunji() {
			System.out.println("every where buildings only ");
		}
}
class city extends countryy{
		void pune() {
			System.out.println("very big city");
		}
		void belgaum() {
			System.out.println("good environment");
		}
}
public class country  {

	public static void main(String[] args) {
		city c1 = new city();
		c1.pune();
		c1.states();
		c1.belgaum();
		c1.kendra_shashit_pradesh();
		
		village v1 = new village();
		v1.kadoli();
		v1.marunji();
		v1.states();
		
		state s1= new state();
		s1.karnataka();
		s1.maharashtra();
		s1.kendra_shashit_pradesh();
	}

}
