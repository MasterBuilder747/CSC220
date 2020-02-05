package Homework.HW2;

public class HW2 {
    /*


        double[] merge(double[] a, double[] b) – returns a new array, x, of size a.length + b.length,
        with a and b copied into x – so x[0] through x[a.length-1] is a copy of a, and x[a.length]
        through x[a.length + b.length - 1] is a copy of b.
        e.g. if a = [1, 3, 5] and b = [2, 4] then concat(a, b) = [1, 3, 5, 2, 4].

        double[] delete(double[] a, int i) – returns a new array of size a.length–1 which is the same as
        a but with the i-th element deleted.
        e.g. if a = [1, 2, 5, 7, 9] then delete(a, 3) = [1, 2, 5, 9].

        double[] insert(double[] a, int i, int d) – returns a new array, x, of size a.length+1, with a[0]
        through a[i-1] copied into x[0] through x[i-1], x[i] = d, and a[i] through a[a.length-1] copied
        into x[i+1] through x[x.length-1]
        e.g. if a = [1, 2, 5, 7, 9] then insert(a, 3, 22.2) = [1, 2, 5, 22.2, 7, 9]

         */

    //int find(double[] a, double d) – returns the position of d in a, or -1 if d is not in a.
    //e.g. if a = [1, 3, 5] then find(a, 3) is 1, and find(a, 9) = -1.
    public static int find(double[] a, double d) {
        int output = -1;

        for(int i = 0; i < a.length; i++) {
            if (a[i] == d) {
                output = i;
            }
        }
        return output;
    }

    //boolean equal(double[] a, double[] b) – returns true if and only if the array a is equal to the
    //array b – i.e. a[0] = b[0], a[1] = b[1], etc.



    public static void main(String[] args) {

        double[] a = {1, 4, 6, 8, 10, 1.4, 1.7};
        assert (find(a, 4) == 1) : "find";


    }

}
