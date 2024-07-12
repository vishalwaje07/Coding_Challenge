import java.util.*;

public class Duplicate_Element_HashSet {
    public static void main(String[] args) {
        String arr[] = { "Java", "C", "C++", "Python" };
        HashSet<String> langs = new HashSet<>();
        // We can't add Duplicate elements in HashSet.
        // So whenver we add Duplicate elements in HashSet it will give false.
        boolean flag = false;
        for (String L : arr) {
            if (langs.add(L) == false) {
                System.out.println("Duplicate Element : " + L);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Duplicate Element Not Found");
        }
    }
}
