package Homework.HW1ArrayReview;

import java.util.Arrays;

public class HW1PartialSolution {

    public static double sum(double[] a) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result + a[i];
        }
        return result;
    }

    public static double[] fill(int n, double v) {
        double[] result = new double[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = v;
        }
        return result;
    }

    public static double[] random(int n) {
        double[] result = new double[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.random();
        }
        return result;
    }

    public static double average(double[] a) {
        return sum(a) / a.length;
    }

    //  if a = [] then this method returns -infinity
    public static double max(double[] a) {
        //double mx = a[0];
        double mx = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mx) {
                mx = a[i];
            }
        }
        return mx;
    }

    //  if a = [] then this method returns +infinity
    public static double min(double[] a) {
        //double mx = a[0];
        double mn = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < mn) {
                mn = a[i];
            }
        }
        return mn;
    }

    public static double variance(double[] a) {
        double sumSqDiff = 0;

        double avg = average(a);
        for (int i = 0; i < a.length; i++) {
            double diff = a[i] - avg;
            sumSqDiff = sumSqDiff + Math.pow(diff, 2);
        }

        return sumSqDiff / a.length;
    }

//    public static double variance1(double[] a) {
//        double avg = average(a);
//        double[] sqDiff = new double[a.length];
//        for (int i = 0; i < a.length; i++) {
//            double diff = a[i] - avg;
//            sqDiff[i] = Math.pow(diff, 2);
//        }
//
//        return average(sqDiff);
//    }

    public static double stdDev(double[] a) {
        return Math.sqrt(variance(a));
    }

    public static void print(double[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void test(boolean condition, String message) {
        if (!condition) {
            System.out.println(message);
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        double[] a = {2, 2, 2, 2};
//        test(sum(a) == 8, "OOPS GOT THE WRONG ANSWER FOR SUM() ");
        assert sum(a) == 8;

        double[] b = {-1, 1, -1, 1};
        assert sum(b) == 0;

        assert sum(new double[0]) == 0;

        double[] x = fill(10, 2);
        assert x.length == 10;
        assert x[0] == 2;
        assert x[x.length - 1] == 2;
        assert sum(x) == 20;

        assert average(x) == 2;
        assert average(b) == 0;

        double[] d = {-1, -4, -5};
        assert max(d) == -1 : max(d);

        double[] e = {1, 1, 1, 1};
        assert max(e) == min(e);

        assert variance(e) == 0 : "stop";
        double[] f = {1, 3, 5, 7};
        double[] g = {-1, -3, -5, -7, -9};
        assert variance(f) == variance(g) : "stop";

        assert a == b : "stop";
    }
}
