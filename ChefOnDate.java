/* Chef and his girlfriend go on a date. Chef took 
X dollars with him, and was quite sure that this would be enough 
to pay the bill. At the end, the waiter brought a bill of 
Y dollars. Print "YES" if Chef has enough money to pay the bill, 
or "NO" if he has to borrow from his girlfriend and leave a bad impression on her. */
import java.util.Scanner;

public class ChefOnDate {
    void printAge(int t, int[] x, int[] y) {
        for (int i = 0; i < t; i++) {
            if (x[i] >= y[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int[] x = new int[t]; // Array to store X dollars
        int[] y = new int[t]; // Array to store Y dollars
        
        for (int i = 0; i < t; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        ChefOnDate chef = new ChefOnDate();
        chef.printAge(t, x, y);

        sc.close();
    }
}

