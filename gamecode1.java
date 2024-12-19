import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Define the range for the random number (1 to 100)
        int lowerBound = 1;
        int upperBound = 100;
        
        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        // Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the number of attempts
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        // Loop until the user guesses correctly
        while (!guessedCorrectly) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            // Check if the guess is correct
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                System.out.println("It took you " + attempts + " attempts.");
                guessedCorrectly = true;
            }
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
