import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void game() throws FileNotFoundException {
        // Choosing movie name from list
        String movieName = Name.choseName();
        Scanner scanner = new Scanner(System.in);
        List<Character> playerGuesses = new ArrayList<>();
        playerGuesses.add(' ');

        int playerLives = 10;

        printWordState(movieName, playerGuesses);
        // main game loop
        while (true) {
            if (playerLives <= 0){ // lose condition
                System.out.println("Ups... you lose!");
                break;
            }
            System.out.println(playerLives + " lives left");
            // left lives counter
            if (!getPlayerGuess(scanner, movieName, playerGuesses)){
                playerLives--;
            }
            // win condition
            if(printWordState(movieName, playerGuesses)){
                System.out.println("You Win!");
                break;
            }

        }


    }
    private static boolean printWordState(String movieName, List<Character> playerGuesses){
        // function that printing out dashes and letter player correctly guessed
        int correctCount = 0;
        for (int i = 0; i < movieName.length(); i++) {
            if (playerGuesses.contains(movieName.charAt(i))) {
                System.out.print(movieName.charAt(i));
                correctCount++;
            }else if (movieName.charAt(i) == ' ') {
                System.out.print(" ");
            }else {
                System.out.print("_");
            }
        }
        System.out.println();
        // returning true if all letter in movie title are guessed
        return (movieName.length() == correctCount);
    }

    private static boolean getPlayerGuess(Scanner scanner, String movieName, List<Character> playerGuesses){
        // function that checking is player letter is in movieName
        System.out.println("Please enter a letter ");
        String letterGuess = scanner.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        // returning true if player guess correctly
        return movieName.contains(letterGuess);
    }

}