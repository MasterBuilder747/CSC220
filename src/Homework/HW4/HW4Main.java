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
        // add the element normally, then swap the last element with the first element
        insert(d, v, 0);
    }

    //this doubles as an addFront and an insert function!
    public static void insert(ExpandableArrayData d, double v, int j) {
        //– add a new number, v, to position i in d,
        // moving the numbers above position i up one position.

        //move all vars in expandable array data over by 1, inserting into variable v at the front
        if (j > -1) {
            // store, then replace (so that no extra memory is used)
            // only two variables will temporarily store the previous 2 vars
            double x = v;
            double y;
            int length = ExpandableArrayData.getLength(d); //this is the old length before expanding

            //[1, 2, 3]
            ExpandableArrayData.add(d, 0); //[1, 2, 3, v]
            for (int i = j; i < length; i += 2) {
                y = ExpandableArrayData.get(d, i); //y = 1
                ExpandableArrayData.replace(d, x, i); //[v, 2, 3, v]
                x = ExpandableArrayData.get(d, i+1); //x = 2
                ExpandableArrayData.replace(d, y, i+1); //[v, 1, 3, v]...
            }
        } else {
            throw new IllegalArgumentException("j cannot be lower than 0");
        }
    }

    public static String toString(ExpandableArrayData d) {
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

    public static void main(String[] args) {
        //test toString()
        ExpandableArrayData a = new ExpandableArrayData();
        assert toString(a).equals("[]");

        //test addFront()
        for (int i = 1; i < 100; i++) {
            ExpandableArrayData.add(a, Math.random());
        }
        addFront(a, 0);
        assert toString(a).contains("[0.0");

        //test insert()
        //it is impossible to get 1.0 from Math.random
        insert(a, 1.0, (int)(Math.random() * 10)); //place in a random position
        assert toString(a).contains("1.0, ");


    }

}
