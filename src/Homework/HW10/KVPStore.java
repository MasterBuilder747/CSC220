/*
Name: Joseph Audras
Professor: Graham
Date due: 5-4-20
Class: CSC 220-1
*/

package Homework.HW10;

//	a collection of kvps with add and get operations
import Homework.HW10.IMap;
import Homework.HW10.KVP;

import java.util.ArrayList;
import java.util.List;

//	a key-value store storing keys of type K and values of type V
//	K is a class/interface so the keys are objects, likewise for V
public class KVPStore<K, V> implements IMap<K, V> {

    //	the kvps attribute stores the collection of key-value pairs
    private List<KVP<K, V>> kvps;

    public KVPStore() {
        //	initially the list of key-value pairs is empty
        this.kvps = new ArrayList<>();
    }

    public int getSize() {
        return this.kvps.size();
    }

    //	adds a key-value pair to the key-value store pointed to by this
    //	a miss is when we look for a key but it isn't there
    //	a hit is when we look for a key and it is there
    //	if we have N key-value pairs stored in kvps and we add a key-value pair this costs us:
    //	a) hit : this code takes on average N/2 steps
    //	b) miss : the code takes N steps
    public void put(K key, V value) {
        for (KVP<K, V> pair : this.kvps) {
            if (pair.key.equals(key)) {
                //	change the value in the KVP for the key
                pair.value = value;
                return;
            }
        }

        //	if we get here the key wasn't in the store, so add a pair to the
        //	end of the list of key-value pairs
        //	create a single KVP storing the key and the value together
        KVP<K, V> pair = new KVP<>(key, value);
        this.kvps.add(pair);
    }

    //	get the value associated with the given key
    //	a miss is when we look for a key but it isn't there
    //	a hit is when we look for a key and it is there
    //	if we have N key-value pairs stored in kvps and we look for a key this costs us:
    //	a) hit : this code takes on average N/2 steps
    //	b) miss : the code takes N steps
    public V get(K key) {
        //	scan the list looking for a KVP whose key = the key we are looking for
        for (KVP<K, V> pair : this.kvps) {
            //	WRONG -- this compares the location of pair.key with the location of key
            ///if(pair.key == key)
            //	RIGHT -- this compares the value of pair.key with the value of key
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        //	get here if the key isn't in the list
        return null;
    }
}
