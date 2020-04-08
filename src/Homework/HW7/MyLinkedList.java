/*
Name: Joseph Audras
Professor: Graham
Date due: 4-8-20
Class: CSC 220-1
*/

package Homework.HW7;

import java.lang.StringBuilder;

public class MyLinkedList {

    //don't hop the first time
    private ListNode hop(ListNode current, int i) {
        if (i > 0) {
            for (int x = 0; x < i; x++) {
                current = current.next;
            }
        }
        return current;
    }

    public void delete() {
        if (this.size == 1) {
            //size == 1
            //delete the only element, value of i doesn't matter
            //this becomes an empty list
            this.head = null;
            this.last = null;
            this.size--;
        } else {
            throw new IllegalArgumentException("The list is not size 1. Provide a position value.");
        }
    }

    public void delete(int i) {
        //– deletes the i-th entry of the list.
        if (this.head == null) {
            //size == 0
            throw new IllegalArgumentException("The list cannot be empty.");
        } else if (this.size == 1) {
            //size == 1
            //delete the only element, value of i doesn't matter
            //this becomes an empty list
            this.head = null;
            this.last = null;
            this.size--;
        } else if (i > -1 && i < this.size) {
            //size == 2+
            if (i == 0) {
                //sets the head to the second node
                this.head = hop(this.head, 1);
            } else if (i == this.size - 1) {
                //the (i-1)th node is now the last element
                ListNode previousI = hop(this.head, i - 1);
                previousI.next = null;
                this.last = previousI;
            } else {
                //middle deletion
                //jump to i-1
                ListNode previousI = hop(this.head, i - 1);
                //make the previousI (i-1) node point to nextI (i+1), which will 'skip' and delete the i node
                previousI.next = hop(previousI, 2);
            }
            this.size--;
        } else {
            throw new IllegalArgumentException("i must be greater than -1 and smaller than or equal to size.");
        }
    }

    public void insert(double value, int i) {
        //– add a new element to the i-th position of the list. Aka insert
        ListNode node = new ListNode(value);

        if (this.head == null) {
            //size == 0
            this.head = node;
            this.last = node;
            this.size++;
        } else if (i == 0) {
            this.addFront(value);
        } else if (i == this.size) {
            this.addBack(value);
        } else if (i > -1 && i < this.size) {
            //size == 2+
            //the (i-1)th node is now the last element
            ListNode previousI = hop(this.head, i - 1);
            ListNode nextI = previousI.next; //i+1, but i hasn't been inserted yet
            //insert the i node
            previousI.next = node;
            node.next = nextI;
            this.size++;
        } else {
            throw new IllegalArgumentException("i must be greater than -1 and smaller than or equal to size.");
        }
    }

    public void set(double value, int i) {
        //– changes the i-th position of the list to the new element.
        if (this.head == null) {
            throw new IllegalArgumentException("The list cannot be empty.");
        } else if (i > -1 && i < this.size) {
            hop(this.head, i).value = value;
        } else {
            throw new IllegalArgumentException("i must be greater than -1 and smaller than the size.");
        }
    }

    public String toString() {
        //– returns a string representation of the list (so a string starting with “[“,
        // ending with “]”, and showing the elements of the list separated by commas
        // – be careful with the last element).
        StringBuilder sb = new StringBuilder("[");
        ListNode current = this.head;

        for(int i = 0; i < this.size - 1; i++) {
            sb.append(current.value);
            sb.append(", ");
            current = current.next;
        }
        if (this.head != null) {
            sb.append(current.value);
        }
        sb.append("]");

        return sb.toString();
    }

    //object specific attributes

    //  every MyLinkedList object contains a head and a last attribute
    ListNode head;
    ListNode last;
    //  every MyLinkedList object contains a size attribute
    int size;

    public MyLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    //  get the pos-th of a linked list pointed to by this
    public double get(int pos) {
        ListNode current = this.head;
        for (int i = 0; i < pos; i++) {
            //	hop to the next node -- so change current to point at the next node
            current = current.next;
        }
        return current.value;
    }

    //  add to the back of a linked list pointed to by this
    public void addBack(double value) {
        //	if list is empty we can't hop
        if (this.head == null) {
            ListNode newNode = new ListNode(value);
            //	head and the last are the same thing, namely the new node
            this.head = newNode;
            this.last = newNode;
            //	or call addFront(value);
        }else{
            ListNode newNode = new ListNode(value);
            //	make the last nodes next attribute point to the new node
            this.last.next = newNode;
            //	above line is equivalent to
            //	Listnode lastNode = this.last
            //	lastNode.next = newNode;
            this.last = newNode;
        }
        //	always increase the size no matter whether the list is empty or not
        this.size++;
    }

    //  add to the front of a linked list pointed to by this
    public void addFront(double value) {
        //	if list is empty we can't hop
        if (this.head == null) {
            ListNode newNode = new ListNode(value);
            //	head and the last are the same thing, namely the new node
            this.head = newNode;
            this.last = newNode;
        }else{
            //	if list non empty the head changes, but the last stays the same
            ListNode newFront = new ListNode(value);
            newFront.next = this.head;
            this.head = newFront;
        }

        //	always increase the size no matter whether the list is empty or not
        this.size++;
    }
}
