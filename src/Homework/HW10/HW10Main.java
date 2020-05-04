/*
Name: Joseph Audras
Professor: Graham
Date due: 5-4-20
Class: CSC 220-1
*/

package Homework.HW10;

public class HW10Main {

    public static void main(String[] args) {
        MyHashMap<Double, Integer> map1 = new MyHashMap<>(10);
        for (int i = 0; i < 100; i++) {
            map1.put(i * 1.0, 1);
        }
        map1.put(1.0, 1);

        assert map1.containsKey(0.0);
        assert map1.containsKey(1.0);
        assert !map1.containsKey(100.0);

        System.out.println(map1.getSize());
        map1.delete(0.0);
        System.out.println(map1.getSize());
        assert !map1.containsKey(0.0);
        map1.put(0.0, 1);
        assert map1.containsKey(0.0);
     }

}
