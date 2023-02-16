package kg.kadyrbekov.programmingSkills;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int found = 0;
        while (0 < n) {
            int dig = n % 10;
            sum += dig;
            found *= dig;
            n /= 10;
        }
        return sum - found;
    }
}
