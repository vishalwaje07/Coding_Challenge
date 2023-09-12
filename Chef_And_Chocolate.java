/* Chef has 
X 5 rupee coins and 
Y 10 rupee coins. Chef goes to a shop to buy chocolates for Chefina where each chocolate costs 
Z rupees. Find the maximum number of chocolates that Chef can buy for Chefina. */

import java.util.Scanner;

public class Chef_And_Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int x = sc.nextInt(); // Number of 5-rupee coins
            int y = sc.nextInt(); // Number of 10-rupee coins
            int z = sc.nextInt(); // Cost of each chocolate

            int maxChocolates = calculateMaxChocolates(x, y, z);

            System.out.println(maxChocolates);
        }
    }

    public static int calculateMaxChocolates(int x, int y, int z) {
        int totalRupees = x * 5 + y * 10;
        int maxChocolates = totalRupees / z;

        return maxChocolates;
    }
}

