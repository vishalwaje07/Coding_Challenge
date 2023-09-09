
/* Chef defines a pair of positive integers (a,b) to be a Oneful Pair
Oneful Pair, ifa+b+(a⋅b)=111

For example, 
(1,55)
(1,55) is a 
Oneful Pair
Oneful Pair, since 
1+55+(1⋅55)=56+55=111
Given two positive integers 
a and 
b, output Yes if they are a 
Oneful Pair
Oneful Pair. And No otherwise. */
import java.util.*;

public class Oneful_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number");
        int a = sc.nextInt();
        System.out.println("Enter value of second number");
        int b = sc.nextInt();

        if (a + b + (a * b) == 111) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}