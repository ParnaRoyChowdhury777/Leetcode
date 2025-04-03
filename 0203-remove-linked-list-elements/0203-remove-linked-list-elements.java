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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }

        ListNode temp = head;
        ListNode prevNode = null;

        while(temp != null) {
            if(temp.val == val) {
                if(temp == head) {
                    head = head.next;
                } else {
                    if(prevNode != null)
                        prevNode.next = temp.next;

                }

                temp = temp.next;

            } else {
                prevNode = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}