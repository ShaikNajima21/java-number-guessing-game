import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A seed (java GuessingGame 42) makes the numbers repeatable, for testing
        Random random = args.length > 0 ? new Random(Long.parseLong(args[0])) : new Random();
        System.out.println("=== Number Guessing Game ===");
        // Milestones 1 and 5: a new secret each round, play again on y
        
        String playAgain;

        
        do {
            int secret = random.nextInt(100) + 1;

            playRound(scanner, secret);

            System.out.print("Play again? (y/n): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    static void playRound(Scanner scanner, int secret) {
        // Milestones 3 and 4: up to 7 guesses

        final int MAX_ATTEMPTS = 7;
        int attempts = 0;
        boolean won = false;

        System.out.println("I am thinking of a number from 1 to 100. you have 7 attempts.");

        while (attempts < MAX_ATTEMPTS && !won){

            System.out.print("Your guess: ");
            int guess = scanner.nextInt();

            if(guess < 1 || guess > 100){
                System.out.println("Please guess a number from 1 to 100.");
                continue;
            }

            attempts++;

            won = checkGuess(guess, secret);
        }

        if(won) {
            System.out.println("Attempts used: " + attempts);
        } else {
            System.out.println("Out of  attempts! The secret number was: " + secret);
        }
    }

    static boolean checkGuess(int guess, int secret) {
        // Milestone 2: print the hint, return true when correct

        if (guess > secret){
            System.out.println("Too high!");
            return false;
        } else if (guess < secret) {
            System.out.println("Too low!");
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }
}
