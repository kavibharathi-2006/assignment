public class SentenceAnalysis {
    public static void main(String[] args) {
        String sentence = "Java Programming is FUN and Powerful!";

        System.out.println("Characters count: " + sentence.length());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        System.out.println("Spaces replaced: " + sentence.replace(" ", "_"));
        System.out.println("Contains 'Java': " + sentence.contains("Java"));

        int funIndex = sentence.indexOf("FUN");
        if (funIndex != -1) {
            System.out.println("'FUN' in lowercase: " + sentence.substring(funIndex, funIndex + 3).toLowerCase());
        }
    }
}