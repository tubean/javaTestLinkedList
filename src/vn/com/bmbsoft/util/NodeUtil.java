package vn.com.bmbsoft.util;

public class NodeUtil {
    private Node<Integer> head, tail;

    // constructor
    public NodeUtil() {
        head = tail = null;
    }

    // check if the list is empty or not
    private boolean isEmpty() {
        return head == null;
    }

    // add a new number to the end of list
    public void addLast(int b) {
        Node p = new Node(b);
        // If the list has no item
        if (isEmpty()) head = tail = p;
        else {
            tail.next = p;
            tail = p;
        }
    }

    // add a new int to the beginning of list
    public void addFirst(int b) {
        Node<Integer> p = new Node(b);
        if (isEmpty()) head = tail = p;
        else {
            p.next = head;
            head = p;
        }
    }

    // output information of all numbers in the list
    public void traverse() {
        if (isEmpty()) {
            System.out.println("No number to show...");
            return;
        }
        System.out.println("My list is: ");
        Node<Integer> p = head;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.next;
        }
    }

    // return number of nodes/elements in the list
    public int size() {
        int cnt = 0;
        if (isEmpty()) return cnt;
        Node p = head;
        while (p != null) {
            cnt++;
            p = p.next;
        }
        return cnt;
    }

    // return a Node at position k, starting position is 0
    private Node<Integer> getNode(int k) {
        if (isEmpty()) return null;
        int i = 0;
        Node<Integer> p = head;
        while (p != null && i < k) {
            p = p.next;
            i++;
        }
        return p;
    }

    // delete a int at the end
    public void deleteTheLastNumber() {
        int n = size();
        // check list empty
        if (n < 1) {
            System.out.println("The list has no number");
            return;
        }
        // check list has only 1
        if (n == 1) {
            // the list will empty
            head = tail = null;
            return;
        }
        // get a number before last number
        Node<Integer> p = getNode(n - 2);
        // remove tail
        p.next = null;
        // set tail is (n-1)th node
        tail = p;
    }

    // delete a Node which has value > k
    public void deleteByValue(int k) {
        int n = size();
        // check list empty
        if (n < 1) {
            System.out.println("The list has no number");
            return;
        }
        // check list has only 1
        if (n == 1) {
            // the list will empty
            if (head.info > k) head = tail = null;
            return;
        }
        // delete if head's value > k
        if (head.info > k) {
            head = head.next;
            deleteByValue(k);
        }
        // find the node had value > k then delete
        if (head != null) {
            Node<Integer> p = head;
            while (p.next != null) {
                if (p.next.info > k) {
                    // remove the valid number
                    p.next = p.next.next;
                } else {
                    //move on
                    p = p.next;
                }
            }
            tail = p;
        }
    }
}
