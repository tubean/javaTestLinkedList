package vn.com.bmbsoft.util;

public class Node<T> {

    public T info;
    public Node<T> next;

    public Node(T info, Node<T> next) {
        this.info = info;
        this.next = next;
    }

    public Node(T info) {
        this(info,null);
    }
}
