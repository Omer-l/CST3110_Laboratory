package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyNodeLLTest {

    @Test
    public void testInitialiseElement() {
        MyNodeLL<Integer> node = new MyNodeLL<>(25);

        Integer expected = 25;
        Integer actual = node.getElement();

        assertEquals(expected, actual);
    }

    @Test
    public void testInitialiseNextAndPrevious() {
        Integer previousElement = 15;
        MyNodeLL<Integer> previousNode = new MyNodeLL<>(previousElement);

        Integer nextElement = 400;
        MyNodeLL<Integer> nextNode = new MyNodeLL<>(nextElement);


        MyNodeLL<Integer> node = new MyNodeLL<>(25, previousNode, nextNode);

        Integer[] expecteds = {15, 25, 400};
        Integer[] actuals = {node.getPrevious().getElement(), node.getElement(), node.getNext().getElement()};

        assertArrayEquals(expecteds, actuals);
    }
}