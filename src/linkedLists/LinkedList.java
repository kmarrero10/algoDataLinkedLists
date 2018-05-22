package linkedLists;


public class LinkedList<T extends Comparable<T>> implements Cloneable {

    private Node<T> head = null;
    public LinkedList() {
    }

    //Count number of nodes in linked list
    public int countNodes() {
        if (head ==null){
            return 0;
        } else {
            Node<T> curr = head;
            int count =0;
            while (curr!= null) {
                curr = curr.getNext();
                count++;
            }
            return count;
        }
    }

    //Add node to linked list
    public void addNode(T data) {
        if(head==null){
            head = new Node<T>(data);
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr =curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    //return first element in linked list
    public T popElement(){
        if (head != null) {
            //storing data from head to variable topElement
            T topElement = head.getData();
            //move head pointer to next element 
            head =head.getNext();
            return topElement;
        }
        return null;
    }
}
