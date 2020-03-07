/*
Name: Joseph Audras
Professor: Graham
Date due: 3-6-20
Class: CSC 220-1
*/

package Homework.HW5;

public class ExpandableArrayData {

    //  a variable declaration -- there is only one of these
    private static int DEFAULT_ARRAY_CAPACITY = 1;

    //  each expandable array data object has two attributes, an array and an insertPos
    private double[] array;
    private int insertPos;

    public ExpandableArrayData() {
        this.array = new double[DEFAULT_ARRAY_CAPACITY];
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

    //  delete the element in position pos
    public static void delete(ExpandableArrayData d, int pos) {
        for (int i = pos + 1; i < d.insertPos; i++) {
            d.array[i - 1] = d.array[i];
        }
        d.insertPos--;
    }

    public static void insert(ExpandableArrayData d, int pos, double value) {
        expandIfNecessary(d);
        for (int i = d.insertPos - 1; i >= pos; i--) {
            d.array[i + 1] = d.array[i];
        }

        d.array[pos] = value;
        d.insertPos++;
    }

    public static void addFront(ExpandableArrayData d, double value) {
        insert(d, 0, value);
    }

    public static String toString(ExpandableArrayData d) {
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; i < d.insertPos - 1; i++) {
            b.append(d.array[i]);
            b.append(", ");
        }
        //  the array has got something in it
        if (d.insertPos != 0) {
            b.append(d.array[d.insertPos - 1]);
        }
        b.append("]");
        return b.toString();
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

}
