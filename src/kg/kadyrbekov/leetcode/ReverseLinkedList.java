//package kg.kadyrbekov.leetcode;
//
//public class ReverseLinkedList {
//    public static void main(String[] args) {
//
//        System.out.println(reverseList());
//    }
//    public static ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode current = head;
//
//
//        while(current != null) {
//            ListNode next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        return prev;
//    }
//
//
//}
