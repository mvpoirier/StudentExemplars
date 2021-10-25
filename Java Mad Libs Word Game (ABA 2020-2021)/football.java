import java.util.Scanner;
import java.util.Random;

public class football {

  public static void run (){

  //Array with words that will be randomised. 
  String[] nouns123 = {"helmet", "headphones", "pencil", "island", "book", "school", "computer"};
  String[] adjectives123 = {"heavy", "obedient", "filthy", "lovely", "massive", "helpful", "horrible"};
  String[] adverbs123 = {"terribly", "safely", "sadly", "unexpectedly", "wisely", "cruelly", "greatly"};
  String[] numbers123 = {"10", "34058", "45", "67", "387", "32", "1000034", "567"};
  String[] name123 = {"Ignacio", "Pablo", "Robert", "Cecilia", "Maria", "Erika", "Ahsan", "Janan", "Michael"};
  String[] team123 = {"alpha team", "champions team", "bad boys team", "aztects team"};
  String[] verbPastTense123 = {"walked", "picked", "moved", "flew", "sang", "spoke", "taught"};
  String[] animalPlural123 = { "giraffes", "whales", "elephants", "dinasours" };

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

  //User is asked to enter an animal in plural. 
  System.out.print(("Enter an animal in plural : "));
  String animal = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (animal.isEmpty() || animal.contains("  ") || animal.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an animal in plural : "));
    animal = madLibsIgnacio.nextLine(); }
  //If input is random, a word will be randomised. 
  if (animal.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    animal = (animalPlural123[new Random().nextInt(animalPlural123.length)]);
    }

  //The user is asked to enter a name. 
  System.out.print(("Enter a name : "));
  String name = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (name.isEmpty() || name.contains("  ") || name.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a name : "));
      name = madLibsIgnacio.nextLine(); }
  //If input is random, a word will be randomised. 
  if (name.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    name = (name123[new Random().nextInt(name123.length)]); 
    }

  //User is asked to enter a name. 
  System.out.print(("Enter another name : "));
  String name1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (name1.isEmpty() || name1.contains("  ") || name1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter another name : "));
    name1 = madLibsIgnacio.nextLine(); }
  //If input is random, a word will be randomised. 
  if (name1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    name1 = (name123[new Random().nextInt(name123.length)]); 
    }

  //The user is asked to enter an adjective.   
  System.out.print(("Enter an adjective : "));
  String adjective = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adjective.isEmpty() || adjective.contains("  ") || adjective.equals(" ")) {
    System.out.println("Invalid answer! ");
    System.out.print(("Enter an adjective : "));
    adjective = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (adjective.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adjective = (adjectives123[new Random().nextInt(adjectives123.length)]);
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

  //User is asked to enter a number. 
  System.out.print(("Enter a number : "));
  //While madLibsNacho is not an int, it will be a string.     
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  //Souce : StackOverflow.    
  int number = madLibsNacho.nextInt();
  String myNum = Integer.toString (number);
  
  //User is asked to enter another number. 
  System.out.print(("Enter another number : "));
  //While madLibsNacho is not an int, it will be a string.     
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  //Source : StackOverflow.        
  int number1 = madLibsNacho.nextInt();
  String myNum1 = Integer.toString (number1);

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

  //User is asked to enter a verb in past tense.     
  System.out.print(("Enter a verb in past tense : "));
  String verbPastTense = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (verbPastTense.isEmpty() || verbPastTense.contains("  ") || verbPastTense.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a verb in past tense : "));
    verbPastTense = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised.     
  if (verbPastTense.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    verbPastTense = (verbPastTense123[new Random().nextInt(verbPastTense123.length)]);
    }
  //User is asked to enter a team.      
  System.out.print(("Enter a team : "));
  String team = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (team.isEmpty() || team.contains("  ") || team.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a team : "));
    team = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (team.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    team = (team123[new Random().nextInt(team123.length)]);
    }
  //If input is random, a word will be randomised. 
  System.out.print(("Enter an adverb : "));
  String adverb1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (adverb1.isEmpty() || adverb1.contains("  ") || adverb1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter an adverb : "));
    adverb1 = madLibsIgnacio.nextLine(); }
  //If word is random, a word will be randomised. 
  if (adverb1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    adverb1 = (adverbs123[new Random().nextInt(adverbs123.length)]);
    }
  //Flush method will be used here.
  System.out.print("\033[H\033[2J");    
  System.out.flush();
  //Ascii art title of the mad lib.(Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20) 
  System.out.println(" ______          _   _           _ _ ");
  System.out.println("|  ____|        | | | |         | | |");
  System.out.println("| |__ ___   ___ | |_| |__   __ _| | |");
  System.out.println("|  __/ _ \\ / _ \\| __| '_ \\ / _` | | |");
  System.out.println("| | | (_) | (_) | |_| |_) | (_| | | |");
  System.out.println("|_|  \\___/ \\___/ \\__|_.__/ \\__,_|_|_|");

  System.out.println("\n");
  //Ascii artwork drawing of football players. (Source : https://www.asciiart.eu/animals/dogs)    
  System.out.println("                                             ___");
  System.out.println("                         o__        o__     |   |\\");
  System.out.println("                         /|          /\\     |   |X\\");
  System.out.println("                         / > o        <\\    |   |XX\\");
  //Football mad libs. User input will be included to make the story funny.     
  System.out.println("FOOTBALL ⚽");
  System.out.println("Our final soccer match of the season was meant to be played yesterday but it got postponed for today as a bunch of " + animal.toLowerCase() + " invaded the pitch. ");
  System.out.println("Today was the day. Our coach, " + name.toLowerCase() + " gave us a " + adjective.toLowerCase() + " talk and he told us that if we won today, we would all get to take a " + noun + " home with us as a price.");
  System.out.println("There were " + number + " seconds left before the game ended and the score was " + number1 + " - " + number1 + ". " + name1.toLowerCase() + " got the ball, he dribbled past everyone and shot the ball.");
  System.out.println(" It flew " + adverb.toLowerCase() + " into the air and inside the goal. GOAL!! We all " + verbPastTense.toLowerCase() + " " + adverb1.toLowerCase() + " . We had made it! " + name1.toLowerCase() + " brought " + team.toLowerCase() + " back to where it’s meant to be! It was a dream come true!");
  }
}