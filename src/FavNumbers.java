import java.util.Scanner;

public class FavNumbers {
    public static void main (String[] args) {

        //initialize objects
        Scanner userInput = new Scanner(System.in);
        String promptInt = "What is your favorite integer";
        String promptDouble = "What is your favorite double?";

        //get fav int
        SafeInput.getInt(userInput, promptInt);

        //get favorite double
        SafeInput.getDouble(userInput, promptDouble);



    }
}
