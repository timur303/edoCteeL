package kg.kadyrbekov;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("Hello"));
    }
    public static String reverseWords(String s){
        if (s==null || s.length() == 0){
            return s;
        }

        StringBuilder builder = new StringBuilder();
        String[] split = s.split(" ");
        for (String word: split) {
            StringBuilder wordsBuilder = new StringBuilder();
            wordsBuilder.append(word);
            wordsBuilder.reverse();

            builder.append(wordsBuilder.toString() + " ");

        }
        builder.setLength(builder.length()- 1);
        return builder.toString();
    }
}
