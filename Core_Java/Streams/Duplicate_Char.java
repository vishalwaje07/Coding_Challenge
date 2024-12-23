import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate_Char {
    public static void main(String[] args) {
        String input = "Programming";

        Map<Character, Long> duplicateMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ele -> ele, Collectors.counting()));
        System.out.println(duplicateMap);
    }

}
