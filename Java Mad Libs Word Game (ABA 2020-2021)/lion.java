import java.util.Scanner;
import java.util.Random;

public class lion {

  public static void run (){

  //Array with words that will be randomised. 
  String[] nouns123 = {"helmet", "headphones", "pencil", "island", "book", "school", "computer"};
  String[] adjectives123 = {"heavy", "obedient", "filthy", "lovely", "massive", "helpful", "horrible"};
  String[] verbs123 = {"walking", "exploring", "ask", "shout", "avoid", "fly", "speak"};
  String[] adverbs123 = {"terribly", "safely", "sadly", "unexpectedly", "wisely", "cruelly", "greatly"};
  String[] animalPlural123 = {"giraffes", "whales", "elephants", "dinasours"};

  //These arrays will be used during the game. The name of the arrays (sports,animals,foods), will be the topics that the user can chose. Each array contains 2 words which will be the mad libs. This means that each topic will have 2 different mad libs.     
  String[] sports = {"football", "basketball"};
  String[] animals = {"dog", "lion"};
  String[] foods = {"ice cream", "pizza"};

  //These are the scanners that will be used for the madlibs. The madLibsIgnacio scanner will be used for the inputs which are strings. The madLibsNacho will be used for the inputs which are integers (numbers)  
  Scanner madLibsIgnacio = new Scanner(System.in);
  Scanner madLibsNacho = new Scanner(System.in);

  //This is the variable where the randomized word from the sports array will be stored. 
  String randomizedSports = (sports[new Random().nextInt(sports.length)]);
  //This is the variable where the randomized word from the sports array will be stored. 
  String randomizedAnimals = (animals[new Random().nextInt(animals.length)]);
  //This is the variable where the randomized word from the sports array will be stored. 
  String randomizedFood = (foods[new Random().nextInt(foods.length)]);

  //User is asked to enter a noun.
  System.out.print(("Enter a noun : "));
  String noun = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (noun.isEmpty() || noun.contains("  ") || noun.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a nationality : "));
    noun = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.     
  if (noun.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun = (nouns123[new Random().nextInt(nouns123.length)]);
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
  //If input is random, a word will be randomised.    
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
    System.out.print(("Enter a verb : "));
    verb = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.     
  if (verb.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    verb = (verbs123[new Random().nextInt(verbs123.length)]);
    }

  //The user is asked to enter an animal in plural.
  System.out.print(("Enter an animal in plural : "));
  String animalPlural = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (animalPlural.isEmpty() || animalPlural.contains("  ") || animalPlural.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an animal in plural : "));
    animalPlural = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.     
  if (animalPlural.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    animalPlural = (animalPlural123[new Random().nextInt(animalPlural123.length)]);
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
  //If input is random, a word will be randomised. 
  if (adjective.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adjective = (adjectives123[new Random().nextInt(adjectives123.length)]);
    }

  //User is asked to enter a noun.
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

  //User is asked to enter a number. 
  System.out.print(("Enter a number : "));
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  //Source = StackOverflow.       
  int number = madLibsNacho.nextInt();
  String myNum = Integer.toString (number);

  //User is asked to enter another noun. 
  System.out.print(("Enter another noun : "));
  String noun2 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (noun2.isEmpty() || noun2.contains("  ") || noun2.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another noun : "));
    noun2 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.     
  if (noun2.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun2 = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  //The flush method will be used here.     
  System.out.print("\033[H\033[2J");
  System.out.flush();
  //Ascii art of the title of the mad lib. (Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20)
  System.out.println(" _      _                 ");
  System.out.println("| |    (_)                ");
    ;
  System.out.println("| |     _  ___  _ __  ___ ");
  System.out.println("| |    | |/ _ \\| '_ \\/ __|");
  System.out.println("| |____| | (_) | | | \\__ \\");
  System.out.println("|______|_|\\___/|_| |_|___/");

  //Ascii drawing of a lion (Source: https://www.asciiart.eu/animals/dogs)
  System.out.println("                            ,  ,, ,");
  System.out.println("                      , ,; ; ;;  ; ;  ;");
  System.out.println("                   , ; ';  ;  ;; .-''\\ ; ;");
  System.out.println("                , ;  ;`  ; ,; . / /8b \\ ; ;");
  System.out.println("                `; ; .;'         ;,\\8 |  ;  ;");
  System.out.println("                 ` ;/   / `_      ; ;;    ;  ; ;");
  System.out.println("                    |/.'  /9)    ;  ; `    ;  ; ;");
  System.out.println("                   ,/'          ; ; ;  ;   ; ; ; ;");
  System.out.println("                  /_            ;    ;  `    ;  ;");
  System.out.println("                 `?8P\"  .      ;  ; ; ; ;     ;  ;;");
  System.out.println("                 | ;  .:: `     ;; ; ;   `  ;  ;");
  System.out.println("                 `' `--._      ;;  ;;  ; ;   ;   ;");
  System.out.println("                  `-..__..--''   ; ;    ;;   ; ;   ;");
  System.out.println("                              ;    ; ; ;   ;     ;");

  //Lions mad lib. User input will be included to make the story funny. 
  System.out.println("LIONS 🦁");
  System.out.print("Lions are animals which are found in every single " + noun.toLowerCase() + " ." + " They transport themselves by walking " + adverb.toLowerCase() + " around different areas of the savannah. ");
  System.out.println("The lion is a very fast animal which loves to " + verb.toLowerCase() + " different animals, like for example: " + animalPlural.toLowerCase() + " . " + "They also " + verb.toLowerCase() + " birds, hares and turtles. " + "Lions have a very " + adjective.toLowerCase() + " fur and they are considered one of the most precious animals on the planet.");
  System.out.println(" Their " + adjective.toLowerCase() + " fur is one of the reasons why they are critically endangered in some countries. " + " Their head is surrounded with " + noun1.toLowerCase() + " , a thing that makes them different from the rest.");
  System.out.println(" A lions " + verb1.toLowerCase() + " can be heard from " + number + " kilometres away. " + "They have a great power and strength and they fear no other animal. " + "This is why they are called the " + noun2.toLowerCase() + " of the jungle. ");
  }
}