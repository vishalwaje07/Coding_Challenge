import java.util.function.Predicate;

public class Predicate_Example {
    public static void main(String[] args) {
        String[] S = {"Sanket", "Vishal", "Pandurang", "Hari", "Raj", "Nikhil"};
        Predicate<String> p = s->s.length() > 5;

        for(String s1 : S){
            if(p.test(s1)){
                System.out.println(s1);
            }
        }

    }
}