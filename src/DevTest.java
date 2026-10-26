import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        String prompt = "Repeat this";
        String regEx = "Color";




        SafeInput.getRegExString(pipe, prompt, regEx);
    }


}
