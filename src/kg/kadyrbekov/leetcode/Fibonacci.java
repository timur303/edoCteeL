package kg.kadyrbekov.leetcode;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
    public static int fibonacci(int n){
        int a = 1;
        int b = 0;
        if(n < 2){
            return n;
        }
        for(int i = 2; i<=n;i++){
            int c = a + b;
            b = a;
            a = c;
        }
        return a;
    }

}
