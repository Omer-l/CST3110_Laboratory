package lab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {

    @Test
    public void addRoot() {
        Tree<Integer> tree = new Tree();
        Integer rootElement = 25;

        tree.add(rootElement);

        Integer expected = rootElement;
        Integer actual = tree.getRoot().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void addLeft() {
        Tree<Integer> tree = new Tree(25);

        Integer leftElement = 5;
        tree.add(leftElement);

        Integer expected = leftElement;
        Integer actual = tree.getRoot().getLeftNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void addRight() {
        Tree<Integer> tree = new Tree(25);

        Integer rightElement = 50;
        tree.add(rightElement);

        Integer expected = rightElement;
        Integer actual = tree.getRoot().getRightNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void add2Left() {

        Tree<Integer> tree = new Tree(25);

        Integer leftElement1 = 5;
        tree.add(leftElement1);

        Integer leftElement2 = 2;
        tree.add(leftElement2);

        Integer expected = leftElement2;
        Integer actual = tree.getRoot().getLeftNode().getLeftNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void add2Right() {

        Tree<Integer> tree = new Tree(25);

        Integer rightElement1 = 50;
        tree.add(rightElement1);

        Integer rightElement2 = 250;
        tree.add(rightElement2);

        Integer expected = rightElement2;
        Integer actual = tree.getRoot().getRightNode().getRightNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void addLeftRight() {

        Tree<Integer> tree = new Tree(25);

        Integer leftElement = 10;
        tree.add(leftElement);

        Integer leftRightElement = 15;
        tree.add(leftRightElement);

        Integer expected = leftRightElement;
        Integer actual = tree.getRoot().getLeftNode().getRightNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void addRightLeft() {

        Tree<Integer> tree = new Tree(25);

        Integer rightElement = 50;
        tree.add(rightElement);

        Integer rightLeftElement = 35;
        tree.add(rightLeftElement);

        Integer expected = rightLeftElement;
        Integer actual = tree.getRoot().getRightNode().getLeftNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void addLeftLeftRight() {

        Tree<Integer> tree = new Tree(25);

        Integer leftElement = 20;
        tree.add(leftElement);

        Integer leftLeftElement = 10;
        tree.add(leftLeftElement);

        Integer leftLeftRight = 15;
        tree.add(leftLeftRight);

        Integer expected = leftLeftRight;
        Integer actual = tree.getRoot().getLeftNode().getLeftNode().getRightNode().getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchRoot() {
        Integer expected = 25;
        Tree<Integer> tree = new Tree(expected);

        Integer actual = tree.search(25).getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchLeftOfRoot() {

        Tree<Integer> tree = new Tree(25);

        Integer expected = 15;

        tree.add(expected);

        Integer actual = tree.search(expected).getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchRightOfRoot() {

        Tree<Integer> tree = new Tree(25);

        Integer expected = 35;

        tree.add(expected);

        Integer actual = tree.search(expected).getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchFarthestLeft() {

        Tree<Integer> tree = new Tree(25);

        Integer left1Element = 24;
        Integer left2Element = 23;
        Integer left3Element = 21;
        Integer left4Element = 20;
        Integer expected = 20;

        tree.add(left1Element);
        tree.add(left2Element);
        tree.add(left3Element);
        tree.add(left4Element);
        tree.add(expected);

        Integer actual = tree.search(expected).getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchFarthestRight() {

        Tree<Integer> tree = new Tree(25);

        Integer right1Element = 34;
        Integer right2Element = 32;
        Integer right3Element = 31;
        Integer right4Element = 30;
        Integer expected = 400;

        tree.add(right1Element);
        tree.add(right2Element);
        tree.add(right3Element);
        tree.add(right4Element);
        tree.add(expected);

        Integer actual = tree.search(expected).getElement();

        assertEquals(expected, actual);
    }
}