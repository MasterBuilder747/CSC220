package Lecture.Week06;

public class Circle {

    //every circle object has its own radius, and a center (x, y)
    //ie radius is an attribute of a circle object
    public double radius; //THIS IS NOT A VARIABLE DECLARATION
    Point center;

    private Circle() {
        //default value still gets set, but it occurs here
    }

    // 1) pass parameters
    // 2) know what "this" is: memory location of the circle
                        //10.0,  memory location of Point p
    // 3) result is the memory location of Circle
    public Circle(double radius, Point center) {
        //assign attributes to the circle pointed from the constructor
        this.radius = radius;
        this.center = center;
    }
}
