import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Name {
    public static String choseName() throws FileNotFoundException {
        // try to open file with movies titles
        File file = new File(("movies.txt"));
        Scanner fileScanner = new Scanner(file);

        // checking how many lines is in file
        Integer numberOfLines = fileScanner.nextLine().length();
        Integer pick;
        String chosenName = "";

        // choosing random movie title
        Double index = Math.random();
        pick = (int) (index * numberOfLines + 1);
        for (int i = 0; i < pick; i++) {
            chosenName = fileScanner.nextLine();
        }
        return chosenName;
    }
}
