
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "Programming";

        List<String> result = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}