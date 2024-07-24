
// Importing the packages
import java.util.Arrays;
import java.util.List;

// Problem Statemet: 
// In this problem we have to get the square of the every number.
// Then find the numbers which is greater than 100.
// Then find the average of the number which is greater than 100.

public class Number_Square_Average {
    public static void main(String[] args) {

        // We are using the list
        List<Integer> numbers = Arrays.asList(10, 20, 30, 100, 200, 300);

        double result = numbers.stream() // In this step we are getting the data into stream
                .map(e -> e * e) // In this step we are getting the square of the numbers.
                .filter(e -> e > 100) // In this we are filltering the data (greater than 100)
                .mapToInt(e -> e) // Traversing the to the elements
                .average() // We are apping the average method to get the average
                .getAsDouble();

        // Printing the values
        System.out.println(result);
    }
}