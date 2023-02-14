package kg.kadyrbekov;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SalaryAverage {
    public static void main(String[] args) {
        System.out.println(average(new int[]{4000, 3000, 1000, 2000}));
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0.0;
        int count = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            count++;
        }
        return sum / count;
    }

}
