package kg.kadyrbekov;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBad(1));

    }

    public static int firstBad(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (isBadVersion(midPoint)) {
                right = midPoint;
            } else {
                left = midPoint + 1;
            }
        }
        if (left == right && isBadVersion(left)) {
            return left;
        }
        return -1;
    }

    private static boolean isBadVersion(int midPoint) {
        int m = midPoint;
        return true;
    }
}
