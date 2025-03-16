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

    public ListNode findNthNode(ListNode temp, int k) {
        int cnt = 1;
        while(temp.next != null) {
            if(cnt == k) {
                return temp;
            }
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }
        int l = 1;
        ListNode tail = head;
        while(tail.next != null) {
            l++;
            tail = tail.next;
        }
        if(k % l == 0) {
            return head;
        }
        k = k % l;
        tail.next = head;
        ListNode newLastNode = findNthNode(head, l - k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
}