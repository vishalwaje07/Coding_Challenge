
/*Chef wants to implement wildcard pattern matching supporting 
only the wildcard '?'. The wildcard character '?' can be 
substituted by any single lower case English letter for 
matching. He has two strings X and Y of equal length, 
made up of lower case letters and the character '?'. 
He wants to know whether the strings X and Y can be matched or not. */
import java.util.*;

public class WildCard_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String X = sc.nextLine();
            String Y = sc.nextLine();

            String result = canBeMatched(X, Y);
            System.out.println(result);

        }
    }

    static String canBeMatched(String X, String Y) {

        int len = X.length();
        for (int i = 0; i < len; i++) {
            char charX = X.charAt(i);
            char charY = Y.charAt(i);
            if (charX != charY && charX != '?' && charY != '?') {

                return "No";
            }
        }
        return "Yes";
    }
}
