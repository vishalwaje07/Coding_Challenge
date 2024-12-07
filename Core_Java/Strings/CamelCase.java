public class CamelCase {

    // public static String[] toCamelCase(String[] words) {
    // String[] camelCaseWords = new String[words.length];

    // for (int i = 0; i < words.length; i++) {
    // camelCaseWords[i] = words[i].substring(0, 1).toUpperCase()
    // + words[i].substring(1).toLowerCase();
    // }
    // return camelCaseWords;
    // }
    public static String[] toCamelCase(String[] words) {
        String[] camelCaseWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            camelCaseWords[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
        }
        return camelCaseWords;
    }

    public static void main(String[] args) {
        // String[] words = { "java", "python", "kafka" };
        // String[] camelCaseWords = toCamelCase(words);

        // System.out.println("Camel Case Words");
        // for (String word : camelCaseWords) {
        // System.out.println(word);
        // }

        String[] words = { "java", "python", "kafka" };
        String[] camelCaseWords = toCamelCase(words);

        System.out.println("Camel Case Words");
        for (String word : camelCaseWords) {
            System.out.println(word);
        }
    }

}
