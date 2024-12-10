package cont.org;

public class Test  {
	
	
	
	
	public static void main(String[] args) {
		
	
		
		Square[] t = new Square[2];
		
		t[0]= new Square(2);
		t[1]= new Square(3);
		
		Rectangle r[] = new Rectangle[3]; 

		r[0] = new Rectangle(5);
		r[1] = new Rectangle(5);
		r[2] = new Rectangle(5);

     for(int i=0; i<=t.length-1; i++) {
    	 
    	 System.out.println(t[i].computeArea());
    	 
     }
     
 for(int i=0; i<=r.length-1; i++) {
    	 
    	 System.out.println(r[i].area());
    	 
     }
		
	}

}
