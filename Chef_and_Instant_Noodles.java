
/* Chef has invented 
1
1-minute Instant Noodles. As the name suggests, each packet takes exactly 
1
1 minute to cook.

Chef's restaurant has 
X stoves and only 
1
1 packet can be cooked in a single stove at any minute.

How many customers can Chef serve in 
Y minutes if each customer orders exactly 
1
1 packet of noodles? */
import java.util.*;

public class Chef_and_Instant_Noodles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int maxServed = num1 * num2;
            System.out.println(maxServed);
        }
    }
}