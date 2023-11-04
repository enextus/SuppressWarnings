package org.arraycreator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayCreatorTest {

    @Test
    public void testCreateIntegerArray() {
        Integer[] intArray = ArrayCreator.createArray(Integer.class, 10);
        assertNotNull(intArray);
        assertEquals(10, intArray.length);
    }

    @Test
    public void testCreateStringArray() {
        String[] stringArray = ArrayCreator.createArray(String.class, 5);
        assertNotNull(stringArray);
        assertEquals(5, stringArray.length);
    }

    @Test
    public void testCreateDoubleArray() {
        Double[] doubleArray = ArrayCreator.createArray(Double.class, 8);
        assertNotNull(doubleArray);
        assertEquals(8, doubleArray.length);
    }

    @Test
    public void testArrayElementsAreNullAfterCreation() {
        Integer[] intArray = ArrayCreator.createArray(Integer.class, 3);
        assertNull(intArray[0]);
        assertNull(intArray[1]);
        assertNull(intArray[2]);
    }

    @Test
    public void testCreateArrayWithZeroSize() {
        String[] stringArray = ArrayCreator.createArray(String.class, 0);
        assertNotNull(stringArray);
        assertEquals(0, stringArray.length);
    }

    @Test
    public void testCreateArrayWithNegativeSize() {
        assertThrows(NegativeArraySizeException.class, () -> {
            ArrayCreator.createArray(String.class, -1);
        });
    }

    @Test
    public void testCreateArrayWithNullClass() {
        assertThrows(NullPointerException.class, () -> {
            ArrayCreator.createArray(null, 10);
        });
    }

}
