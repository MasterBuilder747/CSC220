package Lecture.Week04;

public class ExpandableArrayN {

    public static long count;

    // take an array as an arg where we are inserting and at a position
    // only make k bigger if needed
    // expand by taking a new array that is k bigger than the old array
    // with the old array copied into the new array and then
    // we return the old array
    public static double[] expandArrayN(double[] a, int n, int k) {
        //if the array is full, expand it
        //if (a.length == n) {

            double[] b = new double[a.length + k];

            for (int i = 0; i < a.length; i++) {
                count++;
                b[i] = a[i];
            }
            return b;

        //}
    }

    public static double[] expandArrayD () {
        double[] a = new double[3];

        //addd from nottes
        return a;
    }

}
