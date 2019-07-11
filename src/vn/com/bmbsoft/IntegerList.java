package vn.com.bmbsoft;

import vn.com.bmbsoft.util.NodeUtil;

import java.util.Scanner;

public class IntegerList {

    // constructor
    public IntegerList() {
        numbers = new NodeUtil();
    }

    // a list of number
    private NodeUtil numbers;

    // append a number at the last
    public void addLast(int b) {
        numbers.addLast(b);
    }

    public void addLast() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = Integer.valueOf(in.nextLine());
        numbers.addLast(k);
        System.out.println("A new number has been added to the last position of the list");
        list();
    }

    // output information of book list
    public void list() {
        numbers.traverse();
    }

    //  add a new number to the beginning of list
    public void addFirst() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = Integer.valueOf(in.nextLine());
        numbers.addFirst(k);
        System.out.println("A new book has been added to the first position of the list");
        list();
    }

    private void addFirst(int b) {
        numbers.addFirst(b);
    }

    // delete a number at the last
    public void deleteTheLastNumber() {
        numbers.deleteTheLastNumber();
        list();
    }

    // delete a number which has value > k
    public void deleteNumberOverValue() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the pivot number then we will delete all greater numbers: ");
        int k = Integer.valueOf(in.nextLine());
        numbers.deleteByValue(k);
        list();
    }
}
