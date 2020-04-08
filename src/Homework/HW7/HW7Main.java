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

        l.addFront(4);
        l.addBack(5);

        assert l.size != 0;
        assert l.get(0) == 4.0;
        assert l.get(1) == 5.0;

        assert l.toString().contains("]");

        l.addFront(8);
        l.set(1, 2);
        assert l.get(2) == 1.0;
        l.set(6, 2);


        MyLinkedList e = new MyLinkedList();
        e.addFront(0);
        e.addFront(1);
        System.out.println(e.toString());
        e.delete(1);
        System.out.println(e.toString());
        System.out.println(e.last.value);
        //System.out.println(l.toString());


    }

}
