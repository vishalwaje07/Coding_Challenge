
// Importing Packages 
import java.util.*;

public class Sum_Of_Numbers {
    public static void main(String[] args) {

        // Implementing the list
        List<Integer> numbers = Array.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
        // Using Optional.
        // Optinal is container object introduced in java 8.
        // Why Optional?
        // If we use Optional then it will reduce the risk of "NullPointerException"
        // Represnt a value that may be present or absent.
        // Wraps a single value, which can be any object refence
        Optional<Integer> sumOfNumbers = numbers.stream().reduce((a, b) -> a + b);

        // Printing the sum of numbers
        // .get() returns the contained value
        System.out.println(sumOfNumbers.get());

    }
}