/*
Name: Joseph Audras
Professor: Graham
Date due: 4-27-20
Class: CSC 220-1
*/

package Homework.HW9;

//	a tree node storing a key of type K, and a value of type V
public class TreeNode<K, V> {

    K key;
    V value;
    TreeNode<K, V> left;
    TreeNode<K, V> right;

    public TreeNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
