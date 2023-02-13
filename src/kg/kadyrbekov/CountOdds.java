package kg.kadyrbekov;

public class CountOdds {
    public static void main(String[] args) {
        System.out.println(countOdds(278382788, 569302584));
        System.out.println(oddNumber(278382788, 569302584));
    }

    public static int countOdds(int low, int high) {
        int count = 0;
        int start = low;
        if (start % 2 == 0) {
            start++;
        }
        while (start <= high) {
            count++;
            start += 2;
        }
        return count;
    }

    public static int oddNumber(int n1, int n) {
        int count = 0;
        for (int i = n1; i <= n; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
