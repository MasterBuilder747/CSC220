package Lecture.Week06;

public class Circle {

    //every circle object has its own radius
    //ie radius is an attribute of a circle object
    public double radius; //THIS IS NOT A VARIABLE DECLARATION

    private Circle() {
        //default value still gets set, but it occurs here
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.radius);
    }
}
