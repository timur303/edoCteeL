package kg.kadyrbekov.leetcode;

public class FindPivotIndex {
    public static void main(String[] args) {

        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));

    }

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i : nums) total += i;

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((total - nums[i] - left) == left) return i;
            left+=nums[i];
        }
        return -1;
    }
}