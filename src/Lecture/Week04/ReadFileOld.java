package Lecture.Week04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileOld {

    public static double[] readFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String firstLine = br.readLine();
        int size = Integer.parseInt(firstLine);
        double[] a = new double[size];

        int count = 0;

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break; //until there is no character: exit the loop
            }


            double n = Double.parseDouble(s);
            a[count] = n;
            count++;
        }
        fr.close();

        return a;

    }

}
