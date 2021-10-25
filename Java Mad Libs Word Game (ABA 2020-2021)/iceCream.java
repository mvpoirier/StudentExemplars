import java.util.Scanner;
import java.util.Random;

public class iceCream {

  public static void run (){
  
  //Arrays with words that will be randomised. 
  String[] nouns123 = {"helmet", "headphones", "pencil", "island", "book", "school", "computer"};
  String[] adjectives123 = {"heavy", "obedient", "filthy", "lovely", "massive", "helpful", "horrible"};
  String[] verbs123 = {"walking", "exploring", "ask", "shout", "avoid", "fly", "speak"};
  String[] adverbs123 = {"terribly", "safely", "sadly", "unexpectedly", "wisely", "cruelly", "greatly"};
  String[] name123 = {"Ignacio", "Pablo", "Robert", "Cecilia", "Maria", "Erika", "Ahsan", "Janan", "Michael"};
  String[] fruits123 = {"strawberry", "melon", "peach", "banana", "lemon", "orange", "passion fruit"};
  String[] foods123 = {"taco", "tortilla", "pizza", "ice cream", "chicken wings"};
  String[] transports123 = {"car", "bus", "boat", "airplane", "motorbike", "bicicle", "train", "rocket"};
  String[] cities123 = {"Barcelona", "Muscat", "Madrid", "Paris", "Rome", "Praga", "Oslo"};

  //These arrays will be used during the game. The name of the arrays (sports,animals,foods), will be the topics that the user can chose. Each array contains 2 words which will be the mad libs. This means that each topic will have 2 different mad libs. 
  String[] sports = {"football", "basketball"};
  String[] animals = {"dog", "lion"};
  String[] foods = {"ice cream", "pizza"};

  //These are the scanners that will be used for the madlibs. The madLibsIgnacio scanner will be used for the inputs which are strings. The madLibsNacho will be used for the inputs which are integers (numbers)  
  Scanner madLibsIgnacio = new Scanner(System.in);
  Scanner madLibsNacho = new Scanner(System.in);

  //This is the variable where the randomized word from the sports array will be stored. 
  String randomizedSports = (sports[new Random().nextInt(sports.length)]);
  //This is the variable where the randomized word from the animals array will be stored. 
  String randomizedAnimals = (animals[new Random().nextInt(animals.length)]);
  //This is the variable where the randomized word from the foods array will be stored. 
  String randomizedFood = (foods[new Random().nextInt(foods.length)]);

  //The user is asked to enter a noun.
  System.out.print(("Enter a noun : "));
  String noun = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (noun.isEmpty() || noun.contains("  ") || noun.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a noun : "));
    noun = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.     
  if (noun.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  //User is asked to enter a fruit. 
  System.out.print(("Enter a fruit : "));
  String fruit = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (fruit.isEmpty() || fruit.contains("  ") || fruit.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a fruit : "));
    fruit = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.    
  if (fruit.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    fruit = (fruits123[new Random().nextInt(fruits123.length)]);
    }

  //User is asked to enter an adjective. 
  System.out.print(("Enter an adjective : "));
  String adjective = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adjective.isEmpty() || adjective.contains("  ") || adjective.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an adjective : "));
    adjective = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.     
  if (adjective.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adjective = (adjectives123[new Random().nextInt(adjectives123.length)]);
    }

  //User is asked to enter a food. 
  System.out.print(("Enter a food : "));
  String food = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (food.isEmpty() || food.contains("  ") || food.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a food : "));
    food = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised. 
  if (food.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    food = (foods123[new Random().nextInt(foods123.length)]);
    }

  //User is asked to enter an adverb. 
  System.out.print(("Enter an adverb : "));
  String adverb = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adverb.isEmpty() || adverb.contains("  ") || adverb.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an adverb : "));
    adverb = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised. 
  if (adverb.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adverb = (adverbs123[new Random().nextInt(adverbs123.length)]);
    }

  //User is asked to enter a verb.
  System.out.print(("Enter a verb : "));
  String verb = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (verb.isEmpty() || verb.contains("  ") || verb.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a nationality : "));
    verb = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.     
  if (verb.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    verb = (verbs123[new Random().nextInt(verbs123.length)]);
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
  //If input is random, word will be randomised. 
  if (noun1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun1 = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  //User is asked to enter a transport. 
  System.out.print(("Enter a transport : "));
  String transport = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (transport.isEmpty() || transport.contains("  ") || transport.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a transport : "));
    transport = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised. 
  if (transport.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    transport = (transports123[new Random().nextInt(transports123.length)]);
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
  //If input is random, word will be randomised. 
  if (name.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    name = (name123[new Random().nextInt(name123.length)]);
    }

  //User is asked to enter a city. 
  System.out.print(("Enter a city : "));
  String city = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (city.isEmpty() || city.contains("  ") || city.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a city : "));
    city = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (city.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    city = (cities123[new Random().nextInt(cities123.length)]);
    }

  //User is asked to enter another adjective. 
  System.out.print(("Enter another adjective : "));
  String adjective1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adjective1.isEmpty() || adjective1.contains("  ") || adjective1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another adjective : "));
    adjective1 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.  
  if (adjective1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adjective1 = (adjectives123[new Random().nextInt(adjectives123.length)]);
    }

  //User is asked to enter a number. 
  System.out.print(("Enter a number : "));
  //While input is not a number, it will be a string. 
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  //Source : Stack Overflow.       
  int number = madLibsNacho.nextInt();
  String myNum = Integer.toString (number);

  //Flush method will be used. 
  System.out.print("\033[H\033[2J");
  System.out.flush();
  //Ascii art is printed with the title of the mad lib. (Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20)
  System.out.println(" _____            _____                          ");
  System.out.println("|_   _|          / ____|                         ");
  System.out.println("  | |  ___ ___  | |     _ __ ___  __ _ _ __ ___  ");
  System.out.println("  | | / __/ _ \\ | |    | '__/ _ \\/ _` | '_ ` _ \\ ");
  System.out.println(" _| || (_|  __/ | |____| | |  __/ (_| | | | | | |");
  System.out.println("|_____\\___\\___|  \\_____|_|  \\___|\\__,_|_| |_| |_| ");

  System.out.println("\n");
  //Ascii art drawing of an ice cream. (Source : https://www.asciiart.eu/animals/dogs)
  System.out.println("                     .-\"`'\"-.");
  System.out.println("                    /        \\");
  System.out.println("                    |        |");
  System.out.println("                    /'---'--`\\");
  System.out.println("                   |          |");
  System.out.println("                   \\.--.---.-./");
  System.out.println("                   (_.--._.-._)");
  System.out.println("                     \\=-=-=-/");
  System.out.println("                      \\=-=-/");
  System.out.println("                       \\=-/");
  System.out.println("                        \\/");

  //Ice cream mad libs. The user inputs are included to make the story funny. 
  System.out.println("ICE CREAM 🍦");
  System.out.print("Ice creams are everyone's favourite snack. Everyday I dream of an ice cream that is as big as a "+ noun.toLowerCase() + " . I wish there was an ice cream like that! ");
  System.out.println("My favourite ice cream flavour is " + fruit.toLowerCase() + " ." + fruit.toLowerCase() + " ice cream is " + adjective.toLowerCase() + " . If you add a bit of " + food.toLowerCase() + " , on top, it is even better. I love eating ice creams " + adverb.toLowerCase() + " which is why whenever I take a bite, it " + verb.toLowerCase() + " on my " + noun1.toLowerCase() + "."); 
  System.out.println(" My favourite ice cream is from the ice cream " + transport.toLowerCase() + " during summer. The shop in the " + transport.toLowerCase() + " is called " + name.toLowerCase() + "‘s Center.");
  System.out.println("This is a " + transport.toLowerCase() + " that goes around " + city.toLowerCase() + " every summer. Their ice creams are so " + adjective1.toLowerCase() + " that I could eat " + number + " every day! You should try them! They are truly the best!"); 
  }
}
