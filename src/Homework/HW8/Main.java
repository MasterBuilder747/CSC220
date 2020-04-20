/*
Name: Joseph Audras
Professor: Graham
Date due: 4-17-20
Class: CSC 220-1
*/

package Homework.HW8;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static int addFor(ArrayList<Integer> al) {
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
    }

    public static int addForeach(ArrayList<Integer> al) {
        int sum = 0;
        return sum;
    }

    public static int addIt(ArrayList<Integer> al) {
        int sum = 0;
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println("For loop: " + addFor(al));
    }

}
