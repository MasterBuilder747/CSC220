package Lecture.Week08;

import Homework.HW5.MyArrayList;

public class GetArray {

    public static double[] getArray(MyArrayList l) {
        double[] result = new double[l.getLength()];
        for (int i = 0; i < l.getLength(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
