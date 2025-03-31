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

    public ListNode findKthNode(ListNode temp, int k) {

        while(temp != null && k > 1) {

            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prevNode = null;
        while(temp != null) {
            ListNode kthNode = findKthNode(temp, k);
            if(kthNode == null) {
                if(prevNode != null) {
                    prevNode.next = temp;
                    break;
                } 
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            ListNode reversedList = reverse(temp);
            if(temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}