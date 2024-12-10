package cont.org;

public class A  {

	


	public static void main(String[] args) {
		
	
		B obj[] = new B[5];
		
		obj[0] = new B(84092375,"Arun");
		obj[1] = new B(7917238,"Navin");
		obj[2] = new B(13892839,"Ajith");
		obj[3] = new B(34356,"Dell");
		obj[4] = new B(89812,"Lenova");
		
		
		
		
		for(int i=0; i<obj.length;i++) {
			
			System.out.println(obj[i].pro_id+":"+obj[i].pro_name);
			
		}
		
		
		
		
	}

}
