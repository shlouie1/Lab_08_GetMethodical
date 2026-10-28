import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        //intialize objects
        Scanner userInput = new Scanner(System.in);

        String yearQuestion = "What year were you born ";
        String monthQuestion = "What month were you born ";
        String dayQuestion = "What day were you born ";
        String hourQuestion = "What hour were you born ";
        String minuteQuestion = "What minute were you born ";

        //Year then month questions
        SafeInput.getRangedInt(userInput, yearQuestion, 1950, 2026);
        int monthType = SafeInput.getRangedInt(userInput, monthQuestion, 1, 12);

        //day question based on month input
        switch (monthType) {
            case 1, 3, 5, 7, 10, 12:
                SafeInput.getRangedInt(userInput, dayQuestion, 1 ,31);
                break;
            case 4, 6, 8, 9, 11:
                SafeInput.getRangedInt(userInput, dayQuestion, 1, 30);
                break;
            case 2: //should this be a defualt statement?
                SafeInput.getRangedInt(userInput, dayQuestion, 1, 29);
                break;
        }

        //hour then minute questions
        SafeInput.getRangedInt(userInput, hourQuestion, 1, 24);
        SafeInput.getRangedInt(userInput, minuteQuestion, 1, 59);





    }
}
