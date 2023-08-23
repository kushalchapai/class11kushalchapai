import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempt= 0;

        
        int randomNumber = random.nextInt(100);
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempt ++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " +  attempt + "attempts" );
            } else if (userGuess < randomNumber) {
                System.out.println("Try higher...");
            } else {
                System.out.println("Try lower...");
            }
        }

        scanner.close();
    }
}


