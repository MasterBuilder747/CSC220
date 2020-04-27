/*
Name: Joseph Audras
Professor: Graham
Date due: 4-27-20
Class: CSC 220-1
*/

package Homework.HW9;

//	for a class to implement IMap it must provide these three methods
public interface IMap<K, V> {
    void put(K key, V value);

    V get(K key);

    int getSize();
}
