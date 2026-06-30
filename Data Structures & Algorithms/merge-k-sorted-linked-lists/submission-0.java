/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode node = temp;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            }
            else {
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }
        }
        if(l1 != null) {
            node.next = l1;
        }
        else {
            node.next = l2;
        }
        return temp.next;
    }
    public ListNode divide(int low, int high, ListNode[] lists) {
        if(low > high) {
            return null;
        }
        if(low == high) {
            return lists[low];
        }
        int mid = (low + high)/2;
        ListNode left = divide(low, mid, lists);
        ListNode right = divide(mid+1, high, lists);
        return merge(left, right);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return divide(0, lists.length-1, lists);
    }
}
