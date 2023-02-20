package kg.kadyrbekov.programmingSkills;

import java.util.Arrays;

public class SumOfAllOdd {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[] {1,3,5,7}));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            count++;
        }
        return sum+count;
    }

}
