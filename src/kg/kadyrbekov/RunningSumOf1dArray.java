package kg.kadyrbekov;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(running(new int[]{1,1,1,1,1})));
    }

    public static int[] running(int[] nums) {
        for (int i = 1; i < nums.length; ++i)
            nums[i] += nums[i-1];

        return nums;
    }
}