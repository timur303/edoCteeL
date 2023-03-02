package kg.kadyrbekov.leetcode;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse(123));
//        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
//        reverseString(new String[]{"h", "e", "l", "l", "o"});

//        System.out.println(reverseString(new String[]{"h", "e", "l", "l", "o"}));
    }

    public static String reverseString(String[] s) {
        String word = "";
        StringBuilder builder = new StringBuilder();
        String[] split = word.split("/w");
        split = s;
        builder.append(s);
        return builder.reverse().toString();

    }


}
