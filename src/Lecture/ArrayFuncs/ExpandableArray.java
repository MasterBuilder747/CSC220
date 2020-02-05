package Lecture.ArrayFuncs;

public class ExpandableArray {

    //takes the array and increased the size by one
    public static long count;

    public static double[] expandArray(double[] a) {
        //a = old array
        //b = new array
        double[] b = new double[a.length + 1];

        for(int i = 0; i < a.length; i++) {
            b[i] = a[i]; //most performance heavy process, copying the number
            count++;
        }
        return b;
    }

}
