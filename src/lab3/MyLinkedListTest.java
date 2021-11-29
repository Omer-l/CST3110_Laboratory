package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testAdd1() {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(2);

        Integer expected = 2;
        Integer actual = l.getFirst().getElement();
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(2);
        l.add(3);

        Integer[] expecteds = {2, 3};
        Integer[] actuals = {l.getFirst().getElement(), l.getFirst().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testAdd3() {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(2);
        l.add(3);
        l.add(4);

        Integer[] expecteds = {2, 3, 4};
        Integer[] actuals = {l.getFirst().getElement(), l.getFirst().getNext().getElement(), l.getFirst().getNext().getNext().getElement()};
        assertArrayEquals(expecteds, actuals);
    }

//
//    @Test
//    public void testGetLast() {
//        MyLinkedList<Integer> l = new MyLinkedList<>();
//        l.add(2);
//        l.add(5);
//        l.add(10);
//        assertEquals((Integer)10, l.getLast());
//        assertEquals((Integer)2, l.getFirst());
//    }
//
//    @Test
//    public void testGetIndexLessThanMid() {
//        MyLinkedList<Integer> l = new MyLinkedList<>();
//        l.add(2);
//        l.add(5);
//        l.add(4);
//        l.add(12);
//        l.add(115421);
//        l.add(1213);
//        l.add(52);
//        l.add(23);
//        l.add(123);
//        System.out.println(l.toString());
//      //  assertEquals((Integer)115421, l.get(4));
//    }
}