import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.lang.Thread;//used for thread.sleep (recieved from)//https://stackoverflow.com/questions/43507587/how-to-pause-my-java-program-for-2-seconds

/**
 * 
 * @author C.F. - ABA Oman International School (2020-2021)
 *
 */
public class Main {

	private static final int j = 0;

	public static void main(String[] args) {
		
		LinkedList <Pet> petList = new LinkedList <Pet> (); // created a linked list for the parent class to then have the child classes add to this linked list
		
		Scanner s = new Scanner(System.in); //defining scanner as "s"
		
	
		System.out.println("Welcome to the Al Qurum Veterinary Clinic"); //output welcome message
		  try 
	      {
	        Thread.sleep(500);//pauses the program for 0.5 second
	      } 
	          catch(InterruptedException e) //catches the InterruptedException
	      {
	      }
		
		System.out.println("                       /)\n"
				+ "              /\\___/\\ ((\n"
				+ "              \\`@_@'/  ))\n"
				+ "              {_:Y:.}_//\n"
				+ "    ----------{_}^-'{_}----------");//https://www.asciiart.eu/animals/cats
	
	    System.out.println("-----------------------------------------------------------------------------------------\n");
	    
	    try //https://stackoverflow.com/questions/18025337/fixing-error-unreported-exception-interruptedexception/18025466
	      {
	        Thread.sleep(1000);//pauses the program for 1 second
	      } 
	          catch(InterruptedException e)
	      {
	     // this part is used for when the InterruptedException occurs which occurred all the time when using Thread.sleep();
	      }
		
		boolean clinic = true ; 
		
	
		
		while (clinic) { //while the boolean "clinic" is equal to true, the game will continue to loop until "clinic" is equal to false
		
			  try 
		      {
		        Thread.sleep(500);//pauses the program for 0.5 second
		      } 
		          catch(InterruptedException e) //catches the InterruptedException
		      {
		      }
			  
			System.out.println("Choose one of the three options below:\nOption 1: Dog \nOption 2: Cat \nOption 3: Other pet\nOption 4: Customer Service \n\n"); //shows the user the three options they may choose from
			
			int selection; //defines the variable selection as an integer 
			System.out.print ( "\nSelection(a number): " );//outputs the selection option
		    selection = s.nextInt();//stores users input as "selection". The s.nextINT makes sure the input is stored as an integer
		    
		    System.out.println("-----------------------------------------------------------------------------------------");//just a line to segregate the two parts
		    
		    try 
		      {
		        Thread.sleep(500);//pauses the program for 0.5 second
		      } 
		          catch(InterruptedException e) //catches the InterruptedException
		      {
		      }
		   
	        
			switch (selection) { //takes the chosen int from the user in "selection"
		    
		    	case 1: // case 1 which is equal to option 1 
		    		System.out.println("Youve chosen option 1: Dog \n\nPlease fill in the info down below \n");
		    		
		    		
		    		String petName;//identifies whether the variable is a string, int, char or boolean - in this case, its a string
		    		System.out.println("Pets name (N/A if its unknown):");
		    		petName = s.next();//saves the users input
		    		
		    		String ownerName; 
		    		System.out.println("Your name (N/A if its stray):");
		    		ownerName = s.next();

		    		int petAge;
		    		System.out.println("Pets age (-1 if stray/unknown):");
		    		petAge = s.nextInt();
		    		
		    		boolean strayPet; 
		    		System.out.println("Stray (true/false): ");
		    		strayPet = s.nextBoolean();
		    		
		    		boolean healthyPet; 
		    		System.out.println("Healthy (true/flase): ");
		    		healthyPet = s.nextBoolean();
		    		
		    		int ownerPhone;
		    		System.out.println("Your phone number(-1 if stray):");
		    		ownerPhone = s.nextInt();
		    		
		    		boolean houseTrained;
		    		System.out.println("House trained (true/false):");
		    		houseTrained = s.nextBoolean();
		    		
		    		Dog Cindy = new Dog (petName, ownerName, petAge, strayPet, healthyPet, ownerPhone, houseTrained); //using the parent class, "Pet", the dog class extends pet and stores the data from both pet and dog class
		    		
		    		petList.add(Cindy);//adds the new dog "Cindy" to the linked list
		    		
		    		System.out.println("Sorting all pets by Age - youngest to oldest"); //output 

		    		try 
		    	        {
		    	          Thread.sleep(1000);//sleeps for 1 seconds
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	            System.out.print("██");//prints without "ln" after print which makes the code print in the same line, giving effect of a bar loading
		    	    try 
		    	        {
		    	          Thread.sleep(500);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.print("███");
		    	    try 
		    	        {
		    	          Thread.sleep(300);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.print("████");
		    	    try 
		    	        {
		    	          Thread.sleep(200);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.print("████");
		    	    try 
		    	        {
		    	          Thread.sleep(200);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.println("100% \n");//prints 100%
		    	    try 
	    	        {
	    	          Thread.sleep(1000);
	    	        } 
	    	            catch(InterruptedException e)
	    	        {
	    	        }
		    		                        
		    	    Object[]arrayPettt = petList.toArray();//make pet list into an array
		    		
			        int listLength = arrayPettt.length; //list length is equal to the length of the arrayPet
				
			        Object temp; //create object temp
				
			        for (int i = 0; i < listLength; i ++) { // i = 0 and i less than the listLength and then post increment i 
			        	for (int j = 0; j < listLength - (i+1); j++) { // j = 0 and j less than listLength - i+1 and then post increment j
			        		if ((((Pet) arrayPettt[j]).getAge() > ((Pet)arrayPettt[j+1]).getAge())){ // if the arrayPettt from Pet with Age is greater than Pet arrayPett (j+1) with age than
								temp = arrayPettt [j];//temp is equal to arrayPett
								arrayPettt[j] = arrayPettt[j+1]; //add j + 1 to arrayPett
								arrayPettt[j+1] = temp; // arrayPett with j+1 is equal to temp
			        		}	
			        	}
			        }
		    		System.out.println(Arrays.toString(arrayPettt)); // prints out the sorted arrayPettt
		    		

		    		
		    		
		    		System.out.println("\nWould you like to log a new pet (yes/no?): ");
		    	      s.nextLine();
		    	      String playAgain11 = s.nextLine();
		    	      
		    	      if (playAgain11.equalsIgnoreCase("no")){
		    	    	 System.out.print("");
		    	    	 try 
			    	        {
			    	          Thread.sleep(550);
			    	        } 
			    	            catch(InterruptedException e)
			    	        {
			    	        }
		    	        System.out.print("      |\\      _,,,---,,_\n"
		    	        		+ "ZZZzz /,`.-'`'    -.  ;-;;,_\n"
		    	        		+ "     |,4-  ) )-,_. ,\\ (  `'-'\n"
		    	        		+ "    '---''(_/--'  `-'\\_)");//https://www.asciiart.eu/animals/cats
		    	        try 
		    	        {
		    	          Thread.sleep(1000);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	        System.out.print("\nThank you for coming in!\nWe hope you join us again at Al Qurum Veterinary Clinic");
		    	        clinic = false;
		    	      }
		    	      break;

		    		
		    		
		    	case 2:
		    		System.out.println("Youve chosen option 2: Cat \n\nplease fill in the info down below \n");
		    		
		    	
		    		String petNamee;
		    		System.out.println("Pets name (N/A if its unknown):");
		    		petName = s.next();
		    		
		    		String ownerNamee; 
		    		System.out.println("Your name (N/A if its stray):");
		    		ownerName = s.next();

		    		int petAgee;
		    		System.out.println("Pets age (-1 if stray/unknown):");
		    		petAge = s.nextInt();
		    		
		    		boolean strayPett; 
		    		System.out.println("Stray (true/false): ");
		    		strayPet = s.nextBoolean();
		    		
		    		boolean healthyPett; 
		    		System.out.println("Healthy (true/false): ");
		    		healthyPet = s.nextBoolean();
		    		
		    		int ownerPhonee;
		    		System.out.println("Your phone number(-1 if stray):");
		    		ownerPhone = s.nextInt();
		    		
		    		boolean clawsCat;
		    		System.out.println("Claws (true/false) :");
		    		clawsCat = s.nextBoolean();
		    		
		    				
		    		Cat Cindyy = new Cat (petName, ownerName, petAge, strayPet, healthyPet, ownerPhone, clawsCat);
		    		
		    		petList.add(Cindyy);
		    		
		    		  try 
				      {
				        Thread.sleep(500);//pauses the program for 0.5 second
				      } 
				          catch(InterruptedException e) //catches the InterruptedException
				      {
				      }
		    		
		    		System.out.println("Sorting all pets by Age - youngest to oldest");

		    		try 
		    	        {
		    	          Thread.sleep(1000);//sleeps for 0.4seconds
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	            System.out.print("██");//prints without "ln" after print which makes the code print in the same line, giving effect of a bar loading
		    	    try 
		    	        {
		    	          Thread.sleep(500);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.print("███");
		    	    try 
		    	        {
		    	          Thread.sleep(300);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.print("████");
		    	    try 
		    	        {
		    	          Thread.sleep(200);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.print("████");
		    	    try 
		    	        {
		    	          Thread.sleep(200);
		    	        } 
		    	            catch(InterruptedException e)
		    	        {
		    	        }
		    	    System.out.println("100%\n");//prints 100%
		    	    try 
	    	        {
	    	          Thread.sleep(1000);
	    	        } 
	    	            catch(InterruptedException e)
	    	        {
	    	        }       
		    	   
		    	    Object[]arrayPett = petList.toArray();
		    		
			        int listLengthh = arrayPett.length;
				
				
			        for (int i = 0; i < listLengthh; i ++) {
			        	for (int j = 0; j < listLengthh - (i+1); j++) { 
			        		if ((((Pet) arrayPett[j]).getAge() > ((Pet)arrayPett[j+1]).getAge())){
								temp = arrayPett [j];
								arrayPett[j] = arrayPett[j+1];
								arrayPett[j+1] = temp;
			        		}	
			        	}
			        }
		    		System.out.println(Arrays.toString(arrayPett));
		    		
		    		//ADD BUBBLE SORT
		    		
		    		
		    		System.out.println("\nWould you like to log a new pet (yes/no?): ");
		    	      s.nextLine();
		    	      String playAgain111 = s.nextLine();
		    	      
		    	      if (playAgain111.equalsIgnoreCase("no")){
		    	    	  System.out.print("");
			    	    	 try 
				    	        {
				    	          Thread.sleep(550);
				    	        } 
				    	            catch(InterruptedException e)
				    	        {
				    	        }
			    	        System.out.print("      |\\      _,,,---,,_\n"
			    	        		+ "ZZZzz /,`.-'`'    -.  ;-;;,_\n"
			    	        		+ "     |,4-  ) )-,_. ,\\ (  `'-'\n"
			    	        		+ "    '---''(_/--'  `-'\\_)");//https://www.asciiart.eu/animals/cats
			    	        try 
			    	        {
			    	          Thread.sleep(1000);
			    	        } 
			    	            catch(InterruptedException e)
			    	        {
			    	        }
			    	        System.out.print("\nThank you for coming in!\nWe hope you join us again at Al Qurum Veterinary Clinic");
			    	        clinic = false;
			    	      }
			    	      break;
		    		
		    		
		    	case 3: 
		    		System.out.println("Youve chosen option 3: Other pet \n\nWe do not accept these animals : bears, elephants, tigers, lions, eagles, giraffes, zebras or cows"
		    				+ "\nPlease fill in the info down below \n");
		    		String petType;
		    		System.out.println("Pet type:");
	    			petType = s.next();
	    			
	    			if (petType.equalsIgnoreCase("bears")) {
	    				System.out.println("Please enter an appropiate Pet type:");
	    				petType = s.next(); // if the user inputs bear, it'll ask the user to input something else only once
	    			}
	    			if (petType.equals("bear")) {
	    				System.out.println("Please enter an appropiate Pet type:");
	    				petType = s.next();
	    			}
	    			if (petType.equals("elephants")) {
	    				System.out.println("Please enter an appropiate Pet type:");
	    				petType = s.next();
	    			}
	    			if (petType.equals("elephant")) {
	    				System.out.println("Please enter an appropiate Pet type:");
	    				petType = s.next();
	    			}
	    			if (petType.equals("tigers")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("tiger")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("lions")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("lion")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("eagles")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("eagle")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("giraffes")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("giraffe")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("zebras")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("zebra")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("cows")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			if (petType.equals("cow")) {
		    			System.out.println("Please enter an appropiate Pet type:");
		    			petType = s.next();
	    			}
	    			
		    		String petNameee;
		    		System.out.println("Pets name (N/A if its unknown):");
		    		petName = s.next();
		    	
		    		
		    		String ownerNameee; 
		    		System.out.println("Your name (N/A if its stray):");
		    		ownerName = s.next();

		    		int petAgeee;
		    		System.out.println("Pets age (-1 if stray/unknown):");
		    		petAge = s.nextInt();
		    		
		    		boolean strayPettt; 
		    		System.out.println("Stray (true/false): ");
		    		strayPet = s.nextBoolean();
		    		
		    		boolean healthyPettt; 
		    		System.out.println("Healthy (true/false): ");
		    		healthyPet = s.nextBoolean();
		    		
		    		int ownerPhoneee;
		    		System.out.println("Your phone number(-1 if stray):");
		    		ownerPhone = s.nextInt();
		    		
		    		petType Cindyyy = new petType (petName, ownerName, petAge, strayPet, healthyPet, ownerPhone, petType);
		    		
		    		petList.add(Cindyyy);
		    		
		    		System.out.println("Sorting all pets by Age - youngest to oldest");
		    		
		    		try 
		    		{
	    	          Thread.sleep(400);//sleeps for 0.4seconds
	    	        	} 
	    	            catch(InterruptedException e)
		    			{	
	    	        	}
	    	        System.out.print("██");//prints without "ln" after print which makes the code print in the same line, giving effect of a bar loading
	    	        try 
	    	        	{
	    	          Thread.sleep(500);
	    	        	} 
	    	            catch(InterruptedException e)
	    	        	{
	    	        	}
	    	        System.out.print("███");
	    	        try 
	    	        	{
	    	        Thread.sleep(300);
	    	        	} 
	    	            catch(InterruptedException e)
	    	        	{
	    	        	}
	    	        System.out.print("████");
	    	        try 
	    	        	{
	    	          Thread.sleep(200);
	    	        	} 
	    	            catch(InterruptedException e)
	    	        	{
	    	        	}
	    	        System.out.print("████");
	    	        try 
	    	        	{
	    	          Thread.sleep(200);
	    	        	} 
	    	            catch(InterruptedException e)
	    	        	{
	    	        	}
	    	        System.out.println("100%\n");//prints 100%
	    	        try 
	    	        {
	    	          Thread.sleep(1000);
	    	        } 
	    	            catch(InterruptedException e)
	    	        {
	    	        }  		
	    	        Object[]arrayPet = petList.toArray(); //make pet list into an array
		    		
			        int listLengthhh = arrayPet.length; //list length is equal to the length of the arrayPet
				
			        //bubble sort 
			        for (int i = 0; i < listLengthhh; i ++) {
			        	for (int j = 0; j < listLengthhh - (i+1); j++) { 
			        		if ((((Pet) arrayPet[j]).getAge() > ((Pet)arrayPet[j+1]).getAge())){
								temp = arrayPet [j];
								arrayPet[j] = arrayPet[j+1];
								arrayPet[j+1] = temp;
			        		}	
			        	}
			        }
		    		System.out.println(Arrays.toString(arrayPet));
		    		

	    	        
	    	        System.out.println();
		    		System.out.println("\nWould you like to log a new pet (yes/no?): ");
		    	      s.nextLine();
		    	      String playAgain1111 = s.nextLine();
		    	      
		    	      if (playAgain1111.equalsIgnoreCase("no")){
		    	    	  System.out.print("");
			    	    	 try 
				    	        {
				    	          Thread.sleep(550);
				    	        } 
				    	            catch(InterruptedException e)
				    	        {
				    	        }
			    	        System.out.print("      |\\      _,,,---,,_\n"
			    	        		+ "ZZZzz /,`.-'`'    -.  ;-;;,_\n"
			    	        		+ "     |,4-  ) )-,_. ,\\ (  `'-'\n"
			    	        		+ "    '---''(_/--'  `-'\\_)");//https://www.asciiart.eu/animals/cats
			    	        try 
			    	        {
			    	          Thread.sleep(1000);
			    	        } 
			    	            catch(InterruptedException e)
			    	        {
			    	        }
			    	        System.out.print("\nThank you for coming in!\nWe hope you join us again at Al Qurum Veterinary Clinic");
			    	        clinic = false;
			    	      }
			    	      break;
			    	      
		    	case 4:
		    		System.out.print("\n**Customer Service**\n");
		    		System.out.println("\nWelcome to Customer Service ");
		    		try 
    	        	{
		    			Thread.sleep(500);
    	        	} 
    	            catch(InterruptedException e)
    	        	{
    	        	}
		    		
		    		String Questions;
		    		System.out.println("\nIf you have any questions or concerns, please note down below");
		    		Questions = s.next();
		    		
		    		
		    		int rand = (new Random()).nextInt(900000) + 100000; //generates a random number 6 digit number 
		    		
		    		
		    		System.out.print("We hear your concerns and questions, please contact " + rand +" so that we can help you further\n");
		    		
		    		 System.out.println();
			    		System.out.println("\nWould you like to return to the option menu (yes/no?): ");
			    	      s.nextLine();
			    	      String playAgain11111 = s.nextLine();
			    	      
			    	      
			    	      if (playAgain11111.equalsIgnoreCase("no")){
			    	    	  System.out.print("");
				    	    	 try 
					    	        {
					    	          Thread.sleep(550);
					    	        } 
					    	            catch(InterruptedException e)
					    	        {
					    	        }
				    	        System.out.print("      |\\      _,,,---,,_\n"
				    	        		+ "ZZZzz /,`.-'`'    -.  ;-;;,_\n"
				    	        		+ "     |,4-  ) )-,_. ,\\ (  `'-'\n"
				    	        		+ "    '---''(_/--'  `-'\\_)");//https://www.asciiart.eu/animals/cats
				    	        try 
				    	        {
				    	          Thread.sleep(1000);
				    	        } 
				    	            catch(InterruptedException e)
				    	        {
				    	        }
				    	        System.out.print("\nThank you for coming in!\nWe hope you join us again at Al Qurum Veterinary Clinic");
				    	        clinic = false;
				    	      }
				    	      break;
		    		
		    		
		    		
		    	default:
		            System.err.println ( "Unrecognized option" );
		            

		             try
		          {
		            Thread.sleep(400);
		          } 
		              catch(InterruptedException e)
		          {
		          }
		          System.err.println ( "youre being redirected to the option section\n" );//tells user theyre being redirected to the option section as play is still equal to true 

		          try
		          {
		            Thread.sleep(1000);
		          } 
		              catch(InterruptedException e)
		          {
		          }
		            break;
		    	
		    }
	}

}
}
