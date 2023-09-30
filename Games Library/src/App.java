import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isPlaying = true;
        Scanner myInput = new Scanner(System.in);
        while (isPlaying) {
            // playNumbers();
            System.out.println("Do you want to play again? y/n"); // prompt

            /* Convert the next block of code to stand-alone function 
            getStringInput(String prompt, String error). */
            String playingInput = myInput.nextLine().toLowerCase(null);
            if (playingInput == "n") {

            }
            try{
            }
            catch (Exception e) {
                System.out.println("That doesn't match the bool input.");
            }
        } // exit while (isPlaying)
    }

    public static void playNumbers() {
        Scanner numbersScanner = new Scanner(System.in);
        boolean isPlayNumbers = true;
        while (isPlayNumbers) {

            boolean gameOver = false;
            while (!gameOver){
                ArrayList guesses = new ArrayList();
                // Get game ceiling.
                System.out.println("Enter game difficulty.");
                int max = numbersScanner.nextInt();
                int randomNumber = (int)(Math.random() * max + 1);
                System.out.println("Guess a random number between 0 and " + max);
                int numberGuess = numbersScanner.nextInt();
                guesses.add(numberGuess);
                if (numberGuess == randomNumber) {
                    gameOver = true;
                }
                else if (numberGuess > randomNumber) {
                    System.out.println("Too high.");
                }
                else {
                    System.out.println("Too low.");
                }
                
            } // exit while (gameOver == false)

            

        } // exit while (isPlayNumbers).

    } // exit playNumbers()

    public static void playHangman() {

    } // exit playHangman
}
