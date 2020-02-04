package Projects;

import Lecture.ArrayFuncs.ExpandableArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class ReadFile {

    public static void readFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName); //mac does not need to define the disk, uses / instead of \
        BufferedReader br = new BufferedReader(fr);

        Scanner sc = new Scanner(new File(fileName));
        sc.useDelimiter("=");
        while(sc.hasNext()) {
            System.out.println("Linet: " + sc.next());
        }
/*
        double[] a = new double[0];

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }

            double[] b = ExpandableArray.expandArray(a);
            double n = Double.parseDouble(s);
            b[b.length - 1] = n;
            a = b;
        }

        fr.close();
        return a;
        */
    }

    public static void main(String[] args) {
        try {
            readFile("");
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
