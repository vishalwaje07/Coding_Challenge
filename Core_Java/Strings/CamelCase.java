public class CamelCase {

    public static String toCamelCase(String[] words) {
        StringBuilder camelCase = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            camelCase.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }
        return camelCase.toString();

    }

    public static void main(String[] args) {
        String[] words = { "java", "python", "kafka" };
        String camelCaseString = toCamelCase(words);
        System.out.println(camelCaseString);
    }

}
