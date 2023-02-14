package kg.kadyrbekov;

public class SubtractSum {
    public static void main(String[] args) {

        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum = n = n * n;
            sum1 = n = n + n;
            sum =-sum1;
        }
        return n;
    }
}
