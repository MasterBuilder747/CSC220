/*
Name: Joseph Audras
Professor: Graham
Date due: 4-27-20
Class: CSC 220-1
*/

package Homework.HW9;

//	a binary search tree (BST) with keys of type K and values of type V
//	a BST stores key-value pairs
//	the keys must be orderable (that's what extends Comparable<K> says)
//	K extends Comparable<K> guarantees that objects of type K have a compareTo method
public class BST<K extends Comparable<K>, V> implements IMap<K, V> {

    //	every BST has a root node attribute, and a size attribute
    private TreeNode<K, V> root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    //	add a key-value pair to the BST
    public void put(K key, V value) {
        //	if the tree is empty make a node as the root
        if (this.root == null) {
            this.root = new TreeNode<>(key, value);
            this.size++;
        } else {
            //	hop down the tree until we find the key, or we stop at the node
            //	where we need attach a new node into
            TreeNode<K, V> current = this.root;
            while (current != null) {
                //	compare the key to current.key
                int n = key.compareTo(current.key);
                //	if key we are looking for = the key in the current node
                //	== compares location, equals() compares the values at the locations
                if (n == 0) {
                    //	found the key, change it's value
                    current.value = value;
                    return;
                    //	if key we are looking for < the key in the current node
                } else if (n < 0) {
                    //	don't go left if there is no node to go to
                    if (current.left == null) {
                        // build a new node
                        TreeNode<K, V> newNode = new TreeNode(key, value);
                        this.size++;
                        //	attach that node to the left of current
                        current.left = newNode;
                        return;
                    } else {
                        //	hop to the next node -- so change current to point at the left node
                        current = current.left;
                    }
                } else {
                    // key we are looking for > current.key
                    // hop to the next node -- so change current to point at the right node

                    //	don't go right if there is no node to go to
                    if (current.right == null) {
                        // build a new node
                        TreeNode<K, V> newNode = new TreeNode(key, value);
                        this.size++;
                        //	attach that node to the right of current
                        current.right = newNode;
                        return;
                    } else {
                        //	hop to the next node -- so change current to point at the right node
                        current = current.right;
                    }
                }
            }
        }

        //	can't get here
    }

    //	2 < 4,  2-4 < 0
    //	5 > 3,  5-3 > 0
    //	12 = 12, 12-12 = 0
    //	get the value associated with a key K
    public V get(K key) {
        //	hop down the tree until we find the key, or we hop off the bottom of the tree
        TreeNode<K, V> current = this.root;
        while (current != null) {
            //	compare the key to current.key
            int n = key.compareTo(current.key);
            //	if key we are looking for = the key in the current node
            //	== compares location, equals() compares the values at the locations
            if (n == 0) {
                return current.value;
                //	if key we are looking for < the key in the current node
            } else if (n < 0) {
                //	hop to the next node -- so change current to point at the left node
                current = current.left;
            } else {
                // key we are looking for > current.key
                //	hop to the next node -- so change current to point at the right node
                current = current.right;
            }
        }

        //	get here -- didn't find the key
        return null;
    }

    //	return the size of the BST pointed to by this
    public int getSize() {
        return size;
    }

    //	depth(T) = 0 for empty tree
    //	depth(T) = 1 + max(depth(T.left), depth(T.right))
    public int getDepth() {
        return getDepthR(root) - 1;
    }

    private int getDepthR(TreeNode<K, V> current)
    {
        if (current == null) {
            return 0;
        } else {
            int leftD = getDepthR(current.left);
            int leftR = getDepthR(current.right);
            return 1 + Math.max(leftD, leftR);
        }
    }
}
