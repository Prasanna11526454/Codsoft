
    import java.util.Scanner;

    public class NumberGuessingGame {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int lowerBound = 1;
            int upperBound = 100;
            int maxAttempts = 5;
            int rounds = 0;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game!");

            do {
                int targetNumber = generateRandomNumber(lowerBound, upperBound);
                int attempts = 0;

                System.out.println("\nRound " + (rounds + 1));
                System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    int userGuess = sc.nextInt();
                    attempts++;

                    if (userGuess == targetNumber) {
                        System.out.println("Congratulations! You guessed the correct number!");
                        score += maxAttempts - attempts + 1;
                        break;
                    } else if (userGuess < targetNumber) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
                }

                rounds++;

                System.out.print("Do you want to play again? (yes/no): ");
            } while (sc.next().equalsIgnoreCase("yes"));

            System.out.println("Game over. Your total score is: " + score);
            sc.close();
        }

        private static int generateRandomNumber(int lowerBound, int upperBound) {
            return (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
        }
    }


