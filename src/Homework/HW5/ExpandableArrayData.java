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
    private void expandIfNecessary() {

        //  if the array is full, expand it
        if (this.array.length == this.insertPos) {
            //  make a new array K bigger than the old array
            double[] newArray = new double[this.array.length * 2];
            //  copy the old array into the new array
            for (int i = 0; i < this.array.length; i++) {
                //  copy one element from the old array into the new array
                newArray[i] = this.array[i];
            }

            //  set d's array to be the new array
            this.array = newArray;
        }
    }

    //  delete the element in position pos
    public void delete(int pos) {
        for (int i = pos + 1; i < this.insertPos; i++) {
            this.array[i - 1] = this.array[i];
        }
        this.insertPos--;
    }

    public void insert(int pos, double value) {
        this.expandIfNecessary();
        for (int i = this.insertPos - 1; i >= pos; i--) {
            this.array[i + 1] = this.array[i];
        }

        this.array[pos] = value;
        this.insertPos++;
    }

    public void addFront(double value) {
        this.insert( 0, value);
    }

    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; i < this.insertPos - 1; i++) {
            b.append(this.array[i]);
            b.append(", ");
        }
        //  the array has got something in it
        if (this.insertPos != 0) {
            b.append(this.array[this.insertPos - 1]);
        }
        b.append("]");
        return b.toString();
    }

    //  add the value to the "end" of the expandable array ad
    public void add(double value) {
        this.expandIfNecessary();
        this.array[this.insertPos] = value;
        this.insertPos++;
    }

    public double get(int i) {
        return this.array[i];
    }

    public int getLength() {
        return this.insertPos;
    }

}
