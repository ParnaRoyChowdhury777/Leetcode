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

    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        } 
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;   
    }

    public int getDecimalValue(ListNode head) {
        ListNode newHead = reverse(head);
        int num = 0, k = 0;
        ListNode temp = newHead;
        while(temp != null) {
            num += temp.val * Math.pow(2, k);
            k++;
            temp = temp.next;
        }
        return num;
    }
}