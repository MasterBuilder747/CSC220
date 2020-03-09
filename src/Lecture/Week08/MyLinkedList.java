package Lecture.Week08;

public class MyLinkedList {

    //every ListNode object contains a value attribute and a next attribute
    double value;
    ListNode head;

    public MyLinkedList() {
        this.head = null;
    }

    public void addFront(double value) {
        //order matters!
        ListNode newFront = new ListNode(value);
        newFront.next = this.head; //store the location of listnode in newfront
        this.head = newFront;
    }

}
