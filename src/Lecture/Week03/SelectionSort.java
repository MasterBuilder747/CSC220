package Lecture.Week03;

import Homework.HW1ArrayReview.HW1ArrayReview;

import java.util.Arrays;

public class SelectionSort {

    public static int swapCount;
    public static int compCount;

    //unfortunately this costs the same amount of work regardless of the array (sorted or not)

    //so by swapping multiple times, this can be easier
    public static void swap(double[] a, int i, int j) {
        //20 bytes
        swapCount++;
        double x = a[j];
        a[j] = a[i];
        a[i] = x;
    }

    public static int findMinPos(double[] a, int startPos) {
        //find the minimum position in an array
        int minPos = startPos;
        for(int i = startPos + 1; i < a.length; i++) {
            compCount++;
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    public static void selectionSort(double[] a) {
        int pos = 0;
        while(pos < a.length - 1) {
            //this line uses 8 bytes
            int minPos = findMinPos(a, pos); //find pos of the smallest element in starting at pos swap a(minPos) and a(pos)*/
            swap(a, minPos, pos);
            pos++;
        }
    }

    public static double[] popA(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }
        return a;
    }

    public static void moveLeft(double[]a, int pos) {
        int j = pos;
        while (j != 0 && a[j] < a[j - 1]) {
            swap(a, j, j - 1);
            j--;
        }
    }

    public static void insertionSort(double[] a) {
        for(int pos = 1; pos < a.length; pos++) {
            moveLeft(a, pos);
        }
    }

    public static void main(String[] args) {
        double[] a = new double[100_000_000];
        popA(a);
        //System.out.println(Arrays.toString(a));


        //selectionSort(a);
        //insertionSort(a);

        //merge sort:
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));

    }

}
