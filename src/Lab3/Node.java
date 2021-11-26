package Lab3;

public class Node<E> {
    E element;
    Node<E> next;
    Node<E> previous;

    public Node(E element, Node<E> previous, Node<E> next) {
        this.element = element;
        this.next = next;
        this.previous = next;
    }

    public Node(E e) {
        this.element = e;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "[" + previous + "] - [" + element + "] - [" + next + "]";
    }
}
