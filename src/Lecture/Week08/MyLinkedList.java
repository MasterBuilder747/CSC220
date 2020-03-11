package Lecture.Week08;

public class MyLinkedList {

    //every ListNode object contains a value attribute and a next attribute
    //double value;
    ListNode head;

    //initializes this to null
    public MyLinkedList() {
        this.head = null;
    }

    public void addFront(double value) {
        //order matters!
        //= assignment:
        //1) evaluate the right hand side
        //2) evaluate arguments in the new clause
        //3) create a blank LinkedList object
        //4) contains only head at this location
        //5) run the appropriate constructor in MyLinkedList
        //6) pass parameters, linked list points to (this = L1000) inside the object
        //7)
        ListNode newFront = new ListNode(value); //this is not a listnode, its a location of it
        newFront.next = this.head; //store the location of listnode in newfront
        //"this" is referencing MyLinkedList
        //head value is null
        //store head location in next
        this.head = newFront; //head then is set to the location of ListNode which has the value 27
    }

    //get the i-th element of a linked list pointed to by this
    public double get(int pos) { //costs pos operations, the downside of a linked list
        //pointer hopping, keep hopping up the list pos times until you get to the desired node
        ListNode current = this.head; //set to the head reference
        for (int i = 0; i < pos; i++) { //repeat pos times
            current = current.next; //this will set the ListNode to the reference of the next node
        }
        return current.value; //the final value of the node will be returned
    }
}
