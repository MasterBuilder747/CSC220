package Lecture.Week04;

public class SortingMain {


    public static int cmpCount;
    public static int swapCount;

    public static void swap(double[] a, int i, int j) {
        swapCount++;
        double x = a[j];
        a[j] = a[i];
        a[i] = x;
    }

    public static int findMinPos(double[] a, int startPos) {
        int minPos = startPos;
        for (int i = startPos + 1; i < a.length; i++) {
            cmpCount++;
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }

        return minPos;
    }

    public static void selectionSort(double[] a) {
        int pos = 0;
        while (pos < a.length - 1) {
            int minPos = findMinPos(a, pos);
            swap(a, minPos, pos);
            pos++;
        }
    }

    public static void moveLeft(double[] a, int pos) {
        int j = pos;
        while (j != 0 && a[j] < a[j - 1]) {
            swap(a, j, j - 1);
            j--;
        }
    }

    public static void insertionSort(double[] a) {
        for (int pos = 1; pos < a.length; pos++) {
            //moveLeft(a, pos);
            int j = pos;
            while (j != 0 && a[j] < a[j - 1]) {
                swap(a, j, j - 1);
                j--;
            }
        }
    }
}

