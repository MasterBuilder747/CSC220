/*
Name: Joseph Audras
Professor: Graham
Date due: 5-4-20
Class: CSC 220-1
*/

package Homework.HW10;

public class HW10Main {

    public static void generateKeys(MyHashMap<Double, Integer> map, int N) {
        for (int i = 0; i < N; i++) {
            map.putNoResize(Math.random(), 1);
        }
        System.out.print(map.bucket.length + ", ");
        System.out.print(map.getMax() + ", ");
        System.out.print(map.getMin() + ", ");
        System.out.print(map.ave());
        System.out.println();
    }

    public static void generateKeysResize(MyHashMap<Double, Integer> map, int N) {
        for (int i = 0; i < N; i++) {
            map.put(Math.random(), 1);
        }
        System.out.print(map.bucket.length + ", ");
        System.out.print(map.getMax() + ", ");
        System.out.print(map.getMin() + ", ");
        System.out.print(map.ave());
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        // Q1
        MyHashMap<Double, Integer> map1 = new MyHashMap<>(10);
        for (int i = 0; i < 100; i++) {
            map1.putNoResize(i * 1.0, 1);
        }
        map1.put(1.0, 1);

        assert map1.containsKey(0.0);
        assert map1.containsKey(1.0);
        assert !map1.containsKey(100.0);

        map1.delete(0.0);
        assert !map1.containsKey(0.0);
        map1.put(0.0, 1);
        assert map1.containsKey(0.0);

        //Q2
        System.out.println("Buckets, Max, min, ave");
        MyHashMap<Double, Integer> map2 = new MyHashMap<>(10);
        generateKeys(map2, 100);
        generateKeys(map2, 1_000);
        generateKeys(map2, 10_000);
        generateKeys(map2, 100_000);
        System.out.println();
        */
        //Q3
        MyHashMap<Double, Integer> map3 = new MyHashMap<>(10);
        for (int i = 0; i < 100; i++) {
            map3.put(i * 1.0, 1);
        }
        map3.put(1.0, 1);

        assert map3.containsKey(0.0);
        assert map3.containsKey(1.0);
        assert !map3.containsKey(100.0);

        map3.delete(0.0);
        assert !map3.containsKey(0.0);
        map3.put(0.0, 1);
        assert map3.containsKey(0.0);

        //Q4
        MyHashMap<Double, Integer> map4 = new MyHashMap<>(10);
        generateKeysResize(map4, 100);
        generateKeysResize(map4, 1_000);
        generateKeysResize(map4, 10_000);
        generateKeysResize(map4, 100_000);
        generateKeysResize(map4, 1_000_000);
        generateKeysResize(map4, 10_000_000);

    }



}
