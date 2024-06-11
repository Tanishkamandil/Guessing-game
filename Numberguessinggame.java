import java.util.Scanner;
public class  Numberguessinggame{
    public static void main(String[] args) {


   Scanner sc = new Scanner(System.in);
           int Chances = 5;
           System.out.println("Welcome To Guess Number Game!! ");
           System.out.println("You Will Be Asked To Guess A Number To Win A Game.");
           System.out.println("You Have "+  Chances  + " Chances To Guess The Number Between 0 And 100.");


    Scanner sc1 = new Scanner(System.in); 
           boolean playAgain;
           do {
              playGame();  
              System.out.println("Would you like to play again?(Yes/No)");
              String PlayChoice = sc.next();
              playAgain = PlayChoice.equalsIgnoreCase("yes");  
              } while (playAgain);
          System.out.println("Thanks for playing.Goodbye.");
        }         
        
        static void playGame() {
            int guessNumber; 
            int usersGuess;      
            int guessCount;      
            guessNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("What is your first guess?");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == guessNumber) {
                  System.out.println("OOHOOO Your Number Is Correct " + guessCount
                          + " guesses!  The number was " + guessNumber);
                  break;  
               }
               if (guessCount == 5) {
                  System.out.println("You didn't get the number in 5 guesses.");
                  System.out.println("You lose. The number was " + guessNumber);
                  break;  
               }
               if (usersGuess < guessNumber)
                  System.out.println("That's too low.  Try again:");
               else if (usersGuess > guessNumber)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
        } 
                    
     } 
    
