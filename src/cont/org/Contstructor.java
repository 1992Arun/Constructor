package cont.org;

public class Contstructor {
	
	
	public Contstructor() {
		
	 
		
		System.out.println("inside the parent default contstractor");				
		
	}
	
	
	
public Contstructor(int a) {
	
	this(23.11f);
		
		System.out.println("inside the parent Int contstractor"+ a);
				
	}


public Contstructor(String name) {
	
	this (24);
	
	System.out.println("inside the parent String contstractor"+ name);
	
			
}

public Contstructor(float b) {
	
	System.out.println("inside the parent Float contractor"+ b);
		
}
	  public static void main(String[] args) {
		
		  
		  new Contstructor();
		  
		 
		  
		  
	}

}
