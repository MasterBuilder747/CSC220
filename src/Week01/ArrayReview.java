package Week01;

import java.util.Arrays;

public class ArrayReview {

    public static void main(String[] args) {

        //210 review

        //double array
        //assigns default values
        double[] a1 = new double[2];
        double[] a2 = new double[2];

        //size is length - 1
        //values are in the braces
        double[] make = {1, 2, 3, 4, 5};

        //not declared
        double[] a3;

        //multi dim array
        int[][] b1;

        //test
        a2[0] = 1;

        double[] x;
        x = new double[5];
        int[] y = new int[5];

        double[] make2 = new double[4];

        double count = 0;
        for(int i = 0; i < make2.length; i++) {
            make2[i] = count;
            count++;
            System.out.println(make2[i]);
        }

        /*
        //results in 0.0 [default value]
        //prints assigned value
        System.out.println(a2[0]);
        //prints default
        System.out.println(x[0]);
        //garble...
        //[: array
        //D: type of data
        //13221655: data
        System.out.println(x);
        //data address is the same regardless of the variable name
        //data address is in hexadecimal (1-9,a-f) [base 16]
        System.out.println(y);

        //Arrays.toString(Array): outputs all of the numbers in an array
        System.out.println(Arrays.toString(make));



        //for(int i = 0; )

        */
    }

}
