/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hard.luck;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author filipe
 */
public class HardLuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   Scanner myKB = new Scanner(System.in); ////type identifier = new type 
   Random r = new Random();//adding code to generate the random integer
    int SecretNumber = r.nextInt(100);// Thats going to be the secret number picked by the computer. 
    int[] guesses = new int[10];//an array with ten inputs is added
    int numGuesses = 0; //starting with 0 guesses
    
     System.out.println("Welcome to the number guessing game!");//message of welcome to the user
     System.out.println("Choose a number between 0 and 100");//providing the user with the game's rules

    while (numGuesses < 10) { //adding a loop "if the number of attempts is less than 10."
      System.out.print("Guess a number: "); //asking the user to guess a number
      
      
      int guess = myKB.nextInt();//adding the guess input to myKB
      
      if (guess == SecretNumber) { //conditional if guess equals secret number you win
        System.out.println("You win!");//message to the user informing them of the victory
        return; //A return of type property information request
      }    
      
      else if (numGuesses > 0) {  //       
          
        for (int i = 0; i < numGuesses; i++) {
         /**making a loop where a message is sent to the user if a number
         * submitted by the user equals a value already entered
         */         
          if (guesses[i] == guess) {//If the number entered is equal to a number already entered in the array
          System.out.println("That was a waste – you already guessed that number!");//Message saying "That was a waste – you already guessed that number!"
          break; //Command used to end the current loop
        }
       }
      }
      guesses[numGuesses] = guess;      numGuesses++;//returning information to the array and to the loop

      if (numGuesses == 10) {
          /*If the number of attempts is equal to 10, send a message to the user saying "Hard Luck!"
          and then immediately give the secret number to the user.
          */
        System.out.println("Hard luck!");
        System.out.println("The number was " + SecretNumber);
   }
  }
 }
}
        
        // TODO code application logic here
    
