package practice;


class Employee {
    private String name;
    protected int age=20;
    
    public String getName() { 
    	return name; 
    	}
    public void setName(String name) 
    { 
    	this.name = name; 
    }
    

}


public class encapulation{

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("aniket");
		System.out.println(e1.getName());
		
		System.out.println(e1.age);
	
		for(int i=1;i<=10;i++) {
			
			System.out.println("35*"+i+"="+i*35);
		}
	}

}
