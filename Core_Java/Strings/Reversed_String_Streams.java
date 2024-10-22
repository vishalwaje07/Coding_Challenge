public class Reversed_String_Streams {

    public static void main(String[] args) {
        String originalString = "Vishal Waje";
        String reversedString = myReversedString(originalString);
        System.out.println(reversedString);
    }

    public static String myReversedString(String str){
        String reveString = str.chars()
                            .mapToObj(c->String.valueOf((char)c))
                            .reduce((s1,s2)->s2+s1)
                            .orElse(str);
    }
}