/*
Name: Joseph Audras
Professor: Graham
Date due: 4-17-20
Class: CSC 220-1
*/

package Homework.HW8;

import java.util.*;

public class HW8Main {

    //Q1: ArrayList
    public static int addFor(ArrayList<Integer> al) {
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
    }
    public static int addForeach(ArrayList<Integer> al) {
        int sum = 0;
        for (int i : al) {
            sum += al.get(i);
        }
        return sum;
    }
    public static int addIt(ArrayList<Integer> al) {
        int sum = 0;
        for (Iterator<Integer> itr=al.iterator(); itr.hasNext();) {
            sum += itr.next();
        }
        return sum;
    }

    //Q2: LinkedList
    public static int addFor(LinkedList<Integer> ll) {
        int sum = 0;
        for (int i = 0; i < ll.size(); i++) {
            sum += ll.get(i);
        }
        return sum;
    }
    public static int addForeach(LinkedList<Integer> ll) {
        int sum = 0;
        for (int i : ll) {
            sum += ll.get(i);
        }
        return sum;
    }
    public static int addIt(LinkedList<Integer> ll) {
        int sum = 0;
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        return sum;
    }

    public static void main(String[] args) {
        //Q1: ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        assert addFor(al) == 45;
        assert addForeach(al) == 45;
        assert addIt(al) == 45;
        assert addIt(al2) == 0;

        //Q2: LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        assert addFor(ll) == 45;
        assert addForeach(ll) == 45;
        assert addIt(ll) == 45;
        assert addIt(ll2) == 0;

        Timer t = new Timer();

        //data collection
        //Q3: plot Q1
        long[][] data3 = new long[10][3];
        int count3 = 0;
        for (int i = 0; i < 100_000_000; i+=10_000_000) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                a.add(j);
            }
            System.out.println("added size " + i);
            t.start();
            addFor(a);
            data3[count3][0] = t.stop();
            t.start();
            addForeach(a);
            data3[count3][1] = t.stop();
            t.start();
            addIt(a);
            data3[count3][2] = t.stop();
            count3++;
        }
        System.out.println("ArrayList: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(data3[i]));
        }

        //Q4: plot Q2
        long[][] data4 = new long[10][3];
        int count4 = 0;
        for (int i = 0; i < 100_000; i+=10_000) {
            LinkedList<Integer> a = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                a.add(j);
            }
            System.out.println("added size " + i);
            t.start();
            addFor(a);
            data4[count4][0] = t.stop();
            t.start();
            addForeach(a);
            data4[count4][1] = t.stop();
            t.start();
            addIt(a);
            data4[count4][2] = t.stop();
            count4++;
        }
        System.out.println("LinkedList: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(data4[i]));
        }
    }
}
