package Lecture.Week03;

import java.util.Arrays;

public class SelectionSort {

    public static void swap (double[] a, int i, int j) {
        double x = a[j];
        a[i] = a[j];
        a[i] = x;
    }

    public static int findMinPos(double[] a, int startPos) {
        //find the minimum position in an array
        int minPos = startPos;
        for(int i = startPos + 1; i < a.length; i++) {
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

    public static void main(String[] args) {
        double[] a = {6, 2, 2, 5, 4};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));

    }

}
