import java.util.Scanner;
import java.util.Random;

public class pizza {

  public static void run (){

  //Array with words that will be randomized. 
  String[] nouns123 = { "helmet", "headphones", "pencil", "island", "book", "school", "computer" };
  String[] nationalities123 = { "spanish", "russian", "omani", "italian", "venezuelan", "canadian", "australian","nigerian" };
  String[] name123 = { "Ignacio", "Pablo", "Robert", "Cecilia", "Maria", "Erika", "Ahsan", "Janan", "Michael" };
  String[] profession123 = { "teacher", "engineer", "lawyer", "dentist", "actor", "architect", "physician" };
  String[] ingredient123 = { "salt", "milk", "sugar", "tomato", "potato", "flour", "water" };
  String[] vegetables123 = { "cucumber", "red pepper", "lettuce", "onion", "potato", "carrot", "celery" };
  String[] shapePlural123 = { "squares", "triangles", "rectangles", "parallelograms", "rhombus", "circles",
        "trapeziums" };
    
  //These arrays will be used during the game. The name of the arrays (sports,animals,foods), will be the topics that the user can chose. Each array contains 2 words which will be the mad libs. This means that each topic will have 2 different mad libs.     
  String[] sports = { "football", "basketball" };
  String[] animals = { "dog", "lion" };
  String[] foods = { "ice cream", "pizza" };

  //These are the scanners that will be used for the madlibs. The madLibsIgnacio scanner will be used for the inputs which are strings. The madLibsNacho will be used for the inputs which are integers (numbers)  
  Scanner madLibsIgnacio = new Scanner(System.in);
  Scanner madLibsNacho = new Scanner(System.in);

  //User is asked to enter a nationality. 
  System.out.print(("Enter a nationality : "));
  String nationality = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (nationality.isEmpty() || nationality.contains("  ") || nationality.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a nationality : "));
    nationality = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.     
  if (nationality.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    nationality = (nationalities123[new Random().nextInt(nationalities123.length)]);
    }

  //User is asked to enter a profession. 
  System.out.print(("Enter a profession : "));
  String profession = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (profession.isEmpty() || profession.contains("  ") || profession.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a profession : "));
    profession = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised. 
  if (profession.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    profession = (profession123[new Random().nextInt(profession123.length)]);
    }

  //User is asked to enter a name. 
  System.out.print(("Enter a name : "));
  String name = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (name.isEmpty() || name.contains("  ") || name.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a name : "));
    name = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (name.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    name = (name123[new Random().nextInt(name123.length)]);
    }

  //User is asked to enter an ingredient. 
  System.out.print(("Enter an ingredient : "));
  String ingredient = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (ingredient.isEmpty() || ingredient.contains("  ") || ingredient.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an ingredient : "));
    ingredient = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (ingredient.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    ingredient = (ingredient123[new Random().nextInt(ingredient123.length)]);
    }

  //User is asked to enter a noun. 
  System.out.print(("Enter a noun : "));
  String noun = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (noun.isEmpty() || noun.contains("  ") || noun.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a noun : "));
    noun = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (noun.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  //User is asked to enter a vegetable.
  System.out.print(("Enter a vegetable : "));
  String vegetable = madLibsIgnacio.nextLine();
 //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (vegetable.isEmpty() || vegetable.contains("  ") || vegetable.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a vegetable : "));
    vegetable = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (vegetable.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    vegetable = (vegetables123[new Random().nextInt(vegetables123.length)]);
    }

  //User is asked to enter another ingredient. 
  System.out.print(("Enter another ingredient : "));
  String ingredient1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (ingredient1.isEmpty() || ingredient1.contains("  ") || ingredient1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another ingredient : "));
    ingredient1 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (ingredient1.equals("random")) {
    System.out.println("Randomizing a word...");
    ingredient1 = (ingredient123[new Random().nextInt(ingredient123.length)]);
    }

  //User is asked to enter another noun. 
  System.out.print(("Enter another noun : "));
  String noun1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (noun1.isEmpty() || noun1.contains("  ") || noun1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another noun : "));
    noun1 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (noun1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun1 = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  //User is asked to enter a shape in plural. 
  System.out.print(("Enter a shape in plural : "));
  String shapePlural = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (shapePlural.isEmpty() || shapePlural.contains("  ") || shapePlural.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a shape in plural : "));
    shapePlural = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomsied. 
  if (shapePlural.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    shapePlural = (shapePlural123[new Random().nextInt(shapePlural123.length)]);
    }

  //User is asked to enter anohter ingredient.     
  System.out.print(("Enter another ingredient : "));
  String ingredient2 = madLibsIgnacio.nextLine();
 //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (ingredient2.isEmpty() || ingredient2.contains("  ") || ingredient2.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another ingredient : "));
    ingredient2 = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.
  if (ingredient2.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    ingredient2 = (ingredient123[new Random().nextInt(ingredient123.length)]);
    }

  //User is asked to enter a number. 
  System.out.print(("Enter a number : "));
  //While madLibsnacho is not an int, it is a string. 
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  //Source : StackOverflow.       
  int number = madLibsNacho.nextInt();
  String myNum = Integer.toString (number);

  //Flush method will be used here.
  System.out.print("\033[H\033[2J");
  System.out.flush();
  //Ascii art to print the title of the mad lib. (Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20)
  System.out.println(" _____ _              ");
  System.out.println("|  __ (_)             ");
  System.out.println("| |__) | __________ _ ");
  System.out.println("|  ___/ |_  /_  / _` |");
  System.out.println("| |   | |/ / / / (_| |");
  System.out.println("|_|   |_/___/___\\__,_|");

  //Ascii art drawing of a pizza. (Source : https://www.asciiart.eu/animals/dogs)
  System.out.println("                               \\--.._");
  System.out.println("                              ||  (_)  _ \"-._");
  System.out.println("                              ||    _ (_)    '-.");
  System.out.println("                              ||   (_)   __..-'");
  System.out.println("                               \\\\__..--\"\"");

  //Pizza mad libs. User inputs are included to make the story funny. 
  System.out.println("PIZZA🍕");
  System.out.println("Pizza is an " + nationality.toLowerCase() + " dish invented and first made by " + profession.toLowerCase() + " " + name.toLowerCase() + " ." + " This dish is very famous around the world because of its taste.");
  System.out.println( "Especially because it contains a lot of " + ingredient.toLowerCase() + " and it is extremely easy to make! " + "To start off, you insert the dough in a " + noun.toLowerCase() + " and then spread it.");
  System.out.println("Afterwards, cover it with " + vegetable.toLowerCase() + " sauce and insert cheese over it. " + "You can also add " + ingredient1.toLowerCase() + " to make it even better! Then, you have to bake it in a hot " + noun1.toLowerCase() + ".");
  System.out.println("Once it’s done, cut it into " + shapePlural.toLowerCase() + " and enjoy! " + "There are many different types of pizza, but my favourite is " + ingredient2.toLowerCase() + " pizza! It’s simply the best pizza ever." + " If I could, I would eat pizza " + number + " times a day!");
  }
}