class Node {
    String data;
    Node next, prev;
    Node(String data) {
        this.data = data;
    }
}



class BrowserHistory {
    
    Node current;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0) {
            if(current.prev != null) {
                current = current.prev;
            } else {
                break;
            }
            steps--;
        }
        return current.data;
    }
    
    public String forward(int steps) {
        while(steps > 0) {
            if(current.next != null) {
                current = current.next;
            } else {
                break;
            }
            steps--;
        }
        return current.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */