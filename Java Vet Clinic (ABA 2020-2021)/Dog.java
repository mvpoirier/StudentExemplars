
public class Dog extends Pet{
	
	boolean houseTrained;
	
	Dog (String pn, String on,int pa, boolean sp, boolean hp, int op, boolean h){//inserts all variables and identifies them (this part also includes the parent (super) class variables
		super(pn, on, pa, sp, hp, op);//super refrences the parent (super) class
		this.houseTrained = h;

		
	}
	
	 public String toString(){
		 return super.toString() + "\nHouse trained (yes/no): " + houseTrained +"\n" + "\n**INFO STORED UNDER DOG**\n";
		 
	 }

}
