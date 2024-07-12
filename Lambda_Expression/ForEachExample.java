
// Importing the package
import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding the numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // By using the normal for loop
        System.out.println("Printing elements: For Loop");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
        System.out.println();

        // By using the lambda Expression
        System.out.println("Printing Elements: Lambda Expressions");

        numbers.forEach((n) -> {
            System.out.print(n);
        });

    }
}