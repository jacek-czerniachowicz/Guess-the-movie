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


    }
    private static void printWordState(String movieName, List<Character> playerGuesses){
        for (int i = 0; i < movieName.length(); i++) {
            if (playerGuesses.contains(movieName.charAt(i))) {
                System.out.print(movieName.charAt(i));
            }if (movieName.charAt(i) == ' ') {
                System.out.print(" ");
            }else {
                System.out.print("_");
            }
        }
        System.out.println();
    }

}