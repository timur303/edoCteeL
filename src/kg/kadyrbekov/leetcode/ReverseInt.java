package kg.kadyrbekov.leetcode;

public class ReverseInt {

    public static void main(String[] args) {

        System.out.println(reverseInt(456));
    }

    public static int reverseInt(int x) {

        int revers = 0;

        int pop;

        while (x != 0) {
            pop = x % 10;
            x /= 10;
            revers = (revers * 10) + pop;
        }

        return revers;
    }
}