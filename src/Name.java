import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Name {
    public static String choseName() throws FileNotFoundException {
        File file = new File(("movies.txt"));
        Scanner fileScanner = new Scanner(file);

        Integer numberOfLines = fileScanner.nextLine().length();
        Integer pick;
        String chosenName = "";

        Double index = Math.random();
        pick = (int) (index * numberOfLines + 1);

        for (int i = 0; i < pick; i++) {
            chosenName = fileScanner.nextLine();
        }
        return chosenName;
    }
}
