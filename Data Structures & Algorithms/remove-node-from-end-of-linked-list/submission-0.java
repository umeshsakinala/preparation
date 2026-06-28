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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        if(count == 1 && n == 1) {
            return null;
        }
        if(count == n) {
            return head.next;
        }
        count = count-(n-1);
        temp = head;
        for(int i=0; i<count-2; i++) {
            temp = temp.next;
        }
        System.out.println(temp.val);
        temp.next = temp.next.next;
        return head;
    }
}
