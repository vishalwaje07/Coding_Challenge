
/*CodeChef offers a feature called streak count. 
A streak is maintained if you solve at least one problem daily.
Om and Addy actively maintain their streaks on CodeChef. Over a span of 
N consecutive days, you have observed the count of problems solved by each of them.
Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak. */
import java.util.*;

public class CodeChef_Streak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int maxom = -1, count = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    if (maxom < count) {
                        maxom = count;
                    }
                    count = 0;
                } else
                    count++;
            }
            if (maxom < count) {
                maxom = count;

                int[] brr = new int[n];
                int maxAddy = -1;
                count = 0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] == 0) {
                        if (maxAddy < count) {
                            maxAddy = count;
                        }
                        count = 0;
                    } else
                        count++;
                }
                if (maxAddy < count) {
                    maxAddy = count;

                    if (maxom == maxAddy) {
                        System.out.println("Draw");
                    } else {
                        System.out.println(maxom < maxAddy ? "Addy " : "Om");
                    }
                }
            }
        }
    }
}