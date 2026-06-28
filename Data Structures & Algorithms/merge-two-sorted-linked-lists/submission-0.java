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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode list = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2 != null) {
            if(temp1.val == temp2.val) {
                list.next = new ListNode(temp1.val);
                list = list.next;
                list.next = new ListNode(temp2.val);
                list = list.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.val > temp2.val) {
                list.next = new ListNode(temp2.val);
                list = list.next;
                temp2 = temp2.next;
            }
            else {
                list.next = new ListNode(temp1.val);
                list = list.next;
                temp1 = temp1.next;
            }
        }
        while(temp1 != null) {
            list.next = new ListNode(temp1.val);
            list = list.next;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            list.next = new ListNode(temp2.val);
            list = list.next;
            temp2 = temp2.next;
        }
        return dummy.next;
    }
}