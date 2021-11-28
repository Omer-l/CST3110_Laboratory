package lab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTreeNodeTest {

    @Test
    public void setAndGetElement() {
        MyTreeNode<Integer> root = new MyTreeNode<>();

        root.setElement(15);
        Integer expected = 15;
        Integer actual = root.getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void setAndGetLeftNode() {
        MyTreeNode<Integer> root = new MyTreeNode<>(15);

        int leftNodeElement = 5;
        MyTreeNode<Integer> leftNode = new MyTreeNode<>(leftNodeElement);
        root.setLeftNode(leftNode);

        Integer expected = 5;
        Integer actual = root.getLeftNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void setAndGetRightNode() {

        MyTreeNode<Integer> root = new MyTreeNode<>(15);

        int rightNodeElement = 25;
        MyTreeNode<Integer> rightNode = new MyTreeNode<>(rightNodeElement);
        root.setRightNode(rightNode);

        Integer expected = 25;
        Integer actual = root.getRightNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void initialiseConstructorAllAttributes() {

        int rootElement = 20;
        int leftNodeElement = 15;
        int rightNodeElement = 25;
        MyTreeNode<Integer> leftNode = new MyTreeNode<>(leftNodeElement);
        MyTreeNode<Integer> rightNode = new MyTreeNode<>(rightNodeElement);

        MyTreeNode<Integer> root = new MyTreeNode<>(rootElement, leftNode, rightNode);

        Integer[] expecteds = {20, 15, 25};
        Integer[] actuals = {root.getElement(), root.getLeftNode().getElement(), root.getRightNode().getElement()};

        assertEquals(expecteds, actuals);
    }
}