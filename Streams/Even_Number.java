import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Even_Number {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(5, 10, 15, 20);
        List<Integer> evenNumbers = new ArrayList<Integer>();

        // // Without Using Stream
        // for (int n : numbersList) {
        // if (n % 2 == 0) {
        // evenNumbers.add(n);
        // }
        // System.out.println(evenNumbers);
        // }

        // By using stream
        // List<Integer> evenNumbersList = numbersList.stream()
        // .filter(n -> n % 2 == 0)
        // .collect(Collectors.toList());

        evenNumbers = numbersList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

    }
}