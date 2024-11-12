public class Reverse_String_All {
    public static void main(String[] args) {
        String originalString = "Vishal Waje";
        StringBuilder sb = new StringBuilder(originalString);
        String revesed = sb.reverse().toString();
        System.out.println(revesed);
    }

}
