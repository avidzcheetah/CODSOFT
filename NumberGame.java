import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args){
        Random rn = new Random();
        Scanner scn = new Scanner(System.in);

        boolean playAgain = true;
        int score = 0;
        int rounds = 0;
        
        while (playAgain) {
            int rnNum = rn.nextInt(100) + 1;
            boolean guessed = false;
            int attempt = 0;

            System.out.println("I have generated a number between 1 and 100.");
            System.out.println("Can you guess the number?");
            System.out.println("You can attempt 5 times.");

            while (attempt < 5 && !guessed) {
                System.out.print("Enter your guess: ");
                int guess = scn.nextInt();
                attempt++;
                
                if (guess == rnNum) {
                    System.out.println("Congratulations! You guessed correctly.");
                    guessed = true;
                    score += (5 - (attempt));
                } else {
                    System.out.println("OOPS! You guessed it wrong, Try again");
                    System.out.println(5 - attempt + " attempts remaining.");
                }
            }
            if (!guessed) {
                System.out.println("You have used all your attempts. The number was: " + rnNum);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String input = scn.next();
            if (input.equals("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
            rounds++;
        }
        System.out.println("Rounds played: " + rounds);
        System.out.println("Your score: " + score);
        System.out.println("Thank you for playing!");

        scn.close();
    }
    
}
