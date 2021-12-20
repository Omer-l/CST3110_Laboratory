package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyHashTableTest {

    private MyHashTable<Integer> myHashTable = new MyHashTable<>();

    @Test
    public void testGetHashValue() {
        Integer newElement = 25;

        myHashTable.getHashValue(newElement);

    }
}