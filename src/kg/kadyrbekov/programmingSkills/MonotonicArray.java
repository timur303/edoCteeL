package kg.kadyrbekov.programmingSkills;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,3,2}));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean in = true;
        boolean un = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                in = false;
            }
            if (nums[i] < nums[i + 1]) {
                un = false;
            }
        }
        return in || un;
    }

}
