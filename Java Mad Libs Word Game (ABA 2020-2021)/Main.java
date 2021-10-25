//NAME : I.B. - ABA 2020-2021
//DATE : 11TH OF JANUARY 2020
//PURPOSE : MAD LIBS GAME FOR YOUNG CHILDREN

import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

  //This is the title. It is the first thing that comes up once you click ''run''. It is ascii art. (Source : http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20)
  System.out.println("             __  __           _   _ _ _         ");
  System.out.println("            |  \\/  |         | | | (_) |        ");
  System.out.println("            | \\  / | __ _  __| | | |_| |__  ___ ");
  System.out.println("            | |\\/| |/ _` |/ _` | | | | '_ \\/ __|");
  System.out.println("            | |  | | (_| | (_| | | | | |_) \\__ \\");
  System.out.println("            |_|  |_|\\__,_|\\__,_| |_|_|_.__/|___/");

  //This is a scanner. This scanner will be utilized to ask the introductory questions as well as the topic question. This scanner will not be used in the mad libs.  
  Scanner myScan = new Scanner(System.in);
 //This is a space   
  System.out.println("\n");
 //Introductory sentence   
  System.out.println("Hello! Welcome to the best Mad Libs game in the world! ");
  System.out.println("\n");
  //This is the first question. It is asking the user what their name is. The "myScan" scanner is being used for this question.
  System.out.print("What is your name : ");
  //The input from the user will be stored in the variable nameUser.     
  String nameUser = myScan.nextLine();
  //This is called "flush". The flush method flushes the stream. This means that anything that was done before, will be flushed upwards and it won't be visible anymore. This will make the game easier to understand and more straight forward.    
  System.out.print("\033[H\033[2J");
  System.out.flush();
  //This is a boolean value. This boolean will be used for the instructions. If the user does not understand the instructions, it will remain. If the user understands them and enters "yes", the game will continue. 
  boolean instruction = true;  
  //This is a while loop. While the value instructions is true, the instructions will remain. Once the user understands them and enters yes, the boolean will be false and the game will continue.      
  while (instruction) {
  //This is ascii art with the word "Instructions". This is the title for the instructions section. 
   System.out.println(" _____           _                   _   _                 ");
   System.out.println("|_   _|         | |                 | | (_)                ");
   System.out.println("  | |  _ __  ___| |_ _ __ _   _  ___| |_ _  ___  _ __  ___ ");
   System.out.println("  | | | '_ \\/ __| __| '__| | | |/ __| __| |/ _ \\| '_ \\/ __|");
   System.out.println(" _| |_| | | \\__ \\ |_| |  | |_| | (__| |_| | (_) | | | \\__ \\");
   System.out.println("|_____|_| |_|___/\\__|_|   \\__,_|\\___|\\__|_|\\___/|_| |_|___/");
   System.out.println("\n");

   //These are the instructions. It salutes the user by using the variable with their name in it. There are 5 different steps and each step is separated with a space. As seen, there is an emoji of a map and a smiley face in order to engage the user. 
   System.out.println("Hello " + nameUser + "! The instructions for the game are the following! 🗺️ ");
   System.out.println("\n");
   System.out.println( "1) In this game, you will have the choice to chose from 3 different topics. The 3 topics are : Sports, Animals and Foods");
   System.out.println("\n");
   System.out.println( "2) In each topic, there are 2 mad libs. Once you pick a topic, a mad lib from that topic will be randomized. For example: In sports, there are 2 possible mad libs: football and basketball. If you pick sports, you will be given one of them");
   System.out.println("\n");
   System.out .println("3) You are not allowed to leave any of the boxes blank. If you do, it will ask you to try again");
   System.out.println("\n");
   System.out.println("4) There is a random option. This option will allow the user to randomise any word they want in the mad libs. For example: If the user is asked to insert an adverb, the can just simply type 'random' and a random word will be generated");
   System.out.println("\n");
   System.out.println("5) In this game, you can't win or lose. Just relax and have fun. ");
   System.out.println("Good luck! 😁");
   System.out.println("\n");

  //It is asking the user if the instructions are clear.
   System.out.print("Are the instructions clear (yes/no)🤔 :  ");
  //The users answer will be stored in the variable "userA"
   String userA = myScan.nextLine();
  //This is an if else statement. This will be used to identify what the users response to the previous question is. If the user says "yes", it means that they understood the instructions. Then the boolean will turn into false and the game will continue. 

  if (userA.toLowerCase().equals("yes")) {
    instruction = false;
    }
   //If the user input is not yes, the boolean will remain true meaning that the instructions will remain. 
  else {
    instruction = true;
    //This is the flush method in order for the instructions to remain.     
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }   
}
  //The flush method is utlised here in order to flush the instructions once the user inputs "yes".    
  System.out.print("\033[H\033[2J");
  System.out.flush();
  //The boolean playGame is the key of the programm. This boolean will allow the game to run. If playGame is true, the game will run. 
  boolean playGame = true;
  //This variable contains the amount of times the user has played the game. In the beggining, it is set to 1. 
  int tries = 1;
  //This is a while loop. While the boolean playGame is true, the game will run. Once it is false, the game will stop.  
  while (playGame) {
  //These arrays will be used during the game. The name of the arrays (sports,animals,foods), will be the topics that the user can chose. Each array contains 2 words which will be the mad libs. This means that each topic will have 2 different mad libs. 
  String[] sports = { "football", "basketball" };
  String[] animals = { "dog", "lion" };
  String[] foods = { "ice cream", "pizza" };

  //Here, it is asking the user for what topic they want to do. 
  System.out.print("Chose a topic (sports/animals/foods): ");
  //The answer will be stored in the variable "choice". 
  String choice = myScan.nextLine();
  
  //This is the variable where the randomized word from the sports array will be stored. 
  String randomizedSports = (sports[new Random().nextInt(sports.length)]);
  //This is the variable where the randomized word from the animals array will be stored.   
  String randomizedAnimals = (animals[new Random().nextInt(animals.length)]);
  //This is the variable where the randomized word from the foods array will be stored.   
  String randomizedFood = (foods[new Random().nextInt(foods.length)]);

  // SPORTS-FOOTBALL
  //This is an if else statement. It is saying, if the choice of the user is sports and the randomized word inside the sports array is football, then output the following.   
  if (choice.toLowerCase().equals("sports") && randomizedSports.equals("football")) {
    //The flush method is used here to flush everything that has been done before. This will allow the football page to be by itself.   
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //This is ascii art and it is the title of the chosen topic "sports".   
    System.out.println(" _____                  _       ");
    System.out.println("/ ____|                | |      ");
    System.out.println("| (___  _ __   ___  _ __| |_ ___ ");
    System.out.println(" \\___ \\| '_ \\ / _ \\| '__| __/ __|");
    System.out.println(" ____) | |_) | (_) | |  | |_\\__ \\");
    System.out.println("|_____/| .__/ \\___/|_|   \\__|___/");
    System.out.println("       | |                       ");
    System.out.println("       |_|                       ");
    //A space is used to separate the title from the writing.
    System.out.println("\n");
    //This is an introductionary sentence    
    System.out.println("We have randomized a mad lib from the sports section. This mad lib is going to be about football! ⚽");
    System.out.println("\n");
    //Instructions from randomizing a word.     
    System.out.println("For randomizing a word type : random");
    System.out.println("\n");
    // The file with the football mad lib is imported here. When run is called, the code is executed. Source: Mr Poiriers replit java basics.
    football.run();
    //Once the code is executed, the playGame boolean will turn into false.     
    playGame = false;
      } 

    // SPORTS - BASKETBALL 
    //This is an if else statement. It is saying, if the choice of the user is sports and the randomized word inside the sports array is basketball, then output the following.   
  else if (choice.toLowerCase().equals("sports") && randomizedSports.equals("basketball")) {
    // The flush method is used here to start the basketball mad libs. 
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //Ascii art with the topic "sports". 
    System.out.println(" _____                  _       ");
    System.out.println("/ ____|                | |      ");
    System.out.println("| (___  _ __   ___  _ __| |_ ___ ");
    System.out.println(" \\___ \\| '_ \\ / _ \\| '__| __/ __|");
    System.out.println(" ____) | |_) | (_) | |  | |_\\__ \\");
    System.out.println("|_____/| .__/ \\___/|_|   \\__|___/");
    System.out.println("       | |                       ");
    System.out.println("       |_|                       ");
    System.out.println("\n");
    //Sentence letting the user know what the mad libs is about.   
    System.out.println( "We have randomized a mad lib from the sports section. This mad lib is going to be about basketball! 🏀");
    System.out.println("\n");
    //Instructions for randomising a word.    
    System.out.println("For randomizing a word type : random");
    System.out.println("\n");
    // The file with the basketball mad lib is imported here. When run is called, the code is executed. Source: Mr Poiriers replit java basics.
    basketball.run();
    //Once the code is executed, the playGame boolean will turn into false.     
    playGame = false;
      } 

  // FOODS - PIZZA
  //This is an if else statement. It is saying, if the choice of the user is foods and the randomized word inside the sports array is pizza, then output the following.   
  else if (choice.toLowerCase().equals("foods") && randomizedFood.equals("pizza")) {
    // The flush method is used here to start the pizza mad libs. 
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //Ascii art with the title of the topics "foods".
    System.out.println(" ______              _     ");
    System.out.println("|  ____|            | |    ");
    System.out.println("| |__ ___   ___   __| |___ ");
    System.out.println("|  __/ _ \\ / _ \\ / _` / __|");
    System.out.println("| | | (_) | (_) | (_| \\__ \\");
    System.out.println("|_|  \\___/ \\___/ \\__,_|___/");
    System.out.println("\n");
    //Sentence telling the user the topic of the mad libs. 
    System.out.println("We have randomized a mad lib from the foods section. This mad lib is going to be about pizza!🍕");
    System.out.println("\n");
    //Instructions for randomzing a word. 
    System.out.println("For randomizing a word type : random");
    System.out.println("\n");
    // The file with the pizza mad lib is imported here. When run is called, the code is executed. Source: Mr Poiriers replit java basics.
    pizza.run();
    //Once the code is executed, the playGame boolean will turn into false.     
    playGame = false;
      } 

  // FOODS - ICE CREAM
  //This is an if else statement. It is saying, if the choice of the user is foods and the randomized word inside the sports array is ice cream, then output the following.   
  else if (choice.toLowerCase().equals("foods") && randomizedFood.equals("ice cream")) {
    // The flush method is used here to start the ice cream mad libs. 
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //Ascii art with the title of the topics "foods".
    System.out.println(" ______              _     ");
    System.out.println("|  ____|            | |    ");
    System.out.println("| |__ ___   ___   __| |___ ");
    System.out.println("|  __/ _ \\ / _ \\ / _` / __|");
    System.out.println("| | | (_) | (_) | (_| \\__ \\");
    System.out.println("|_|  \\___/ \\___/ \\__,_|___/");
    System.out.println("\n");
    //Sentence telling the user the topic of the mad libs. 
    System.out.println("We have randomized a mad lib from the foods section. This mad lib is going to be about ice cream! 🍦");
    System.out.println("\n");
    //Instructions for randomzing a word.      
    System.out.println("For randomizing a word type : random");
    System.out.println("\n");
    // The file with the ice cream mad lib is imported here. When run is called, the code is executed. Source: Mr Poiriers replit java basics.
    iceCream.run();
    //Once the code is executed, the playGame boolean will turn into false.          
    playGame = false;
      }    

  // ANIMALS - DOG
  //This is an if else statement. It is saying, if the choice of the user is animals and the randomized word inside the sports array is dog, then output the following.   
  else if (choice.toLowerCase().equals("animals") && randomizedAnimals.equals("dog")) {
    // The flush method is used here to start the dog mad libs. 
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //Ascii art with the title of the topics "animals".
    System.out.println("                 _                 _     ");
    System.out.println("    /\\         (_)               | |    ");
    System.out.println("   /  \\   _ __  _ _ __ ___   __ _| |___ ");
    System.out.println("  / /\\ \\ | '_ \\| | '_ ` _ \\ / _` | / __|");
    System.out.println(" / ____ \\| | | | | | | | | | (_| | \\__ \\");
    System.out.println("/_/    \\_\\_| |_|_|_| |_| |_|\\__,_|_|___/");
    System.out.println("\n");
    //Sentence telling the user the topic of the mad libs.  
    System.out.println("We have randomized a mad lib from the animals section. This mad lib is going to be about dogs! 🐶");
    System.out.println("\n");
    //Instructions for randomzing a word.      
    System.out.println("For randomizing a word type : random");
    System.out.println("\n");
    // The file with the dog mad lib is imported here. When run is called, the code is executed. Source: Mr Poiriers replit java basics.
    dog.run();
    //Once the code is executed, the playGame boolean will turn into false.          
    playGame = false;
      }

    // ANIMALS - LIONS
    //This is an if else statement. It is saying, if the choice of the user is animals and the randomized word inside the sports array is lion, then output the following.   
  else if (choice.toLowerCase().equals("animals") && randomizedAnimals.equals("lion")) {
    // The flush method is used here to start the dog mad libs. 
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //Ascii art with the title of the topics "animals".
    System.out.println("                 _                 _     ");
    System.out.println("    /\\         (_)               | |    ");
    System.out.println("   /  \\   _ __  _ _ __ ___   __ _| |___ ");
    System.out.println("  / /\\ \\ | '_ \\| | '_ ` _ \\ / _` | / __|");
    System.out.println(" / ____ \\| | | | | | | | | | (_| | \\__ \\");
    System.out.println("/_/    \\_\\_| |_|_|_| |_| |_|\\__,_|_|___/");
    System.out.println("\n");
    //Sentence telling the user what the topic of the mad libs is.      
    System.out.println("We have randomized a mad lib from the animals section. This mad lib is going to be about lions! 🦁");
    System.out.println("\n");
     //Instructions for randomising a word.       
    System.out.println("For randomizing a word type : random");
    System.out.println("\n");
    // The file with the lion mad lib is imported here. When run is called, the code is executed. Source: Mr Poiriers replit java basics.
    lion.run();
    //Once the code is executed, the playGame boolean will turn into false.              
    playGame = false;
      } 
      
  else {
    //If none of the above are true, then the boolean playGame will be true, meaning the question of what topic the user wants to chose is gonna be asked again. 
    playGame = true;
    System.out.print("\033[H\033[2J");
    System.out.flush();
      }

   //This is the scanner used for playing again. 
   Scanner playAgain = new Scanner(System.in);
   System.out.println("\n");
   // If the boolean playGame is false, it will ask the user to play again. 

  if (!playGame) {
    System.out.print("Do you want to play again (yes/no)🤔 : ");
    //The answer of the user will be stored in a variable called answer.      
    String playAgain1 = playAgain.next();
    //If the answer is yes, the game will be played again. 
  if (playAgain1.toLowerCase().equals("yes")) {
    System.out.println("Ok! Lets play again!");
    System.out.println("\n");
    playGame = true;
    //If the game is played again, the amount of times the user has played again will increase by 1.         
    tries++;
    System.out.print("\033[H\033[2J");
    System.out.flush();
        }
    //If answer is not equal to yes, the game will end and the boolean playGame will be false.  
    else if (playAgain1.toLowerCase().equals("no")) {
    System.out.println("Oh ok thats fine! You played this game " + tries + " times!! ");
    System.out.println("Goodbye!");
    playGame = false;
        }

  else {
     System.out.println("I dont know what you mean by that, but it's fine. You have played this game" + tries + ". Goodbye!");
    playGame = false;
          }  
        }
      }
    }
  }
