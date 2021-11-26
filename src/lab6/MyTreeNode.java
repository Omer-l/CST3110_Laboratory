package lab6;

/**
 * An instance of this class represents a branch in the tree. Each branch has a left or a right node or both.
 * @param <E> Type for the node
 */
public class MyTreeNode<E> {

    private E element;
    private MyTreeNode<E> leftNode;
    private MyTreeNode<E> rightNode;

    public MyTreeNode() {

    }

    /**
     * When both left and right of a root is known
     */
    public MyTreeNode(E element, MyTreeNode<E> leftNode, MyTreeNode<E> rightNode) {
        this.element = element;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    /**
     * Primarily for the root of the tree, to start the tree
     */
    public MyTreeNode(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public MyTreeNode<E> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(MyTreeNode<E> leftNode) {
        this.leftNode = leftNode;
    }

    public MyTreeNode<E> getRightNode() {
        return rightNode;
    }

    public void setRightNode(MyTreeNode<E> rightNode) {
        this.rightNode = rightNode;
    }
}
