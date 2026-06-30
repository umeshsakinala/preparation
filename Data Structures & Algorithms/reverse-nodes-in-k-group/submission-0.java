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
    public ListNode kthNode(ListNode node, int k) {
        while(node != null && k-- > 0) {
            node = node.next;
        }
        return node;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode(0, head);
        ListNode prevnode = temp;
        while(true) {
            ListNode node = kthNode(prevnode, k);
            if(node == null) {
                break;
            }
            ListNode nextnode = node.next;
            ListNode prev = node.next;
            ListNode curr = prevnode.next;
            while(curr != nextnode) {
                ListNode l = curr.next;
                curr.next = prev;
                prev = curr;
                curr = l;
            }
            ListNode l = prevnode.next;
            prevnode.next = node;
            prevnode = l;
        }
        return temp.next;
    }
}
