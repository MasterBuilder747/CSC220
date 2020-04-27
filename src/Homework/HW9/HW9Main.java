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

    public static BST<Double, Double> ordered (int N) {
        BST<Double, Double> b = new BST<>();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                //key = 1, value = rand
                b.put(i * 1.0, 1.0);
            }
        }
        return b;
    }

    public static double aveDepth(BST<Double, Double> b) {
        //ave depth = sum of the depth of all nodes / total number of nodes
        int total = b.getSize();
        if (total > 0) {
            double sum = b.getTotDepth();
            return sum / (total * 1.0);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Q1
        // Write a static method BST<Double, Integer> random(int N)
        // in class main that returns a random BST of size N.
        int tst = (int)(Math.random() * 10);
        BST<Double, Integer> b1 = random(tst);
        assert b1.getSize() == tst;

        // Q2
        //Write a program that estimates the average depth of a BST<Double, Double>
        //of N nodes as a function of N.
        //For various appropriate choices of N, generate M random BSTs of size N (for some fixed M)
        //and compute the average of their depths.
        BST<Double, Double> bt1 = ordered(0);
        BST<Double, Double> bt2 = ordered(-1);
        BST<Double, Double> bt3 = ordered(4);
        assert aveDepth(bt1) == 0;
        assert aveDepth(bt2) == 0;
        assert aveDepth(bt3) == 1;

        BST<Double, Double> b4 = ordered(4);
        BST<Double, Double> b5 = ordered(7);
        BST<Double, Double> b6 = ordered(10);
        BST<Double, Double> b7 = ordered(12);
        BST<Double, Double> b8 = ordered(15);
    }

}
