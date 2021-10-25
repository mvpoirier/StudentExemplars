""""
DATE 2020-10-21
NAME: A.K - ABA Guessing Game Example
PURPOSE: Main
"""
#All the imports from modules and functions
from pokemonChoices import pokeNames
from pokemonChoices import fireType
from pokemonChoices import waterType
from pokemonChoices import grassType
from pokemonChoices import normalType
from pokemonChoices import flyingType
from pokemonChoices import rockType
from pokemonChoices import groundType
from pokemonChoices import poisonType
from pokemonChoices import ghostType
from pokemonChoices import iceType
from pokemonChoices import psychicType
from pokemonChoices import bugType
from pokemonChoices import electricType
from pokemonChoices import fightingType
from pokemonChoices import dragonType
from pokemonChoices import smallSize
from pokemonChoices import mediumSize
from pokemonChoices import bigSize
from pokemonChoices import fourLegs
from pokemonChoices import twoLegs
from pokemonChoices import noLegs
from pokemonChoices import lev
from pokemonChoices import primStage
from pokemonChoices import middleStage
from pokemonChoices import finalStage
from pokemonChoices import powerPok
from pokemonChoices import weakPok
import asciiArt
import random
import time
import subprocess

#Defining fucntion playSound
def playSound(soundfile):
    subprocess.call(["afplay", soundfile])

#Greetings and name
print("Hello Pokefan," "\n" "Welcome to the Pokemon names guessing game.")
userName= input("Name:")


if (input("How has your day been ? (Good/Bad): ") == "Good"):
    print("Awesome, Please enjoy the game")
else:
    #Rules of the game
    print("Oh I am sorry, I hope this game will lighten your spirit!")
print("Here are the rules" "\n" "You will have 5 chances to guess the correct pokemon"
      "\nMake sure your guesses begin with a capital letter")

game= True #While loop variable
while game == True:
    startTime=time.time() #Timer starts
    randomWord= random.choice(pokeNames) # This is the random pokemon generator/picker

    #First hint with if,elif,else statement
    print("\n Here is the first hint")
    if randomWord in powerPok:
        print("\nThis is a powerful(420+ base stat) pokemon")
    elif randomWord in weakPok:
        print("\nThis is a weak(420 less base stat) pokemon")
    else:
        print("No stats in code")
    
    #First guess and the checking if it matches the random Pokemon    
    firstGuess=input("What pokemon do you think it is ?:")
    if firstGuess==randomWord:
        asciiArt.winner(1) #Ascii art
        playSound("Yay.mp3") #Yay sound
        game = False

    #Negative sound    
    else:
        playSound("Negative.wav")
        print("That's not it")

        #Second hint which is types with if statement as some pokemon have 2 types
        print("\nHere is a hint")
        asciiArt.sad(1)
        if randomWord in fireType:
            print("It is a fire type pokemon")
        if randomWord in waterType:
            print("It is a water type pokemon")
        if randomWord in grassType:
            print("It is a grass type pokemon")
        if randomWord in normalType:
            print("It is a normal type pokemon")
        if randomWord in flyingType:
            print("It is a flying type pokemon")
        if randomWord in rockType:
            print("It is a rock type pokemon")
        if randomWord in groundType:
            print("It is a ground type pokemon")
        if randomWord in poisonType:
            print("It is a poison type pokemon")
        if randomWord in ghostType:
            print("It is a ghost type pokemon")
        if randomWord in iceType:
            print("It is a ice type pokemon")
        if randomWord in psychicType:
            print("It is a psychic type pokemon")
        if randomWord in bugType:
            print("It is a bug type pokemon")
        if randomWord in electricType:
            print("It is a electric type pokemon")
        if randomWord in fightingType:
            print("It is a fighing type pokemon")
        if randomWord in dragonType:
            print("It is a dragon type pokemon")

        #Second guess.
        secondGuess=input("2What pokemon do you think it is ?: ")
        if secondGuess==randomWord:
            asciiArt.winner(1) #ascii art
            playSound("Yay.mp3")#Yay sound
            game=False
        else:
            playSound("Negative.wav") #Negative sound
            print("Oh, Thats no it")
            asciiArt.sad(1) #ascii art
            
            #Hint 3 with if,elif,else
            print("\nHere have another hint")
            if randomWord in smallSize:
                print("This is a small pokemon!")
            elif randomWord in mediumSize:
                print("This is a regular/medium sized pokemon!")
            else:
                if randomWord in bigSize:
                    print("This is a large pokemon!")

            #Third Guess 
            thirdGuess=input("3 What pokemon do you think it is ?: ")
            if thirdGuess==randomWord:
                asciiArt.winner(1) #ascii art
                playSound("Yay.mp3")#Yay sound
                game=False
            else:
                playSound("Negative.wav") #Negative sounds
                print("\n ohh, heres another hint")
                asciiArt.sad(1)

                #Hint 4 with if,elif,else
                if randomWord in fourLegs:
                    print("The pokemon travels on four legs")
                elif randomWord in twoLegs:
                    print("The pokemon travels on two legs")
                elif randomWord in noLegs:
                    print("The pokemon travels without legs")
                elif randomWord in lev:
                    print("The pokemon travels by levitating/float/fly")
                else:
                    print("Error")

                #Fourth Guess
                fourthGuess=input("\n 4What pokemon do you think it is ?: ")
                if fourthGuess==randomWord:
                    asciiArt.winner(1) #winner sound
                    playSound("Yay.mp3") #Yay sound
                    game=False
                else:
                    #Negative sound and next hint
                    playSound("Negative.wav")
                    print("\nohh that's not good \nHave another hint!")
                    asciiArt.sad(1)#ascii art

                    #hint with if,elif and else statements
                    if randomWord in primStage:
                        print("This is a first stage/form Pokemon")
                    elif randomWord in middleStage:
                        print("This is a middle stage Pokemon")
                    elif randomWord in finalStage:
                        print("This is final form/stage Pokemon")
                    else:
                        print("Error")
                    
                    #Final Guess
                    finalGuess=input("\n 5What pokemon do you think it is ?: ")
                    if finalGuess==randomWord:
                        asciiArt.winner(1) #Ascii art
                        playSound("Yay.mp3") #Yay sound
                        game=False
                    else:
                        #The answer to the game
                        print("Haha, good try it was " + randomWord)

    endTime=time.time() #Ending the timer
    totalTime= endTime-startTime#Finding out the time taken to play the game.
    print( "The time taken is for this round is " + str(int(totalTime)) + " sec" )

    #Play the game again
    reset= input("Do you want to play again? : (yes/no)")
    if reset == ("no"):
        print("Thank you for playing")
        game= False

    else:
        #Game continues
        game=True

            
            

         
                    
                


        

                
            
    

