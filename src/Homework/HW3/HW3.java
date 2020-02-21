package Homework.HW3;

public class HW3 {

    public static long swapCount;
    public static long compCount;

    //selection sort
    public static void selectionSort(double[] a) {
        int pos = 0;
        while(pos < a.length - 1) {
            //this line uses 8 bytes
            int minPos = findMinPos(a, pos); //find pos of the smallest element in starting at pos swap a(minPos) and a(pos)*/
            swap(a, minPos, pos);
            pos++;
        }
    }

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

    //insertion sort
    public static void insertionSort(double[] a) {
        for(int pos = 1; pos < a.length; pos++) {
            moveLeft(a, pos);
        }
    }

    //move the item over
    public static void moveLeft(double[] a, int pos) {
        int j = pos;
        while (j != 0 && a[j] < a[j - 1]) {
            swap(a, j, j - 1);
            j--;
        }
    }

    //create random array
    public static double[] createArray(int n) {
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }
        return a;
    }

    //for testing only
    public static boolean ifSorted(double[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("N, Average selection operations, Average insertion operations");
        int i = 0;
        int n = 100 * (int)Math.pow(2,i);
        while(n < 200_000) {

            //n value
            System.out.print(n + ", ");

            //selection
            long sum = 0;
            for (int j = 0; j < 100; j++) {
                selectionSort(createArray(n));
                sum =+ (swapCount + compCount);
            }
            double ave = sum / 100.0;
            System.out.print(ave + ", ");

            swapCount = 0;
            compCount = 0;

            //insertion
            sum = 0;
            for (int j = 0; j < 100; j++) {
                insertionSort(createArray(n));
                sum =+ (swapCount + compCount);
            }
            ave = sum / 100.0;
            System.out.println(ave);

            i++;
            n = 100 * (int)Math.pow(2,i);
        }
    }
}
