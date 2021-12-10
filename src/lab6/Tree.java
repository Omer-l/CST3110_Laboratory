package lab6;

public class Tree<E extends Comparable<E>> {

    private MyTreeNode<E> root;

    public Tree(E element) {
        this.root = new MyTreeNode<>(element);
    }

    public Tree() {
    }

    /**
     * Traverses the tree until node to add child to is found.
     * @param elementToAdd      the element to add to the tree
     */
    public void add(E elementToAdd) {
        if(root == null)
            this.root = new MyTreeNode<>(elementToAdd);
        else
            add(root, elementToAdd);

    }

    /**
     * Until the node to add the child is found, recursively traverses the tree.
     * @param currentNode       the node the recursion is currently at
     * @param elementToAdd      the element to add to the tree
     */
    private void add(MyTreeNode<E> currentNode, E elementToAdd) {
        E currentElement = currentNode.getElement();
        boolean left = (currentElement.compareTo(elementToAdd) == 1 ||
                currentElement.compareTo(elementToAdd) == 0); //<= currentNode

        if(currentNode.getLeftNode() != null) {
            MyTreeNode<E> nextNode = currentNode.getLeftNode();
            if(left) //then traverse left in the next recursion
                add(nextNode, elementToAdd);
        } else if(currentNode.getRightNode() != null) {
            MyTreeNode<E> nextNode = currentNode.getRightNode();
            if(!left)
                add(nextNode, elementToAdd);

        } else { //both branches are null and insert either
            MyTreeNode<E> newNode = new MyTreeNode<>(elementToAdd);

            if(left)
                currentNode.setLeftNode(newNode);
            else
                currentNode.setRightNode(newNode);
        }

    }

    /**
     * Given an element, searches the tree for a node containing the element.
     * @param element   is the element to search
     * @return          the node containing the element.
     */
    public MyTreeNode<E> search(E element) {
        if(root.getElement().compareTo(element) == 0)
            return root;
        else
            return search(root, element);
    }

    /**
     * Recursively traverses the tree until node containing element is found.
     * @param currentNode   the current leaf/branch the recursion is at.
     * @param element       the element to look for in a node.
     * @return              the node containing the element.
     */
    private MyTreeNode<E> search(MyTreeNode<E> currentNode, E element) {
        return null;
    }

    public MyTreeNode<E> getRoot() {
        return root;
    }
}
