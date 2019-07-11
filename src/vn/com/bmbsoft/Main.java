package vn.com.bmbsoft;

import java.util.Scanner;

public class Main {
    static int getMenuItem() {
        System.out.print("\n1.Display list of number"
                + "\n2.Input number and add to the end"
                + "\n3.Input number and add to beginning"
                + "\n4.Delete number at the end"
                + "\n5.Delete all the number greater than: \n0.Exit\nYour choice: ");
        return Integer.valueOf(new Scanner(System.in).nextLine());
    }
    //add some books to the list
    static void addNumbers(IntegerList numbers) {
        numbers.addLast(6);
        numbers.addLast(9);
        numbers.addLast(15);
        numbers.addLast(35);
        numbers.addLast(26);
        numbers.addLast(38);
    }

    public static void main(String[] args) {
        int c = -1;
        IntegerList numbers = new IntegerList();
        //add some numbers to list
        addNumbers(numbers);
        while(c != 0) {
            c = getMenuItem();
            switch(c) {
                case 1: numbers.list();break;
                case 2: numbers.addLast();break;
                case 3: numbers.addFirst();break;
                case 4: numbers.deleteTheLastNumber();break;
                case 5: numbers.deleteNumberOverValue();break;
                case 0: return;
                default: System.out.println("Invalid choice...");
            }
        }
    }
}
