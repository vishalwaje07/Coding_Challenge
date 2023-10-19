
/*Alice and Bob are playing a game of Blobby Volley. In this game, 
in each turn, one player is the server and the other player is the receiver. 
Initially, Alice is the server, and Bob is the receiver.
If the server wins the point in this turn, their score increases by 1, 
and they remain as the server for the next turn.
But if the receiver wins the point in this turn, their score does not increase. 
But they become the server in the next turn.
In other words, your score increases only when you win a point when you 
are the server.
Please see the Sample Inputs and Explanation for more detailed explanation.
They start with a score of 
0
0 each, and play 
N turns. The winner of each of those hands is given to you as a 
string consisting of 'A's and 'B's. 'A' denoting that Alice won that point, 
and 'B' denoting that Bob won that point. Your job is the find the score of 
both of them after the 
N turns. */
import java.util.*;

public class Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.nextLine();

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (S.charAt(0) == 'A') {
                a++;
            } else {
                b = 0;
            }
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) == 'A') {
                    if (S.charAt(i - 1) == 'A') {
                        a++;
                    }
                } else {
                    if (S.charAt(i - 1) == 'B') {
                        b++;
                    }
                }
            }
            System.out.println(a + " " + b);
        }
    }

}
