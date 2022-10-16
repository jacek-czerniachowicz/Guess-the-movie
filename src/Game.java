import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void game() throws FileNotFoundException {
        String movieName = Name.choseName();
        Scanner scanner = new Scanner(System.in);

        System.out.println(movieName);

        List<Character> playerGuesses = new ArrayList<>();
        playerGuesses.add(' ');


        int playerLife = 10;
        boolean isRunning = true;

        printWordState(movieName, playerGuesses);
        while (true) {
            getPlayerGuess(scanner, movieName, playerGuesses);
            if(printWordState(movieName, playerGuesses)){
                break;
            }
        }

        System.out.println("You Win!");
    }
    private static boolean printWordState(String movieName, List<Character> playerGuesses){
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
        return (movieName.length() == correctCount);
    }

    private static void getPlayerGuess(Scanner scanner, String movieName, List<Character> playerGuesses){
        System.out.println("Please enter a letter ");
        String letterGuess = scanner.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
    }

}