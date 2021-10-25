import java.util.Scanner;
import java.util.Random;

public class basketball {

  public static void run (){

  //Arrays with the word that will be randomised if the user inputs "random".   
  String[] nouns123 = {"helmet", "headphones", "pencil", "island", "book", "school", "computer"};
  String[] nationalities123 = {"spanish", "russian", "omani", "italian", "venezuelan", "canadian", "australian", "nigerian"};
  String[] name123 = {"Ignacio", "Pablo", "Robert", "Cecilia", "Maria", "Erika", "Ahsan", "Janan", "Michael"};
  String[] team123 = {"alpha team", "champions team", "bad boys team", "aztects team"};
  String[] country123 = {"spain", "italy", "oman", "russia", "germany", "australia", "canada"};
  String[] funnyName123 = {"bladodo", "yesbow", "chunky wunkie", "kingmessiah"};
  String[] liquid123 = {"blood", "urine", "gasoline", "milk", "bromine", "mercury", "rubbing alcohol"};
  String[] sport123 = {"football", "basketball", "tennis", "baseball", "rugby", "golf", "table tennis"};

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
  //If input is random, a word will be randomised.  
  if (noun.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  //The user is asked to enter a nationality. 
  System.out.print(("Enter a nationality : "));
  String nationality = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (nationality.isEmpty() || nationality.contains("  ") || nationality.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a nationality : "));
    nationality = madLibsIgnacio.nextLine();
    }
    //If input is random, a word will be randomized. 
  if (nationality.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    nationality = (nationalities123[new Random().nextInt(nationalities123.length)]);
    }

  //The user is asked to enter a year. 
  System.out.print(("Enter a year : "));
  //While the answer is not an intefer, it will be a string. 
  while (!madLibsNacho.hasNextInt())
  madLibsNacho.nextLine();
  //Source : Stack overflow. 
  int year = madLibsNacho.nextInt();
  String myNum = Integer.toString (year);
  //The user is asked to enter a name

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

    //The user is asked to enter a number.
    System.out.print(("Enter a number : "));
    //If inputis not an integer, it will be a string. 
  while (!madLibsNacho.hasNextInt())
    madLibsNacho.nextLine();
    //Source : Stack Overflow.
    int number = madLibsNacho.nextInt();
    String myNum1 = Integer.toString (number);

  //The user is asked to enter a team.   
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

  //The user is asked to enter a country.
  System.out.print(("Enter a country : "));
  String country1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (country1.isEmpty() || country1.contains("  ") || country1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a country : "));
    country1 = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (country1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    country1 = (country123[new Random().nextInt(country123.length)]);
    }

  //The user is asked to enter a funny name. 
    System.out.print(("Enter a funny name : "));
    String funnyNames = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (funnyNames.isEmpty() || funnyNames.contains("  ") || funnyNames.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a funny name : "));
    funnyNames = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (funnyNames.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    funnyNames = (funnyName123[new Random().nextInt(funnyName123.length)]);
    }

  System.out.print(("Enter a noun : "));
  String noun1 = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (noun1.isEmpty() || noun1.contains("  ") || noun1.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a noun : "));
      noun1 = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised. 
  if (noun1.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    noun1 = (nouns123[new Random().nextInt(nouns123.length)]);
    }

  System.out.print(("Enter a liquid : "));
  String liquid = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (liquid.isEmpty() || liquid.contains("  ") || liquid.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a liquid : "));
    liquid = madLibsIgnacio.nextLine();
    }
  //If input is random, a word will be randomised. 
  if (liquid.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    liquid = (liquid123[new Random().nextInt(liquid123.length)]);
    }

  //The user is asked to enter a number. 
  System.out.print(("Enter another number : "));
  //If input is not an int, it will be a string.   
  while (!madLibsNacho.hasNextInt())
    madLibsNacho.nextLine();
    //Source : StackOverflow.
    int number1 = madLibsNacho.nextInt();
    String myNum2 = Integer.toString (number1);

 //The user is asked to enter a sport.
  System.out.print(("Enter a sport : "));
  String sport = madLibsIgnacio.nextLine();
  //While loop. If the input from the user is a space bar or is empty, it say the answer is invalid and it will ask to please enter again. 
  while (sport.isEmpty() || sport.contains("  ") || sport.equals(" ")) {
    System.out.println("Invalid answer!");
    System.out.print(("Enter a sport : "));
      sport = madLibsIgnacio.nextLine();
    }
  //If input is random, word will be randomised.   
  if (sport.toLowerCase().equals("random")) {
    System.out.println("Randomizing a word...");
    sport = (sport123[new Random().nextInt(sport123.length)]);
    }
    
    //The flush method is used. 
    System.out.print("\033[H\033[2J");    
    System.out.flush();
  //Ascii art with the title of the mad lib "basketball". (Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20)
  System.out.println(" ____            _        _   _           _ _ ");
  System.out.println("|  _ \\          | |      | | | |         | | |");
  System.out.println("| |_) | __ _ ___| | _____| |_| |__   __ _| | |");
  System.out.println("|  _ < / _` / __| |/ / _ \\ __| '_ \\ / _` | | |");
  System.out.println("| |_) | (_| \\__ \\   <  __/ |_| |_) | (_| | | |");
  System.out.println("|____/ \\__,_|___/_|\\_\\___|\\__|_.__/ \\__,_|_|_|");
    System.out.println("\n");
  //Ascii art of a drawing of a basketball player. (Source : https://www.asciiart.eu/animals/dogs)  
  System.out.println("                                              ________");
  System.out.println("                                     o       |   __   |");
  System.out.println("                                       \\_ O |  |__|  |");
  System.out.println("                                    ____/ \\ |___WW___|");
  System.out.println("                                    __/   /      ||");
  System.out.println("                                                 ||  ");
  System.out.println("\n");
  //Basketball mad libs. The user input will be included in the mad lib to make it funny.   
  System.out.println("BASKETBALL 🏀");
  System.out.println(" Basketball is a very famous " + noun1 + " which is played all around the world. It originated in " + country1 + " in " + year + ".");
  System.out.println("The best basketball player in the world, " + name + " has scored " + number + " points in his whole career. ");
  System.out.println(" He played in the " + team + " and in the " + nationality + " national basketball team. In his very last game, the final of the world cup, the crowd was shouting " + funnyNames + " to cheer him up.");
  System.out.println("It was the most important game in his career, he wanted to take the " + noun + " home. " + name + " knew his team had to win that game, even if he had to drink " + liquid + " to do it.");
  System.out.println("At the end, " + name + " beat his own personal record and scored " + number1 + " points. His team managed to win the most important " + sport + " game in the whole world.");
    
  }
}