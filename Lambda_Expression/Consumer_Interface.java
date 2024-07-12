
// Importing Package
import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer_Interface {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding Numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5); 

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);

    }
}