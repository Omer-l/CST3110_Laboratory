package lab3;

public class MyNodeLL<E> {
    E element;
    MyNodeLL<E> next;
    MyNodeLL<E> previous;

    public MyNodeLL(E element, MyNodeLL<E> previous, MyNodeLL<E> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    public MyNodeLL(E e) {
        this.element = e;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public MyNodeLL<E> getNext() {
        return next;
    }

    public void setNext(MyNodeLL<E> next) {
        this.next = next;
    }

    public MyNodeLL<E> getPrevious() {
        return previous;
    }

    public void setPrevious(MyNodeLL<E> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "[" + previous + "] - [" + element + "] - [" + next + "]";
    }
}
