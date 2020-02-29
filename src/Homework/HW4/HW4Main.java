/*
Name: Joseph Audras
Professor: Graham
3-2-20
*/

package Homework.HW4;

import Lecture.ArrayFuncs.ExpandableArray;

import java.lang.StringBuilder;

public class HW4Main {

    public static void delete(ExpandableArrayData d, int i) {
        //- deletes the entry in position i of d,
        // moving the numbers above position i down one position.

    }

    public static void addFront(ExpandableArrayData d, double v) {
        //– add a new number, v, to the front of d.

    }

    public static void insert(ExpandableArrayData d, double v, int i) {
        //– add a new number, v, to position i in L,
        // moving the numbers above position i up one position.

    }

    public static String toString(ExpandableArrayData d) {
        //returns a string representation of d
        // (so a string starting with “[“, ending with “]”,
        // and showing the elements of d separated by commas).
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ExpandableArrayData.getLength(d); i++) {
            s.append(ExpandableArrayData.get(d, i));
            if (i != ExpandableArrayData.getLength(d) - 1) {
                s.append(", ");
            }
        }
        return "[" + s + "]";
    }

    public static void main(String[] args) {

        ExpandableArrayData a = new ExpandableArrayData();
        ExpandableArrayData.add(a, 1);
        ExpandableArrayData.add(a, 2);
        ExpandableArrayData.add(a, -2);

        System.out.println(toString(a));


    }

}
