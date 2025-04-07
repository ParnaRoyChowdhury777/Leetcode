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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head, temp2 = head.next;
        while(temp2 != null) {
            if(temp2.val == temp.val) {
                temp.next = temp2.next;
                temp2 = temp2.next;
            } else {
                temp2 = temp2.next;
                temp = temp.next;
            }

        }        
            


return head;
    }
}