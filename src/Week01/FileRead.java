package Week01;

import java.util.*;
import java.io.*;

public class FileRead {



    public static void main(String[] args) throws IOException{

        FileReader fr = new FileReader("/Users/Joseph/Desktop/numbers.txt"); //mac does not need to define the disk, uses / instead of \
        BufferedReader br = new BufferedReader(fr);

        String firstLine = br.readLine();
        int size = Integer.parseInt(firstLine);
        double[] a = new double[size];

        int count = 0;

        while (true) { //infinite loop
            //read the line
            //need to determine the size of the array based on the size of the file
            //1) read the file twice (inefficient)
            //2) ArrayList (changes size)
            //3) make your own expanding array
            //4) require the user to declare the size of the file (this is a file format)
            String s = br.readLine(); //keep reading the file "forever"
            if (s == null) {
                break; //until there is no character: exit the loop
            }
            // convert string s to double (since int is not as likely)
            double n = Double.parseDouble(s);
            //System.out.println(n);
            a[count] = n;
            count++;

        }

        fr.close();

        System.out.println(Arrays.toString(a));
    }

}
