package kg.kadyrbekov;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String[] strings = new String[]{"(){}[]", "[}"};
        for (String s : strings) {
            System.out.printf("%s = %s%n", s, isValid(s));
        }
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
            return false;
        }
        return stack.isEmpty();
    }
}
