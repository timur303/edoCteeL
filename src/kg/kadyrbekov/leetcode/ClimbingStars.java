package kg.kadyrbekov.leetcode;

public class ClimbingStars {
    public static void main(String[] args) {

        System.out.println(climbStars(2));
    }

    public static int climbStars(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int current = 0;
        int prev1 = 2;
        int prev2 = 1;
        for (int i = 0; i < n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
