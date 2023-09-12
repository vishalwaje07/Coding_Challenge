/* Chef has started working at the candy store. The store has 100
100 chocolates in total.
Chef’s daily goal is to sell 
X chocolates. For each chocolate sold, he will get 1
1 rupee. However, if Chef exceeds his daily goal, he gets 2
2 rupees per chocolate for each extra chocolate.
If Chef sells 
Y chocolates in a day, find the total amount he made. */

import java.util.Scanner;

public class Candy_Store {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int X = sc.nextInt(); // Daily goal
            int Y = sc.nextInt(); // Chocolates sold
            
            int totalAmount = calculateTotalAmount(X, Y);
            System.out.println(totalAmount);
        }
    }

    public static int calculateTotalAmount(int X, int Y) {
        int totalAmount = 0;
        
        if (Y >= X) {
            totalAmount = X + (Y - X) * 2;
        } else {
            totalAmount = Y;
        }
        
        return totalAmount;
    }
}

