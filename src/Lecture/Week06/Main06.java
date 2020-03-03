package Lecture.Week06;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {

        // 1) create a blank object
        // 2) run the appropriate code (constructor) in class circle
        //      a) pass params
        //      b) this

        //this does not copy it, it is aliasing
        //change one, the other one does as well
        double[] x = {1, 2, 3};
        System.out.println(Arrays.toString(x));

        double[] y = x;
        y[2] = 99;
        System.out.println(Arrays.toString(x));

        Circle c = new Circle(12);
        System.out.println(c);
        Circle d = new Circle(5);
        System.out.println(d);

        System.out.println(c.radius);
        System.out.println(d.radius);

        Circle e = d;
        System.out.println(e);
        d.radius = 2;
        System.out.println(e.radius);

    }

}
