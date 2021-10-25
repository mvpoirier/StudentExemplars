import java.util.Scanner;
import java.util.Random;

public class dog {

  public static void run (){
  
  //Arrays with words that will be randomised. 
  String[] nouns123 = {"helmet", "headphones", "pencil", "island", "book", "school", "computer"};
  String[] adjectives123 = {"heavy", "obedient", "filthy", "lovely", "massive", "helpful", "horrible"};
  String[] verbs123 = {"walking", "exploring", "ask", "shout", "avoid", "fly", "speak"};
  String[] country123 = {"spain", "italy", "oman", "russia", "germany", "australia", "canada"};
  String[] foods123 = {"taco", "tortilla", "pizza", "ice cream", "chicken wings"};
  String[] animalPlural123 = {"giraffes", "whales", "elephants", "dinasours"};
  String[] pluralNoun123 = {"helmets", "pencils", "boxes", "bottles", "computers", "posters", "ovens"};
  String[] drink123 = {"water", "fanta", "wine", "beer", "cola", "coffee", "orange juice"};

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
    System.out.println("\n");
    }
  //If input is random, a word will be randomised.   
  if (noun.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun = (nouns123[new Random().nextInt(nouns123.length)]);
      }

  //User is asked to enter a plural animal.
  System.out.print(("Enter a plural animal : "));
  String animalPlural = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (animalPlural.isEmpty() || animalPlural.contains("  ") || animalPlural.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a plural animal : "));
      animalPlural = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (animalPlural.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    animalPlural = (animalPlural123[new Random().nextInt(animalPlural123.length)]);
    }

  System.out.print(("Enter an adjective : "));
  String adjective = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adjective.isEmpty() || adjective.contains("  ") || adjective.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an adjective : "));
    adjective = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.
  if (adjective.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adjective = (adjectives123[new Random().nextInt(adjectives123.length)]);
    }

  //User is asked to enter an adjective.
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

  //User is asked to enter a country. 
  System.out.print(("Enter a country : "));
  String country = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (country.isEmpty() || country.contains("  ") || country.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a country : "));
    country = madLibsIgnacio.nextLine();
    }
  //If input is random,a word will be randomised. 
  if (country.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    country = (country123[new Random().nextInt(country123.length)]);
    }

  //User is asked to enter another adjective. 
  System.out.print(("Enter another adjective : "));
  String adjective2 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adjective2.isEmpty() || adjective2.contains("  ") || adjective2.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another adjective : "));
    adjective2 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (adjective2.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adjective2 = (adjectives123[new Random().nextInt(adjectives123.length)]);
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
  //If input is random, a word will be randomised. 
  if (food.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    food = (foods123[new Random().nextInt(foods123.length)]);
    }

  //User is asked to enter a drink. 
  System.out.print(("Enter a drink : "));
  String drink = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (drink.isEmpty() || drink.contains("  ") || drink.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a drink : "));
    drink = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (drink.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    drink = (drink123[new Random().nextInt(drink123.length)]);
    }

  //User is asked to enter a verb. 
  System.out.print(("Enter a verb : "));
  String verb = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (verb.isEmpty() || verb.contains("  ") || verb.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a verb : "));
    verb = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (verb.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    verb = (verbs123[new Random().nextInt(verbs123.length)]);
    }

  //User is asked to enter a number. 
  System.out.print(("Enter a number : "));
  //While the user input is not an int, it will be a string. 
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  // Source : StackOverflow.   
  int number = madLibsNacho.nextInt();
  String myNum = Integer.toString (number);

 //User is asked to enter a plural noun. 
  System.out.print(("Enter a plural noun : "));
  String nounPlural = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (nounPlural.isEmpty() || nounPlural.contains("  ") || nounPlural.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a plural noun : "));
      nounPlural = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (nounPlural.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    nounPlural = (pluralNoun123[new Random().nextInt(pluralNoun123.length)]);
    }

  //User is asked to enter a verb. 
  System.out.print(("Enter another verb : "));
  String verb1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (verb1.isEmpty() || verb1.contains("  ") || verb1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another verb : "));
    verb1 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (verb1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    verb1 = (verbs123[new Random().nextInt(verbs123.length)]);
    }

  //The flush method will be used. 
  System.out.print("\033[H\033[2J");  
  System.out.flush();
  //Ascii art with the title of the mad libs.(Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20) 
  System.out.println(" _____                  ");
  System.out.println("|  __ \\                 ");
  System.out.println("| |  | | ___   __ _ ___ ");
  System.out.println("| |  | |/ _ \\ / _` / __|");
  System.out.println("| |__| | (_) | (_| \\__ \\");
  System.out.println("|_____/ \\___/ \\__, |___/");
  System.out.println("               __/ |    ");
  System.out.println("              |___/     ");
  //Ascii art with a drawing of a dog. (Source : https://www.asciiart.eu/animals/dogs)
  System.out.println("                                _.--\"\"\"--._");
  System.out.println("                              .'       '-. `.");
  System.out.println("                           __/__    (-.   `\\ \\");
  System.out.println("                          /o `o \\      \\    \\ \\");
  System.out.println("                         _\\__.__/ ))    |    | ;");
  System.out.println("                    .--;\"               |    |  \\");
  System.out.println("                  (    `)              |    |   \\");
  System.out.println("                  _|`---' .'      _,   _|    |    `\\");
  System.out.println("                '`_\\  \\     '_,.-';_.-`\\|     \\     \\_");
  System.out.println("                .'  '--'---;`  / /     |\\     |_..--' \\");
  System.out.println("                           \\'-'.'     .--'.__/    __.-;");
  System.out.println("                            `\"`      (___...---''`     \\");
  System.out.println("                                     _/_ _ _          + \\");

  //Dog mad lib. The user inputs are included to make it a funny story. 
  System.out.println("DOGS 🐶");
  System.out.println("Dogs are the man's best " + noun.toLowerCase() + ". There is a big debate between " + animalPlural.toLowerCase() + " and dogs. Dogs are the better animal without a doubt.");
  System.out.println("Everyone loves having a " + adjective.toLowerCase() + " dog to take care and play with them. Their hair is " + adjective1.toLowerCase() + " and soft and their size can vary from small to big.");
  System.out.println("You can find them in every country, although " + country.toLowerCase() + " is where they come from. Most dogs need " + adjective2.toLowerCase() + " care. You must give them " + food.toLowerCase() + " and " + drink.toLowerCase() + " as well as taking them outside for a " + verb.toLowerCase() + ". Dogs love to " + verb.toLowerCase() + ".");
  System.out.println("They usually sleep for " + number + " hours every day and they love to sleep on top of " + nounPlural.toLowerCase() + ". Oh, and don’t ever forget to " + verb1.toLowerCase() + " them in order for them to stay clean and healthy. If you ever get one, you won’t regret it! ");
  }
}