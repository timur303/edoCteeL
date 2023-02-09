package kg.kadyrbekov.search;

public class BinaryI {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 23, 4, 45, 21,12}, 12));
    }
//
    public static int search(int[] element, int target) {
        int left = 0;
        int right = element.length - 1;
        while (left <= right) {
            int middle = (left + right);
            if (target < element[middle]) {
                right = middle - 1;
            } else if (target > element[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
//
//    public static int binarySearch(int[] a, int key) {
//        int low = 0;
//        int high = a.length -1;
//        while (low <= high) {
//            int middle = low + (high - low) / 2;
//            if (key < a[middle]) {
//                high = middle - 1;
//            } else if (key > a[middle]) {
//                low = middle + 1;
//            } else {
//                return middle;
//            }
//        }
//        return -1;
//    }
}
