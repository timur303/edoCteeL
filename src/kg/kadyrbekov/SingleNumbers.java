package kg.kadyrbekov;

public class SingleNumbers {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,3,3}));

    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}

