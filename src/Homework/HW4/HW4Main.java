/*
Name: Joseph Audras
Professor: Graham
3-2-20
*/

package Homework.HW4;

public class HW4Main {

    public static void main(String[] args) {

        System.out.println("test toString(): ");
        System.out.println("print out an initialized empty array: ");
        ExpandableArrayData a = new ExpandableArrayData();
        assert a.toString(a).equals("[]");
        System.out.println(a.toString(a));

        System.out.println("print out an array: ");
        ExpandableArrayData.add(a, 1);
        assert a.toString(a).equals("[1.0]");
        System.out.println(a.toString(a));


        System.out.println();
        System.out.println("test addFront(): ");
        System.out.println("add 100 at the front of the array: ");
        System.out.println("assert that array contains \"[100.0\":");
        ExpandableArrayData b = new ExpandableArrayData();
        for (int i = 0; i < 5; i++) {
            ExpandableArrayData.add(b, Math.random());
        }
        System.out.println("input: " + b.toString(b));
        b.addFront(b, 100);
        assert b.toString(b).contains("[100.0");
        assert ExpandableArrayData.getLength(b) == 6;
        System.out.println("output: " + b.toString(b));


        System.out.println();
        System.out.println("test insert(): ");
        System.out.println("assert that array contains \"1000.0\":");
        ExpandableArrayData c = new ExpandableArrayData();
        for (int i = 0; i < 10; i++) {
            ExpandableArrayData.add(c, Math.random());
        }
        System.out.println("input: " + c.toString(c));
        c.insert(c, 1000.0, (int)(Math.random() * 10)); //insert at a random position
        assert c.toString(c).contains("1000.0, ");
        assert ExpandableArrayData.getLength(c) == 11;
        System.out.println("output: " + c.toString(c));


        System.out.println();
        System.out.println("test delete(): ");
        System.out.println("assert that array does not contain \"1.0\":");
        ExpandableArrayData d = new ExpandableArrayData();
        for (int i = 0; i < 7; i++) {
            ExpandableArrayData.add(d, i);
        }
        System.out.println("input: " + d.toString(d));
        d.delete(d, 1);
        assert ExpandableArrayData.getLength(d) == 6;
        System.out.println("output: " + d.toString(d));
        assert !(d.toString(d).contains("1.0"));
        System.out.println("test an invalid input: ");
        d.delete(d, -1);

    }
}
