import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        String prompt = "What is your username?: ";
        pipe.nextLine();



        SafeInput.getNonZeroLenString(pipe, prompt);
    }
}
