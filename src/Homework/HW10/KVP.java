/*
Name: Joseph Audras
Professor: Graham
Date due: 5-4-20
Class: CSC 220-1
*/

package Homework.HW10;

//	stores a key-value pair with the key being of type K, and the value being
//	of type V
public class KVP<K, V> {
    K key;
    V value;

    //	initializes a key-value pair pointed to by this
    public KVP(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
