/* Harsh was recently gifted a book consisting of 
N pages. Each page contains exactly 
M words printed on it. As he was bored, he decided to count the number of words in the book.

Help Harsh find the total number of words in the book. */
import java.util.*;
public class Counting_Words {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();

            while(t-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();

                int totalWord = x * y;
                System.out.println(totalWord);
            }
        }
    }
    
}
