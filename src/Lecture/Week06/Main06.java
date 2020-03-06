package Lecture.Week06;

import java.io.IOException;
import java.util.Arrays;

public class Main06 {

    public static double getArea(Circle x) {
        double result = Math.PI * x.radius * x.radius;
        x.radius = 1;
        return result;
    }

    public static void main(String[] args) throws IOException {
        // 1) create a blank object
        // 2) run the appropriate code (constructor) in class circle
        //      a) pass params
        //      b) this

        Point p = new Point(4, 3);
        Circle c = new Circle(10, new Point(4, 3));
        System.out.println(c.radius);
        System.out.println(c.center.x);
        System.out.println(c.center.y);


        //this does not copy it, it is aliasing
        //change one, the other one does as well
//        double[] x = {1, 2, 3};
//        System.out.println(Arrays.toString(x));
//        double[] y = x;
//        y[2] = 99;
//        System.out.println(Arrays.toString(x));

//        Circle c = new Circle(10);
//        System.out.println(getArea(c));
//        System.out.println(getArea(c));
//        Circle d = new Circle(5);
//        System.out.println(d);
//
//        System.out.println(c.radius);
//        System.out.println(d.radius);
//
//        Circle e = d;
//        System.out.println(e);
//        d.radius = 2;
//        System.out.println(e.radius);
    }

}
