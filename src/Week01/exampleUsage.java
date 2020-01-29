package Week01;

import java.io.IOException;
import java.util.Arrays;

//special import for custom function
import static ArrayFuncs.ReadFile.readFile;

public class exampleUsage {

    //example usage
    public static void main(String[] args) throws IOException {

        double[] num1 = readFile("/Users/Joseph/Desktop/numbers.txt");
        double[] num2 = readFile("/Users/Joseph/Desktop/numbers1.txt");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }
}
