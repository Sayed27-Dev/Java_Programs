import java.util.Scanner;

public class Number_Guess_Game {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Do you want to play multiple rounds? (Y/N) ");
        char playAgain = scanner.next().charAt(0);


        while (playAgain == 'Y' || playAgain == 'y') {


            int randomNumber = (int) (Math.random() * (MAX_RANGE - MIN_RANGE + 1)) + MIN_RANGE;


            int numberOfAttempts = MAX_ATTEMPTS;


            boolean isGuessedCorrectly = false;
            while (numberOfAttempts > 0 && !isGuessedCorrectly) {


                System.out.println("Enter your guess between (1-100): ");
                int userGuess = scanner.nextInt();


                if (userGuess == randomNumber) {
                    isGuessedCorrectly = true;
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Too low, try again.");
                }


                numberOfAttempts--;
            }


            if (isGuessedCorrectly) {
                System.out.println("Congratulations, you guessed it correctly!");
            } else {
                System.out.println("Sorry, you ran out of attempts.");
                System.out.println("The correct number was: " + randomNumber);
            }


            System.out.println("Do you want to play another round? (Y/N) ");
            playAgain = scanner.next().charAt(0);
        }


        scanner.close();
    }
}
