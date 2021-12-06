package lab3;

import org.jetbrains.annotations.NotNull;

/**
 * This class is a doubly linked list containing the necessary functions such as
 * add, remove, search.
 * @param <E> Type for the linked list (i.e., Integer, String, Rectangle2D etc.))
 */
public class MyLinkedList<E> {
    private int size = 0;
    private MyNodeLL<E> first;
    private MyNodeLL<E> last;

    public MyLinkedList(E element) {
        this.first = new MyNodeLL<>(element);
    }

    public MyLinkedList() {
    }

    //returns true if linked list is empty.
    public boolean empty() {
        return size == 0;
    }

    //adds first node in the list
    private void addFirst(@NotNull MyNodeLL<E> newNode) {
        newNode.setNext(first);
        first.setPrevious(newNode);
        first = newNode;
    }

    //adds last node in the list
    private void addLast(MyNodeLL<E> newNode) {
        newNode.setPrevious(last);
        last.setNext(newNode);
        last = newNode;
    }

    /**
     * Adds element as first if there are no nodes in list, otherwise
     * add to the end of the linkedlist.
     * @param element       element to add to the linked list
     */
    public void add(E element) {
        MyNodeLL<E> newNode = new MyNodeLL<>(element);

        if(empty())
            this.first = newNode;
        else
            add(newNode);

        size++;
    }

    //Adds new node to the end of the linked list.
    private void add(MyNodeLL<E> node) {
        if(last == null) {
            last = node;
            last.setPrevious(first);
            first.setNext(last);
        } else {
            addLast(node);
        }
    }

    /**
     * Adds a new element to the linked list given an index to add new element to.
     * @param element       is the new element to add to the list.
     * @param index         is the place in the linked list to add the new node.
     */
    public void add(E element, int index) {
        MyNodeLL<E> newNode = new MyNodeLL<>(element);
        if(empty())
            this.first = newNode;
        else
            add(newNode, index);

        size++;
    }

    //Adds to a specific index
    private void add(MyNodeLL<E> newNode, int index) {
        if(last == null) {
            last = newNode;
            last.previous = first;
            first.next = last;
        }else if(index <= 0) {
            addFirst(newNode);
        }
        else if(index >= size)
            addLast(newNode);
        else { //traverse linked list.
            MyNodeLL<E> currentNode = first;
            for(int i = 1; i <= index; i++)
                currentNode = currentNode.getNext();

            currentNode.getPrevious().setNext(newNode);
            currentNode.setPrevious(newNode);
            newNode.setNext(currentNode);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyNodeLL<E> getFirst() {
        return first;
    }

    public void setFirst(MyNodeLL<E> first) {
        this.first = first;
    }

    public MyNodeLL<E> getLast() {
        return last;
    }

    public void setLast(MyNodeLL<E> last) {
        this.last = last;
    }
}
