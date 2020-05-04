/*
Name: Joseph Audras
Professor: Graham
Date due: 5-4-20
Class: CSC 220-1
*/

package Homework.HW10;
//	a collection of kvps with add and get operations
import java.util.ArrayList;
import java.util.List;

//	a key-value store storing keys of type K and values of type V
//	K is a class/interface so the keys are objects, likewise for V
public class MyHashMap<K, V> implements IMap<K, V> {
    //	the kvps are stored in a bucket, where a bucket is a list of KVPS
    //	we can have as many buckets as we like
    //	if we have N kvps each bucket on average has size N/(number of buckets)
    //	number of buckets is usually called M, so average bucket length is N/M

    //  this is an array of arraylists of KVPs
    public ArrayList<KVP<K, V>>[] bucket;
    private int size;

    //	M is the number of buckets
    public MyHashMap(int M) {
        //  casting to show how this is initialized
        this.bucket = (ArrayList<KVP<K, V>>[]) new ArrayList[M];
        //  make each bucket the empty list
        for (int i = 0; i < this.bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean containsKey(K key) {
        int b = chooseBucket(key);
        for (KVP<K, V> pair : this.bucket[b]) {
            if (pair.key != null) {
                if (pair.key.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void delete(K key) {
        //	given the key, somehow choose a bucket, and then put into that bucket
        int b = chooseBucket(key);
        for (KVP<K, V> pair : this.bucket[b]) {
            if (pair.key.equals(key)) {
                this.bucket[b].remove(pair);
                this.size--;
                resizeIfNecessary();
                return;
            }
        }
    }

    //	choose bucket quickly but also uniformly (so every bucket has the
    //	same probability of being chosen -- i.e. we distribute the key-value
    //	pairs across the buckets)
    //	if you have N key-value pairs, and M buckets, then the average
    //	length of each bucket is N/M
    //	if this function is uniform then most bucket lengths will be close to
    //	the average
    //	if x == y then x.hashCode() == y.hashCode()
    //	it is possible that if x != y then x.hashCode() == y.hashCode()
    private int chooseBucket(K key) {
        //	hash(key) mod the number of buckets
        //	key.hashCode() is an int
        //	abs(.) ensures positivity, and % bucket.length ensures the result
        //	is between 0 and bucket.length -1 inclusive
        return Math.abs(key.hashCode()) % bucket.length;
    }

    //	if the number of kvps N is > 2 * the number of buckets, add more buckets,
    //	this means that the average bucket length = N/M <= 2 (N is at most 2*M,
    //	or M is at least 1/2 N
    //	NOTE: this code is currently WRONG
    private void resizeIfNecessary() {
        if (this.size >= 2 * this.bucket.length) {
            //System.out.println("RESIZING");
            //	add buckets
            //	make a bucket array that is twice as large
            ArrayList<KVP<K, V>>[] newBucket = (ArrayList<KVP<K, V>>[]) new ArrayList[2 * this.bucket.length];
            //	copy the old bucket array into the new bucket array
            for (int i = 0; i < this.bucket.length; i++) {
                newBucket[i] = this.bucket[i];
            }
            //	full up the new spots in newBucket with empty lists
            for (int i = this.bucket.length; i < newBucket.length; i++) {
                newBucket[i] = new ArrayList<>();
            }
            this.bucket = newBucket;
        }
    }

    //	adds a key-value pair to the key-value store pointed to by this
    public void put(K key, V value) {
        resizeIfNecessary();
        //	given the key, somehow choose a bucket, and then put into that bucket
        int b = chooseBucket(key);
        for (KVP<K, V> pair : this.bucket[b]) {
            if (pair.key.equals(key)) {
                //	change the value in the KVP for the key
                pair.value = value;
                return;
            }
        }

        //	if we get here the key wasn't in the store, so add a pair to the
        //	end of the b-th bucket
        KVP<K, V> pair = new KVP<>(key, value);
        this.bucket[b].add(pair);
        this.size++;
    }

    //	get the value associated with the given key
    public V get(K key) {
        //	given the key, somehow choose a bucket, and then scan that bucket
        int b = chooseBucket(key);
        //	scan the b-th bucket looking for a KVP whose key = the key we are looking for
        for (KVP<K, V> pair : this.bucket[b]) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        //	get here if the key isn't in the list
        return null;
    }
}
