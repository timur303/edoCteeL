package kg.kadyrbekov;

/**
 * @author Тимур
 */
public class MajorityElement {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] element) {
        int count = 0; //
        int candidate = 0; //
        for (int num : element) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count += 1;
            } else count -= 1;
        }
        return candidate;
    }

}
