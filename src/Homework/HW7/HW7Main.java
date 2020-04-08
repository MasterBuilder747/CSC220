/*
Name: Joseph Audras
Professor: Graham
Date due: 4-8-20
Class: CSC 220-1
*/

package Homework.HW7;

public class HW7Main {

    public static void main(String[] args) {

        MyLinkedList l = new MyLinkedList();
        l.addBack(5);
        l.addFront(4);

        assert l.size != 0;
        assert l.get(0) == 4.0;
        assert l.get(1) == 5.0;

        assert l.toString().contains("]");

        l.set(1, 0);
        assert l.get(0) == 1.0;



    }

}
