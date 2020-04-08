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

        //delete
        MyLinkedList d = new MyLinkedList();

        d.addBack(1);
        d.delete();
        assert d.size == 0;
        assert d.last == null;

        d.addBack(1);
        d.addBack(2);
        d.delete(1);
        assert d.get(0) == 1;
        assert d.last.value == 1;

        //1, 2, 3
        d.addBack(2);
        d.addBack(3);
        d.delete(1);
        assert d.get(0) == 1;
        assert d.get(1) == 3;
        assert d.last.value == 3;

        //insert
        MyLinkedList i = new MyLinkedList();
        //addFront
        i.insert(1, 0);
        assert i.head.value == 1;
        //addBack
        i.insert(2, 1);
        assert i.last.value == 2;
        //addMiddle
        i.insert(1.5, 1);
        assert i.get(1) == 1.5;
    }

}
