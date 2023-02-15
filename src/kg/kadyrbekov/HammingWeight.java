package kg.kadyrbekov;

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000010000000));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        int found = 1;
        for (int i = 0; i <= n; i++) {
            if ((n & found) != 0) count++;
            found = found << 1;
        }
        return count;
    }
}
