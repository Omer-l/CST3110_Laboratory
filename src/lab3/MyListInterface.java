package lab3;

public interface MyListInterface<E> {

    public void add(E e);

    public void add(int index, E e);

    public void clear();

    public boolean contains(E e);

    /**
     * Adds the element to the head of this list
     * @param element   element E to add
     */
    public void addFirst(E element);

    /**
     * Adds the element to the tail of this list
     * @param element   element E to add
     */
    public void addLast(E element);

    public E get(int index);

    /**
     * @return the first element from this list
     */
    public E getFirst();

    /**
     * @return the last element from this list
     */
    public E getLast();

    public boolean remove(E e);

    public E remove(int index);
    /**
     * @return and remove the first element from this list
     */
    public E removeFirst();

    /**
     * @return and remove the last element from this list
     */
    public E removeLast();

    public boolean empty();

    public int indexOf(E e);
}
