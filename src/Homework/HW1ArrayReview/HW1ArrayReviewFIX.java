/*

class: CSC 220
professor: Graham
student: Joseph Audras
date due: 1-27-19

*/


// fix after grading
package Homework.HW1ArrayReview;

public class HW1ArrayReviewFIX {

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

    //this is extremely hard to test, as it not only involves doubles, but also random numbers, so it is accepted to be an exception
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
        //don't create another array
        double sum = 0;
        //store average once so that you don't need to run the average function multiple times
        //only when occurring in a loop
        double ave = average(a);

        for (int i = 0; i < a.length; i++) {
            sum = +(a[i] - ave) * (a[i] - ave);
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

    //if a[] = 0 and it is the empty array, then this returns negative infinity
    public static double[] sort(double[] a) {
        double mx1 = a[0]; //if the array is empty, this crashes the code
        double mx2 = Double.NEGATIVE_INFINITY; //if the array is empty, it returns negative infinity
        double min = Double.POSITIVE_INFINITY; //if the array is empty, it returns negative infinity

        for (int i = 0; i < a.length; i++) {
            //this does not work with negative numbers because of what you set i to
            if (a[i] > min) {
                min = a[i];
            }
        }
        return a;
    }

    public static void test(boolean condition, String message) {
        if (condition) {
            System.out.println(message);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
/*
        //use a test function at least TWICE for each function in order to properly test your function
        double[] a = {2, 2, 2, 2};
        double sum1 = sum(a); //use this so that it can be reusable

        test(sum1 == 8, "wrong answer for the sum function1");

        double[] b = {-1, 1, -1, 1};
        double sum2 = sum(b); //use this so that it can be reusable
        test(sum(b) == 0, "wrong answer for the sum function2");

        test(sum(new double[0]) == 0, "wrong answer for sum function3");

        //doubles are not exact, so just use integers
        double[] x = fill(10, 2);
        test(x.length == 10, "fill failed");
        test(x[0] == 2, "fill");
        test(x[x.length - 1] == 2, "fill");
        //test(sum(x) == 24, "fill");
        test(sum(x) >= 23.9 && sum(x) <= 24.1, "fill");

        assert sum(a) == 8: "sum"; //by default, assertions are turned off in java

        //***use assert instead of checking with a test method***
        //VM option parameters: -ea

        test(average(a) == 9, "average");

        test(average(x) == 2, "ave");
*/
        double[] d = {1, 2, 3};
        test(max(d) == -1, "max wrong");

        double[] e = {1, };
        //test(min(e) == , "min wrong");

    }

}
