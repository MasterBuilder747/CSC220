package Lecture.Week04;

public class ExpandableArrayData {
    //each expandable array object has two attributes:
    //an array and an insert position

    //cannot be changed, global to all variables
    private static final int DEFAULT_ARRAY_CAPACITY = 1;

    //  each expandable array data object has two attributes, an array and an insertPos
    // one for each object
    // add static for one for all objects
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
