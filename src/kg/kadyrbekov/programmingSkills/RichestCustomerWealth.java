package kg.kadyrbekov.programmingSkills;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        System.out.println(maximumWealth(new int[][]{new int[]{1,2,3},new int[]{3,2,1}}));
    }

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int num = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                num += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, num);
        }

        return maxWealth;
    }
}
