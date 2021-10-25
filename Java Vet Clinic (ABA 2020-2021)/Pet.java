
public class Pet { // this is the parent (super) class

	
	//Data
	public boolean strayPet; //identifies that strayPet is a boolean 
	public boolean healthyPet; //identifies that healthyPet is a boolean 
	public String petName;//identifies that petName is a string 
	public String ownerName;//identifies that ownerName is a string 
	private int ownerPhone;//identifies that ownerPhone is an int 
	public int petAge;//identifies that petAge is an int 
	
	//Constructor 
	Pet (String pn, String on,int pa, boolean sp, boolean hp, int op){ //
		this.petName = pn; //identifies that string pn (from line above) is equal to petName (pn is a shortcut)
		this.ownerName = on;
		this.petAge = pa;
		this.strayPet = sp;
		this.healthyPet = hp;
		this.ownerPhone = op;		
	}
	
	//actions	
	public int getPhone () {//gets phone int
		return this.ownerPhone;//returns it
	}
		
	public void setPhone (int op) {
		if (op > 0)//says owners phone number must be greater than 0
			this.ownerPhone = op;
		
	}
	
	
	public int getAge () {
		return this.petAge;
	}
	
	public void setAge(int pa){
	    if (pa >= 1)//says pet age can either be equal to or more than 1 
	      this.petAge = pa;
	  }
	

		@Override
	 public String toString(){//this is how the users input will be stored and printed out when printed using linkedlist
		  return "\nOwner name:" + ownerName + "\nOwner phone number: " + ownerPhone + "\nStray: "+ strayPet + "\nHealthyPet: " + "\nPet name: " + petName + "\nPet age: " + petAge;
	 }
		  
}

	


