package kg.kadyrbekov.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {

        System.out.println(pivotIndex(new int[] {2,1,-1}));

    }

    public static int pivotIndex(int[] num) {
//        Arrays.sort(num);
        int left = num[0];
        int right = num[0];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (left <= num[i]) {
                left += left;
                count++;
            }
            if (right >= num[i]) {
                right += right;
            }
        }

        return count;
    }
}
