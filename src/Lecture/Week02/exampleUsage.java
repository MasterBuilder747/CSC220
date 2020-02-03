package Lecture.Week02;

import Lecture.ArrayFuncs.ExpandableArray;

import java.io.IOException;

//special import for custom function


public class exampleUsage {

    //example usage
    public static void main(String[] args) throws IOException {

        //double[] num1 = readFile("/Users/Joseph/Desktop/numbers.txt");
        //System.out.println(Arrays.toString(num1));

        //test the time that it takes to process larger loops in this function

        //this is quadratic growth
        for(int size = 10; size <= 1000000; size *= 10) {
            long start = System.currentTimeMillis();
            double[] nums = new double[0];
            for (int i = 0; i < size; i++) {
                nums = ExpandableArray.expandArray(nums);
                nums[i] = i;
            }
            long end = System.currentTimeMillis();
            long timeTaken = end - start;
            System.out.println(size + " : " + timeTaken);
        }

    }
}
