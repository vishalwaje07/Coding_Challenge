
/* given two integers A and
B, write a program to add these two numbers and output the sum. 
Input Format The first line contains an integer 
T, the total number of test cases.
Then follow T lines, each line contains two integers, 
A and B.*/
import java.util.*;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many times do you want to add numbers");
            int testCase = sc.nextInt();

            for (int i = 0; i < testCase; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();

                System.out.println("Your sum is:" + X + Y);
            }
        }
    }

}
