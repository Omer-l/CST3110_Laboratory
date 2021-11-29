package lab3;

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
    /**
     * Adds element as first if there are no nodes in list, otherwise
     * add to the end of the linkedlist.
     * @param element       element to add to the linked list
     */
    public void add(E element) {
        MyNodeLL<E> newNode = new MyNodeLL<>(element);

        if(empty())
            first = newNode;
        else
            add(newNode);

        size++;
    }

    //adds new node to the end of the linked list.
    public void add(MyNodeLL<E> node) {
        if(last == null) {
            last = node;
            last.setPrevious(first);
            first.setNext(last);
        } else {
            MyNodeLL<E> tmp = last;
            last = node;
            node.setPrevious(tmp);
            tmp.setNext(node);
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
