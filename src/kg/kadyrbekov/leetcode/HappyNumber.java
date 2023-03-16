package kg.kadyrbekov.leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        List<Integer> used = new ArrayList<Integer>();

        while(n>0)
        {
            int tmp = 0;
            while(n>0)
            {
                int i = n%10;

                tmp += i*i;
                n = n/10;
            }

            if(used.contains(tmp))
            {
                return false;
            }
            else
            {
                used.add(tmp);
            }


            if(tmp==1)
            {
                return true;
            }

            n = tmp;

        }

        return false;
    }

}
