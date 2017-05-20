
import java.util.Scanner;

public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("matti");
        //printWithSmileys("Beerbottle");
        //printWithSmileys("mikael");

    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        int even = length + 1;
        int odd = length - 1;
        String smiley = ":)";

        if (length % 2 == 0) {
            if (length > 5) {
                printSmiley(length);
                System.out.println(smiley + " " + characterString + " " + smiley);
                printSmiley(length);

            } else {
                printSmiley(even);
                System.out.println(smiley + " " + characterString + " " + smiley);
                printSmiley(even);
            }
        }

        if (length % 2 == 1) {
            if (length < 7) {
                printSmiley(even);
                //System.out.println("");
                System.out.println(smiley + " " + characterString + "  " + smiley);
                printSmiley(even);

            } else {
                printSmiley(odd);
                //System.out.println("");
                System.out.println(smiley + " " + characterString + "  " + smiley);
                printSmiley(odd);
            }
        }

    }

    public static void printSmiley(int length) {
        String smiley = ":)";
        for (int i = 0; i < length; i++) {
            System.out.print(smiley);
        }
        System.out.println("");
    }
}
