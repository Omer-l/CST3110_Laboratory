package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testEmpty() {
        MyLinkedList<Integer> testList = new MyLinkedList<>();

        boolean actual = testList.empty();
        assertTrue(actual);
    }

    @Test
    public void testAdd1() {
        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);

        Integer expected = 2;
        Integer actual = testList.getFirst().getElement();
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);
        testList.add(3);

        Integer[] expecteds = {2, 3};
        Integer[] actuals = {testList.getFirst().getElement(), testList.getFirst().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testAdd3() {
        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);
        testList.add(3);
        testList.add(4);

        Integer[] expecteds = {2, 3, 4};
        Integer[] actuals = {testList.getFirst().getElement(), testList.getFirst().getNext().getElement(), testList.getFirst().getNext().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testAdd4() {
        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);

        Integer[] expecteds = {2, 3, 4, 5};
        Integer[] actuals = {testList.getFirst().getElement(), testList.getFirst().getNext().getElement(), testList.getFirst().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void addIndex0() {

        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(500, 0);

        Integer[] expecteds = {500, 2, 3, 4, 5};
        Integer[] actuals = {testList.getFirst().getElement(), testList.getFirst().getNext().getElement(), testList.getFirst().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void addIndexLast() {

        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(500, 5);

        Integer[] expecteds = {2, 3, 4, 5, 500};
        Integer[] actuals = {testList.getFirst().getElement(), testList.getFirst().getNext().getElement(), testList.getFirst().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void addIndex3() {

        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(500, 3);

        Integer[] expecteds = {2, 3, 4, 500, 5};
        Integer[] actuals = {testList.getFirst().getElement(), testList.getFirst().getNext().getElement(), testList.getFirst().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getElement(), testList.getFirst().getNext().getNext().getNext().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

//
//    @Test
//    public void testGetLast() {
//        MyLinkedList<Integer> testList = new MyLinkedList<>();
//        testList.add(2);
//        testList.add(5);
//        testList.add(10);
//        assertEquals((Integer)10, testList.getLast());
//        assertEquals((Integer)2, testList.getFirst());
//    }
//
//    @Test
//    public void testGetIndexLessThanMid() {
//        MyLinkedList<Integer> testList = new MyLinkedList<>();
//        testList.add(2);
//        testList.add(5);
//        testList.add(4);
//        testList.add(12);
//        testList.add(115421);
//        testList.add(1213);
//        testList.add(52);
//        testList.add(23);
//        testList.add(123);
//        System.out.println(testList.toString());
//      //  assertEquals((Integer)115421, testList.get(4));
//    }
}