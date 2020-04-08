/*
Name: Joseph Audras
Professor: Graham
Date due: 4-8-20
Class: CSC 220-1
*/

package Homework.HW7;

public class MyLinkedList {

    public void delete(int i) {
        //– deletes the i-th entry of the list.
    }
    public void addMiddle(double element, int i) {
        //– add a new element to the i-th position of the list.
    }
    public void set(double newElement, int i) {
        //– changes the i-th position of the list to the new element.
    }
    public String toString() {
        //– returns a string representation of the list (so a string starting with “[“,
        // ending with “]”, and showing the elements of the list separated by commas
        // – be careful with the last element).
        return "";
    }


    //  every MyLinkedList object contains a head and a last attribute
    ListNode head;
    ListNode last;
    //  every MyLinkedList object contains a size attribute
    int size;

    public MyLinkedList()
    {
        this.head = null;
        this.size = 0;
    }

    //  add to the back of a linked list pointed to by this
    public void add(double value)
    {
        //	if list is empty we can't hop
        if (this.head == null)
        {
            ListNode newNode = new ListNode(value);
            //	head and the last are the same thing, namely the new node
            this.head = newNode;
            this.last = newNode;
            //	or call addFront(value);
        } else
        {
            ListNode newNode = new ListNode(value);
            //	make the last nodes next attribute point to the new node
            this.last.next = newNode;
            //	above line is equivalent to
            //	Listnode lastNode = this.last
            //	lastNode.next = newNode;
            this.last = newNode;

//			ListNode current = this.head;
//			//	stop with current pointing at the last element
//			while (current.next != null)
//			{
//				//	hop to the next node -- so change current to point at the next node
//				current = current.next;
//			}
//
//			//	current points at the last node in the chain of nodes
//			ListNode newNode = new ListNode(value);
//			current.next = newNode;
        }

        //	always increase the size no matter whether the list is empty or not
        this.size++;
    }

    public int size()
    {
        return this.size;
//		ListNode current = this.head;
//		int count = 0;
//		while (current != null)
//		{
//			//	hop to the next node -- so change current to point at the next node
//			current = current.next;
//			count++;
//		}
//
//		return count;
    }

    //  add to the front of a linked list pointed to by this
    public void addFront(double value)
    {
        //	if list is empty we can't hop
        if (this.head == null)
        {
            ListNode newNode = new ListNode(value);
            //	head and the last are the same thing, namely the new node
            this.head = newNode;
            this.last = newNode;
        } else
        {
            //	if list non empty the head changes, but the last stays the same
            ListNode newFront = new ListNode(value);
            newFront.next = this.head;
            this.head = newFront;
        }

        //	always increase the size no matter whether the list is empty or not
        this.size++;
    }

    //  get the pos-th of a linked list pointed to by this
    public double get(int pos)
    {
        ListNode current = this.head;
        for (int i = 0; i < pos; i++)
        {
            //	hop to the next node -- so change current to point at the next node
            current = current.next;
        }
        return current.value;
    }
}
