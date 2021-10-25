
public class petType extends Pet {
	
	String petType;
	
	petType (String pn, String on,int pa, boolean sp, boolean hp, int op, String pt){
		super(pn, on, pa, sp, hp, op);
		this.petType = pt;

		
	}
	
	 public String toString(){
		 return super.toString() + "\n Pet type: " + petType + "\n" + "\n**INFO STORED UNDER PET**\n";
		 
	 }

}

