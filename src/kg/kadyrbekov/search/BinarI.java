package kg.kadyrbekov.search;

public class BinarI {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,23,4,45,21},4));
    }

    public static int search(int[] element, int target) {
        int left = 0;
        int right = element.length - 1;
        while (left <= right){
            int middle = (left+right);
            if (target<element[middle]){
                right = middle -1;
            }
            else if (target>element[middle]){
                left=middle+1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
