package Lecture.Week03;

import Homework.HW1ArrayReview.HW1ArrayReview;

import java.util.Arrays;

public class SelectionSort {

    public static int swapCount;
    public static int compCount;

    //unfortunately this costs the same amount of work regardless of the array (sorted or not)
    public static void swap (double[] a, int i, int j) {
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

    public static void selectionSort (double[] a) {
        int pos = 0;
        while(pos < a.length - 1) {
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

    public static void main(String[] args) {
        double[] a = new double[100_000];
        popA(a);
        //System.out.println(Arrays.toString(a));
        selectionSort(a);
        //System.out.println(Arrays.toString(a));

    }

}
