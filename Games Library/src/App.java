import java.util.Scanner;

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
        boolean isPlayNumbers = true;
        while (isPlayNumbers) {

        } // exit while (isPlayNumbers).

    } // exit playNumbers()

    public static void playHangman() {

    } // exit playHangman
}
