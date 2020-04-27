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

    public static BST<Double, Double> randomD(int N) {
        BST<Double, Double> b = new BST<>();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                //key = 1, value = rand
                b.put(Math.random(), 1.0);
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
        BST<Double, Double> bt3 = ordered(1);
        BST<Double, Double> bt4 = ordered(3);
        assert aveDepth(bt1) == 0;
        assert aveDepth(bt2) == 0;
        assert aveDepth(bt3) == 0;
        assert aveDepth(bt4) == 1;

        int M = 10;
        int[] a = {2, 4, 7, 10, 12, 15, 100, 1000, 10000};
        double[][] aves = new double[9][M];

        for (int i = 0; i < M; i++) {
            BST<Double, Double> b3 = randomD(a[0]);
            BST<Double, Double> b4 = randomD(a[1]);
            BST<Double, Double> b5 = randomD(a[2]);
            BST<Double, Double> b6 = randomD(a[3]);
            BST<Double, Double> b7 = randomD(a[4]);
            BST<Double, Double> b8 = randomD(a[5]);
            BST<Double, Double> b9 = randomD(a[6]);
            BST<Double, Double> b10 = randomD(a[7]);
            BST<Double, Double> b11 = randomD(a[8]);

            aves[0][i] = aveDepth(b3);
            aves[1][i] = aveDepth(b4);
            aves[2][i] = aveDepth(b5);
            aves[3][i] = aveDepth(b6);
            aves[4][i] = aveDepth(b7);
            aves[5][i] = aveDepth(b8);
            aves[6][i] = aveDepth(b9);
            aves[7][i] = aveDepth(b10);
            aves[8][i] = aveDepth(b11);
        }

        //print the plot data
        System.out.println("N,average depth");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < M; j++) {
                if (j == 0)
                    System.out.print(a[i] + ",");
                else if (j == M - 1)
                    System.out.print(aves[i][j]);
                else
                    System.out.print(aves[i][j] + ",");
            }
            System.out.println();
        }
    }

}
