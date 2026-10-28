import java.util.Scanner;

public class SafeInput {


    /**
     *
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt) {

        String retString = ""; // Set this to zero length. Loop runs until it isn't

        do {

            System.out.print("\n" + prompt + ": "); // show prompt add space

            retString = pipe.nextLine();

        } while (retString.length() == 0);


        return retString;


    }

    public static int getInt(Scanner pipe, String prompt) {
        String trash = "";
        int retInt = 0;

        do {
            trash = "";
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
            }
            else {
                trash = pipe.nextLine();
            }
        } while (!(trash.length() == 0));

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        String trash = "";
        double retDouble = 0;

        do {
            trash = "";
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
            }
            else {
                trash = pipe.nextLine();
            }
        } while (!(trash.length() == 0));

        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        String trash = "";
        int retInt = 0;
        boolean inRange = false;

        do {
            trash = "";
            System.out.printf("\n" + prompt + "With a low of %d and a high of %d: ", low, high);
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if (retInt <= high && retInt >= low) {
                    inRange = true;
                }
            }
            else {
                trash = pipe.nextLine();
            }
        } while ((trash.length() != 0) || (inRange == false));

        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        String trash = "";
        double retDouble = 0;
        boolean inRange = false;

        do {
            trash = "";
            System.out.printf("\n" + prompt + "With a low of %f and a high of %f: ", low, high);
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if (retDouble <= high && retDouble >= low) {
                    inRange = true;
                }
            }
            else {
                trash = pipe.nextLine();
            }
        } while ((trash.length() != 0) || (inRange == false));

        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String trash = "";
        String response = "";
        boolean retBool = false;

        do {
            trash = "";
            System.out.printf("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                retBool = true;
            }
            else if ((response.equalsIgnoreCase("N"))) {
                retBool = false;
            }

            else {
                trash = response;
            }
        } while ((trash.length() != 0));

        return retBool;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String trash = "";
        String response = "";

        //have to type out the 'regEx' exactly for it to return
        do {
            trash = "";
            System.out.print("\n" + prompt + " '" + regEx + "': ");
            response = pipe.nextLine();
           if (!(response.equals(regEx))) {
              trash = response;
            }
        } while ((trash.length() != 0));

        return response;
    }

}