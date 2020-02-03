package ArrayFuncs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static double[] readFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName); //mac does not need to define the disk, uses / instead of \
        BufferedReader br = new BufferedReader(fr);
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
    }
}
