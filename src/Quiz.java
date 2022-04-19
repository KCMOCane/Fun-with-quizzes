import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Quiz {
    static ArrayList<Question> questions = new ArrayList<>();

    public static String getUserInput(boolean upper) {
        Scanner input = new Scanner(System.in);

        String output = input.nextLine();

        if(upper) {
            output = output.toUpperCase();
        } return output;
    }

    public static void addQuestion(Question aQuestion) {
        questions.add(aQuestion);
    }

}
