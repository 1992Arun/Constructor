package cont.org;

public class ChildContstructor extends Contstructor {
	
	
	
	ChildContstructor(){
		
		this ("Kevin");
		
		
		
		System.out.println("Inside default ChildContstructo");
	}
	
	
	ChildContstructor(String name ){
		
		super(23);
		
		System.out.println("Inside string ChildContstructo"+name);
	}
	
	
	public static void main(String[] args) {
		
	
	
	new ChildContstructor();
	
	
	

}
}