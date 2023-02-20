package kg.kadyrbekov.programmingSkills;

import java.util.Arrays;

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(111));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        int found = 1;
        for (int i = 0; i <= 32; i++) {
            if ((n & found) != 0) count++;
            found = found << 1;
        }
        return count;
    }


}