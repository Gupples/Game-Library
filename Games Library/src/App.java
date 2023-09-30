import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isPlaying = true;
        Scanner myInput = new Scanner(System.in);
        while (isPlaying) {
            // playNumbers();
            isPlaying = promptBool("Do you want to play again? y/n"); // prompt

            /* Convert the next block of code to stand-alone function 
            getStringInput(String prompt, String error). */
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
                int randomNumber = (int)((Math.random() * max + 1) + 1);
                System.out.println("Guess a random number between 1 and " + max);
                int numberGuess = numbersScanner.nextInt();
                guesses.add(numberGuess);
                if (numberGuess == randomNumber) {
                    System.out.println("You guessed the number! ^_^");
                    gameOver = true;
                }
                else if (numberGuess > randomNumber) {
                    System.out.println("Too high.");
                }
                else {
                    System.out.println("Too low.");
                }

                // Give game report.
                if (gameOver) {
                    numbersSummary(guesses);
                } // exit if (gameOver)
                
            } // exit while (!gameOver)
            
            // Prompt for another game of Numbers.

            
        } // exit while (isPlayNumbers).
        
    } // exit playNumbers()

    /* numbersSummary */
    public static void numbersSummary(ArrayList guesses) {
        String appendix = " guess";
        if (guesses.size() > 1) {
            appendix += "es";
        }
        appendix += ".";
        System.out.println("You guessed the number in " + 
        guesses.size() + appendix + "Your guesses were:");
        System.out.println(guesses);
    }

    /* playHangman(). */
    public static void playHangman() {

    } // exit playHangman


    /* promptBool()*/
    public static boolean promptBool(String prompt) {
        Scanner boolScanner = new Scanner(System.in);
        String boolInput = ""; 
        boolean isValidBool = false;
        while (!isValidBool) {
            System.out.println(prompt);
            boolInput = boolScanner.next();
            if (boolInput.matches("[a-zA-Z]+")) {
                boolInput = boolInput.toLowerCase();
                
                // Pure debug if statement.
                System.out.println("Your entry is purely alphabetical.");
                if (boolInput == "y") {
                    System.out.println("Your input: " + boolInput);
                }
                
                if (boolInput == "y" || boolInput == "n") {
                    isValidBool = true;
                }

            }
            if (!isValidBool) {
                System.out.println("That wasn't an option. "
                + "Please type 'y' or 'n'.");
            }

        } // exit while (!isValidBool)

        if (boolInput == "n") {
            return false;
        }
        else {
            return true;
        }

    }

}
