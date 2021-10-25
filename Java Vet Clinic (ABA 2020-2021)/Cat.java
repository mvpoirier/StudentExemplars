
public class Cat extends Pet{


	boolean clawsCat;
	
	

	Cat (String pn, String on,int pa, boolean sp, boolean hp, int op, boolean c){
		super(pn, on, pa, sp, hp, op);
		this.clawsCat = c;
	}
		
		
	 public String toString(){
		 return super.toString() + "\nClaws (yes/no):" + clawsCat+ "\n**INFO STORED UNDER CAT**\n"; 
	 }
	
	
}
