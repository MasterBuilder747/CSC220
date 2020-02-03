package Lecture.ArrayFuncs;

import java.io.*;

public class ReadFileComments {

    //read a collection of numbers in a file given by FileName into an array
    //returns an array
    //it is assumed the the first line of the file contains the number of lines in the file
    //use .txt
    public static double[] readFile(String fileName) throws IOException {

        //good code is:
        //fast
        //memory efficient
        //readable by other people (in the team)
            //comments need to be updated if the code gets updated
        //it should be correct
        //generalized/factual
        //portable

        //1) make an array of some size
        //2) store the values until the length ends
        //3) make another array
        //4) pos = 0

        FileReader fr = new FileReader(fileName); //mac does not need to define the disk, uses / instead of \
        BufferedReader br = new BufferedReader(fr);

        double[] a = new double[0];

        while (true) { //infinite loop

            String s = br.readLine(); //keep reading the file "forever"
            if (s == null) {
                break; //until there is no character: exit the loop
            }

            //copy the old array into the new array using expandarray
            double[] b = ExpandableArray.expandArray(a);

            // convert string s to double (since int is not as likely)
            double n = Double.parseDouble(s); //by doing this, it massively cuts off the memory usage
            //System.out.println(n);

            b[b.length - 1] = n;

            //set the old to the new array
            a = b;
        }
        fr.close();

        //in main method
        //System.out.println(Arrays.toString(a));

        return a;

    }

}
