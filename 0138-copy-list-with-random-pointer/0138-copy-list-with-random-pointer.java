/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public void insertCopyInBetween(Node head) {
        Node temp = head;
        while(temp != null) {
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
    }

    public void copyRandomPointers(Node head) {
        Node temp = head;
        while(temp != null) {
            Node copyNode = temp.next;
            if(temp.random != null) {
                copyNode.random = temp.random.next;
            } else {
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }

    public Node copyNextPointers(Node head) {
        Node dummyNode = new Node(-1);
        Node temp = head, res = dummyNode;
        while(temp != null) {
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp =temp.next;
        }
        return dummyNode.next;
    }

    public Node copyRandomList(Node head) {
        insertCopyInBetween(head);
        copyRandomPointers(head);
        return copyNextPointers(head);
    }
}