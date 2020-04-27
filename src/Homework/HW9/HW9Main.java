/*
Name: Joseph Audras
Professor: Graham
Date due: 4-27-20
Class: CSC 220-1
*/

package Homework.HW9;

public class HW9Main {

    public static BST createBST(int N) {
        BST b = new BST<Double, Integer>();
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                b.put(i, Math.random());
            }
        }
        return b;
    }

    public static void main(String[] args) {
        BST b = createBST(10);
        int size = b.getSize();
        for (int i = 0; i < size; i++){
            System.out.println(b.get(i));
        }
    }

}
