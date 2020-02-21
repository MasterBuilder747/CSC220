package Lecture.Week04;

public class ExpandableArrayTypes {
    public static long count;

    //  take an array a as an argument, and "expand" it
    //  i.e. make a new array that is one bigger than the od with the old array copied into the new array,
    //  and then return the new array
    public static double[] expandArray(double[] oldArray) {
        //  make a new array one bigger than the old array
        double[] newArray = new double[oldArray.length + 1];
        //  copy the old array into the new array
        for (int i = 0; i < oldArray.length; i++) {
            //  copy one element from the old array into the new array
            count++;
            newArray[i] = oldArray[i];
        }

        return newArray;
    }

    //  take an array oldArray as an argument, and a position where we are inserting and "expand" the array,
    //  making it K bigger, but only if we need to.
    //  we expand by making a new array that is K bigger than the old with the old array copied into
    //  the new array, and then return the new array

    public static double[] expandArrayK(double[] oldArray, int insertPos, int K) {
        //  if the array is full, expand it
        if (oldArray.length == insertPos) {
            //  make a new array K bigger than the old array
            double[] newArray = new double[oldArray.length + K];
            //  copy the old array into the new array
            for (int i = 0; i < oldArray.length; i++) {
                //  copy one element from the old array into the new array
                count++;
                newArray[i] = oldArray[i];
            }

            return newArray;
        } else {
            return oldArray;
        }

    }

    public static double[] expandArrayD(double[] oldArray, int insertPos) {
        //  if the array is full, expand it
        if (oldArray.length == insertPos) {
            //  make a new array K bigger than the old array
            double[] newArray = new double[oldArray.length * 2];
            //  copy the old array into the new array
            for (int i = 0; i < oldArray.length; i++) {
                //  copy one element from the old array into the new array
                count++;
                newArray[i] = oldArray[i];
            }

            return newArray;
        } else {
            return oldArray;
        }
    }
/*
    public static ExpandableArrayData add(ExpandableArrayData pair, double[] a) {

    } else {
        ad.array[ad.insertPos] = value;

        return ad;
    }

    }
    */
}
