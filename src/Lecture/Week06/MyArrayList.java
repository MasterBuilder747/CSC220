package Lecture.Week06;

import Lecture.Week04.ExpandableArrayData;

public class MyArrayList {

    //cannot be changed, global to all variables
    private static final int DEFAULT_ARRAY_CAPACITY = 1;

    // each myarraylist object has two attributes: an array and an insertPos
    private double[] array;
    private int insertPos;

    public MyArrayList() {
        this.array = new double[DEFAULT_ARRAY_CAPACITY];
        this.insertPos = 0;
    }

    public MyArrayList(int initialCapacity) {
        this.array = new double[initialCapacity];
        this.insertPos = 0;
    }

    //1) create a blank object of class MyArrayList
    //2) call the appropriate constructor
    //3) result of MyArrayList is a pointer/reference

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

    //***this only works for non-static functions!***

    //add the value to the "end" of a MyArrayList object
    //MyArrayList this is also a parameter that is not shown in this function
    public void add(double value) {
        //this is the MyArrayList that I want to add
        expandIfNecessary();
        this.array[this.insertPos] = value;
        this.insertPos++;
    }
/*
    public static void add(ExpandableArrayData d, double value) {
        expandifnecessary(d);
        d.array[d.insertPos] = value;
        d.insertPos++;
    }
*/
    public double get(int i) {
        return this.array[i];
    }

    public int getLength() {
        return this.insertPos;
    }


}
