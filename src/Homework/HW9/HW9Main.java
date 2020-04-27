/*
Name: Joseph Audras
Professor: Graham
Date due: 4-27-20
Class: CSC 220-1
*/

package Homework.HW9;

public class HW9Main {

    public static BST<Double, Integer> random(int N) {
        BST<Double, Integer> b = new BST<>();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                //key = 1, value = rand
                b.put(Math.random(), 1);
            }
        }
        return b;
    }

    public static void main(String[] args) {
        // Q1
        int tst = (int)(Math.random() * 10);
        BST<Double, Integer> b = random(tst);
        assert b.getSize() == tst;

        // Q2

    }

}
