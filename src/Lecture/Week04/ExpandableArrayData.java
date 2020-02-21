package Lecture.Week04;

public class ExpandableArrayData {

    //one per object (non-static)
    //static is one variable, global
    //each expandable array object has two attributes:
    //an array and an insert position
    private double[] array;
    private int insertPos;

    public ExpandableArrayData() {
        //references the variables of the object that you are constructing
        this.array = new double[1];
        this.insertPos = 0;
    }

    //put public expand necessary and other functions here
}
