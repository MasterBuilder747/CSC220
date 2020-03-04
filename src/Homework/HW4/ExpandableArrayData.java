/*
Name: Joseph Audras
Professor: Graham
Date due: 3-2-20
Class: CSC 220-1
*/

package Homework.HW4;

import java.lang.StringBuilder;

public class ExpandableArrayData {

    //  each expandable array data object has two attributes, an arry and an insertPos
    private double[] array;
    private int insertPos;

    public ExpandableArrayData() {
        this.array = new double[1];
        this.insertPos = 0;
    }

    public ExpandableArrayData(int initialCapacity) {
        this.array = new double[initialCapacity];
        this.insertPos = 0;
    }

    //  add the value to the "end" of the expandable array given the pair (array, insertPos)
    private static void expandIfNecessary(ExpandableArrayData d) {

        //  if the array is full, expand it
        if (d.array.length == d.insertPos) {
            //  make a new array K bigger than the old array
            double[] newArray = new double[d.array.length * 2];
            //  copy the old array into the new array
            for (int i = 0; i < d.array.length; i++) {
                //  copy one element from the old array into the new array
                newArray[i] = d.array[i];
            }

            //  set d's array to be the new array
            d.array = newArray;
        }
    }

    //  add the value to the "end" of the expandable array ad
    public static void add(ExpandableArrayData d, double value) {
        expandIfNecessary(d);
        d.array[d.insertPos] = value;
        d.insertPos++;
    }

    public static double get(ExpandableArrayData d, int i) {
        return d.array[i];
    }

    public static int getLength(ExpandableArrayData d) {
        return d.insertPos;
    }

    //added methods
    public static void replace(ExpandableArrayData d, double v, int a) {
        d.array[a] = v;
    }

    public String toString(ExpandableArrayData d) {
        //returns a string representation of d
        // (so a string starting with “[“, ending with “]”,
        // and showing the elements of d separated by commas).
        StringBuilder s = new StringBuilder();
        int length = ExpandableArrayData.getLength(d);
        for (int i = 0; i < length; i++) {
            s.append(ExpandableArrayData.get(d, i));
            if (i != length - 1) {
                s.append(", ");
            }
        }
        return "[" + s + "]";
    }

    //this doubles as an addFront and an insert function!
    public void insert(ExpandableArrayData d, double v, int j) {
        //– add a new number, v, to position i in d,
        // moving the numbers above position i up one position.
        int oldLength = ExpandableArrayData.getLength(d); //this is the old length before expanding

        //move all vars in expandable array data over by 1, inserting into variable v at the front
        if (j > -1 && j < oldLength + 1) {
            // store, then replace (so that no extra memory is used)
            // only one variable will temporarily store the previous var to replace
            double x;

            //[1, 2, 3, 4, 5]
            d.insertPos++; //[1, 2, 3, 4, 5, 0]
            int length = ExpandableArrayData.getLength(d);
            for (int i = length - 1; i > j; i--) {
                x = ExpandableArrayData.get(d, i - 1); //x = 5
                ExpandableArrayData.replace(d, x, i);
            }
            ExpandableArrayData.replace(d, v, j);
        } else {
            throw new IllegalArgumentException("j cannot be lower than 0 or greater than the array's new length + 1");
        }
    }

    public void addFront(ExpandableArrayData d, double v) {
        //– add a new number, v, to the front of d.
        insert(d, v, 0);
    }

    public void delete(ExpandableArrayData d, int j) {
        //- deletes the entry in position i of d,
        // moving the numbers above position i down one position.

        int length = ExpandableArrayData.getLength(d);

        if (j > -1 && j < length) {

            //replace after that is deleted
            for (int i = j; i < length; i++) {
                ExpandableArrayData.replace(d, ExpandableArrayData.get(d, i + 1), i);
            }
            // replace the last element with 0 if that is defined
            ExpandableArrayData.replace(d, 0, ExpandableArrayData.getLength(d) - 1);
            d.insertPos--;
        } else {
            throw new IllegalArgumentException("j cannot be lower than 0 or greater than the array's new length + 1");
        }
    }
}
