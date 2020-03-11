package Lecture.Week08;

import Lecture.Week06.MyArrayList;

public class Main08 {

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        for (int i = 0; i < 1_000_000; i++) {
            l.addFront(i); //make a node, change 2 pointers, 3 steps, linear
        }
        System.out.println("linked list");

        MyArrayList k = new MyArrayList();
        for (int i = 0; i < 1_000_000; i++) {
            k.add(i); //sum of i, (i+1), ... (i+n), quadratic
        }
        System.out.println("array list");
    }

}
