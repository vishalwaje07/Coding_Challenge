// Importing Package 

import java.util.Arrays;
import java.util.List;

public class Avg_Of_Numbers {
    public static void main(String[] args) {

        // Using List
        // List is an collections of data 
        // List is ordered list in java 
        // List is a dynamic it can grow and sink 
        // It is in the collection framewok 

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // using Streams to get the average of the numbers
        // Stream is a functional programming approach 
        // It is used in functional interface 
        // It present the sequence of elements from source.
        // It is newly added feature in java 8.
        double result = numbers.stream().mapToInt(e -> e).average().getAsDouble();
    }
}