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
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;
        while(leftHead != null && rightHead != null) {
            if(leftHead.val <= rightHead.val) {
                res.next = leftHead;
                res = leftHead;
                leftHead = leftHead.next;
            } else {
                res.next = rightHead;
                res = rightHead;
                rightHead = rightHead.next;
            }
        }
        if(leftHead != null) {
            res.next = leftHead;
        } else {
            res.next = rightHead;
        }
        return dummyNode.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        return merge(leftHead, rightHead);
    }
}