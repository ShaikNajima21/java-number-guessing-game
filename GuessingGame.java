import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A seed (java GuessingGame 42) makes the numbers repeatable, for testing
        Random random = args.length > 0 ? new Random(Long.parseLong(args[0])) : new Random();
        System.out.println("=== Number Guessing Game ===");
        // Milestones 1 and 5: a new secret each round, play again on y
        scanner.close();
    }

    static void playRound(Scanner scanner, int secret) {
        // Milestones 3 and 4: up to 7 guesses
    }

    static boolean checkGuess(int guess, int secret) {
        // Milestone 2: print the hint, return true when correct
        return false;
    }
}
