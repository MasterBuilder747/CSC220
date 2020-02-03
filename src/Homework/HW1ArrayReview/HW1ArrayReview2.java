/*

class: CSC 220
professor: Graham
student: Joseph Audras
date due: 1-27-19

*/

package Homework.HW1ArrayReview;

public class HW1ArrayReview2 {

    public static double sum(double[] a) {
        //returns the sum of the entries in the array a.
        double sum = 0;
        for (double v : a) {
            sum += v;
        }
        return sum;
    }

    public static double[] fill(int n, double v) {
        //returns an array of n doubles, all of whose values are v.
        double[] output = new double[n];
        for (int i = 0; i < n; i++) {
            output[i] = v;
        }
        return output;
    }

    public static double[] random(int n) {
        //return an array of n random doubles.
        //Note: use Math.random to generate a random double value.
        double[] output = new double[n];
        for (int i = 0; i < n; i++) {
            output[i] = Math.random();
        }
        return output;
    }

    public static double min(double[] a) {
        //returns the minimum element of the array a.
        return sort(a)[0];
    }

    public static double max(double[] a) {
        //returns the maximum element of the array a.
        return sort(a)[a.length - 1];
    }

    public static double average(double[] a) {
        //returns the average (or mean) of the elements of the array a.
        return sum(a) / a.length;
    }

    public static double variance(double[] a) {
        //returns the variance of the elements of the array a.
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = +(a[i] - average(a)) * (a[i] - average(a));
        }
        return sum / a.length;
    }

    public static double stdDev(double[] a) {
        //returns the standard deviation of the elements of the array a.
        return Math.sqrt(variance(a));
    }

    public static void print(double[] a) {
        //prints an array, a, on a single line with commas between elements.
        System.out.print("[");
        for(int i = 0; i < a.length; i++) {
            if(i == (a.length-1)) {
                System.out.print(a[i]);
            }else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public static double[] sort(double[] a) {
        int length = a.length - 1;
        while (length >= 1) {
            for (int i = 0; i < length; i++) {
                if (a[i] > a[i + 1]) {
                    double swap = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = swap;
                }
            }
            length--;
        }
        return a;
    }

    public static void main(String[] args) {

        double[] test = {1, 2, 3, 4, 5, 216, 1, 6, 7 ,2, 7, 1, 1, 8, 2};
        System.out.print("The array: ");
        print(test);
        System.out.println("sum: " + sum(test));
        System.out.print("fill: ");
        print(fill(5, 1));
        System.out.println("min: " + min(test));
        System.out.println("max: " + max(test));
        System.out.println("average: " + average(test));
        System.out.println("variance: " + variance(test));
        System.out.println("standard deviation: " + stdDev(test));
    }

}
