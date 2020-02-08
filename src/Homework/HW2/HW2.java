package Homework.HW2;

public class HW2 {

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
    public static boolean equal(double[] a, double[] b) {
        if (a.length != b.length) {
            return false;
        }else{
            for(int i = 0; i < a.length; i++) {
                if(a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //double[] merge(double[] a, double[] b) – returns a new array, x, of size a.length + b.length,
    //with a and b copied into x – so x[0] through x[a.length-1] is a copy of a, and x[a.length]
    //through x[a.length + b.length - 1] is a copy of b.
    public static double[] merge(double[] a, double[] b) {
        double[] x = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        for (int j = a.length; j < (a.length + b.length); j++) {
            x[j] = b[j-a.length];
        }
        return x;
    }

    //double[] delete(double[] a, int i) – returns a new array of size a.length–1 which is the same as
    //a but with the i-th element deleted.
    public static double[] delete(double[] a, int i) {
        if (i < 0 || i > a.length) {
            throw new ArrayIndexOutOfBoundsException("i is out of range of array");
        }
        double[] x = new double[a.length - 1];

        for (int j = 0; j < i; j++) {
            x[j] = a[j];
        }
        for (int k = i; k < x.length; k++) {
            x[k] = a[k+1];
        }
        return x;
    }

    //double[] insert(double[] a, int i, int d) – returns a new array, x, of size a.length+1, with a[0]
    //through a[i-1] copied into x[0] through x[i-1], x[i] = d, and a[i] through a[a.length-1] copied
    //into x[i+1] through x[x.length-1]
    public static double[] insert(double[] a, int i, double d) {
        if (i < 0 || i > a.length) {
            throw new ArrayIndexOutOfBoundsException("i is out of range of array");
        }
        double[] x = new double[a.length + 1];
        for (int j = 0; j < i; j++) {
            x[j] = a[j];
        }
        x[i] = d;
        for (int k = i; k < a.length; k++) {
            x[k+1] = a[k];
        }
        return x;
    }

    public static void print (double[] a) {
        System.out.print("[");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        double[] a = {1, 4, 6, 8, 10, 1.4, 1.7};
        double[] b = {1, 4, 6, 8, 10, 1.4, 1.7};
        double[] c = {0, 1, 3, 1, 7};
        double[] d = {0.1, 1, 4, 1, 7, 5, 1};
        double[] e = {0};
        double[] f = {};

        double[] t1 = {1, 4, 6, 8, 10, 1.4, 1.7, 0, 1, 3, 1, 7};
        double[] t2 = {1, 4, 6, 8, 10, 1.4, 1.7, 0, 1, 3, 1, 8};
        double[] t3 = {0, 1, 3, 7};
        double[] t4 = {0, 1, 3, 1, 1, 7};
        double[] t5 = {0, 1, 3, 1, 7, 1};

        assert find(a, 4) == 1 : "find1"; //true
        //assert find(c, 4) == 1 : "find2"; //false
        assert equal(a, b) : "equal1"; //true
        //assert (equal(a, c)) : "equal2"; //false
        assert equal(merge(a, c), t1) : "merge1"; //true
        //assert equal(merge(a, c), t2) : "merge2"; //false
        assert equal(delete(c, 3), t3) : "delete1"; //true
        //assert equal(delete(c, 4), t3) : "delete2"; //false
        //assert equal(delete(c, 100), t3) : "delete3"; //error
        assert equal(insert(c, 3, 1), t4) : "insert1"; //true
        assert equal(insert(c, 5, 1), t5) : "insert2"; //true
        //assert equal(insert(c, 9, 1), t4) : "insert3"; //error

    }
}
