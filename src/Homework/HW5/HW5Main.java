/*
Name: Joseph Audras
Professor: Graham
Date due: 3-6-20
Class: CSC 220-1
*/

package Homework.HW5;

public class HW5Main {

    public static void main(String[] args) {

        System.out.println("test toString(): ");
        System.out.println("print out an initialized empty array: ");
        MyArrayList a = new MyArrayList();
        System.out.println(a.toString());
        assert a.toString().contains("[]");

        System.out.println("print out an array: ");
        a.add(1);
        System.out.println(a.toString());
        assert a.toString().contains("[1.0]");

        System.out.println("print out another array: ");
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a.toString());
        assert a.toString().contains("[1.0, 2.0, 3.0, 4.0, 5.0]");


        System.out.println();
        System.out.println("test addFront(): ");
        System.out.println("add 100 at the front of the array: ");
        System.out.println("assert that array contains \"[100.0\":");
        MyArrayList b = new MyArrayList();
        for (int i = 0; i < 5; i++) {
            b.add(Math.random());
        }
        System.out.println("input: " + b.toString());
        b.addFront(100);
        System.out.println("output: " + b.toString());
        assert b.toString().contains("[100.0");
        assert b.getLength() == 6;


        System.out.println();
        System.out.println("test insert(): ");
        System.out.println("assert that array contains \"1000.0\":");
        MyArrayList c = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(Math.random());
        }
        System.out.println("input: " + c.toString());
        c.insert(1000.0, (int)(Math.random() * 10)); //insert at a random position
        System.out.println("output: " + c.toString());
        assert c.toString().contains("1000.0, ");
        assert c.getLength() == 11;


        System.out.println();
        System.out.println("test delete(): ");
        System.out.println("assert that array does not contain \"1.0\":");
        MyArrayList d = new MyArrayList();
        for (int i = 0; i < 7; i++) {
            d.add(i);
        }
        System.out.println("input: " + d.toString());
        d.delete(1);
        System.out.println("output: " + d.toString());
        assert d.getLength() == 6;
        System.out.println("test an invalid input: ");
        assert !(d.toString().contains("1.0"));
        d.delete(-1);
    }
}
