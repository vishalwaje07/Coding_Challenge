import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Print_Even_Odd {
    public static void main(String[] args) {

        // We are using the list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // We are using streams to get the even numbers
        // In this we have used the filter to filter the data
        // After that we have stroed the data in lsit.
        List<Integer> Even_Numbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        // Printing the data.
        System.out.println("Even Numbers form the List: " + Even_Numbers);

        // As we have done for the even number same things are done to get the odd
        // numbers.
        List<Integer> Odd_Numbers = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        // Finally we are printing the results.
        System.out.println("Odd Numbers form the list: " + Odd_Numbers);
    }
}