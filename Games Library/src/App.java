import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isPlaying = true;
        System.out.println("Welcome to the Games Library!");
        while (isPlaying) {
            System.out.println("So far, there is only the Numbers Game in the " +
                "library. Please excuse the lack of variety.");
            playNumbers();
            isPlaying = promptBool("\nDo you want to play another game? y/n");
        } // Exit while (isPlaying)
    } // Exit main()

    public static void playNumbers() {
        Scanner numbersScanner = new Scanner(System.in);
        boolean isPlayNumbers = true;
        while (isPlayNumbers) {

            // Welcome the player.
            System.out.println("\nWelcome to the Numbers game! Try to guess a " +
            "random whole number.");

            // Create variables.
            ArrayList guesses = new ArrayList();
            boolean gameOver = false;
            System.out.println("Enter game difficulty (Whole positive number).");
            int max = numbersScanner.nextInt();
            int randomNumber = (int)((Math.random() * max) + 1);
            
            // Guess Number loop.
            while (!gameOver){
                System.out.println("\nGuess a whole number between 1 and " + max);
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

                // Give reminder that the number should be between 1 and the 
                // max.
                if (numberGuess > max || numberGuess < 1) {
                    System.out.println("The number is between 1 and " + max +
                    ", friend. Try to keep your guesses between them. :)");
                }

                // Give game report.
                if (gameOver) {
                    numbersSummary(guesses);
                }
                
            } // Exit while (!gameOver)
            
            // Prompt for another game of Numbers.
            isPlayNumbers = promptBool("Would you like to play Numbers "+
                "again? y/n");

        } // Exit while (isPlayNumbers).
        
    } // Exit playNumbers()

    /* numbersSummary */
    public static void numbersSummary(ArrayList guesses) {
        String appendix = " guess";
        if (guesses.size() > 1) {
            appendix += "es";
        }
        appendix += ".";
        System.out.println("\nYou guessed the number in " + 
        guesses.size() + appendix + " Your guesses were:");
        System.out.println(guesses);
    } // Exit numbersSummary()


    /* promptBool()*/
    public static boolean promptBool(String prompt) {

        // Create variables.
        Scanner boolScanner = new Scanner(System.in);
        String boolInput = ""; 
        boolean isValidBool = false;

        // Do this while the input isn't a valid option.
        while (!isValidBool) {
            System.out.println(prompt);
            boolInput = boolScanner.next();

            // Regex for purely alphabetical string.
            if (boolInput.matches("[a-zA-Z]+")) {
                boolInput = boolInput.toLowerCase();
                
                // If it is a valid option, exit the loop.
                if (boolInput.equals("y") || boolInput.equals("n")) {
                    isValidBool = true;
                }

            }

            // Error line.
            if (!isValidBool) {
                System.out.println("That wasn't an option. "
                + "Please type 'y' or 'n'.");
            }

        } // Exit while (!isValidBool)

        if (boolInput.equals("n")) {
            return false;
        }
        else {
            return true;
        }

    } // Exit promptBool()

} // Exit App class.
