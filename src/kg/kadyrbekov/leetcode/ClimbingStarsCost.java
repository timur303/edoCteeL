package kg.kadyrbekov.leetcode;

public class ClimbingStarsCost {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int prev=cost[0],prev2=0,current;
        for(int i=1;i<cost.length;i++){
            current=Math.min(prev2+cost[i],prev+cost[i]);
            prev2=prev;
            prev=current;
        }

        return Math.min(prev,prev2);



    }
}
