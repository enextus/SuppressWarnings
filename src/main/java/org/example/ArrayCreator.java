package org.example;

import java.lang.reflect.Array;

// Class containing the createArray method
public class ArrayCreator {

    // Method for creating an array of a generic type
    public static <T> T[] createArray(Class<T> tClass, int arraySize) {
        // This will cause an unchecked casting warning
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(tClass, arraySize);
        return array;
    }

    // Example of using the createArray method
    public static void main(String[] args) {
        Integer[] intArray = createArray(Integer.class, 10);
        String[] stringArray = createArray(String.class, 5);
        Double[] doubleArray = createArray(Double.class, 8);
        Byte[] byteArray = createArray(Byte.class, 10);
        Short[] shortArray = createArray(Short.class, 10);
        Long[] longArray = createArray(Long.class, 10);
        Float[] floatArray = createArray(Float.class, 10);
        Character[] charArray = createArray(Character.class, 10);
        Boolean[] booleanArray = createArray(Boolean.class, 10);

        // Example of initializing elements
        intArray[0] = 100;
        stringArray[1] = "Hello";
        doubleArray[2] = 99.99;
        byteArray[3] = 1;
        shortArray[4] = 2;
        longArray[5] = 3L;
        floatArray[6] = 4.0f;
        charArray[7] = 'A';
        booleanArray[8] = true;

        // For demonstration, we print out the value of the first elements of the arrays
        System.out.println("Integer Array first element: " + intArray[0]);
        System.out.println("String Array first element: " + stringArray[1]);
        System.out.println("Double Array first element: " + doubleArray[2]);
        System.out.println("Byte Array first element: " + byteArray[3]);
        System.out.println("Short Array first element: " + shortArray[4]);
        System.out.println("Long Array first element: " + longArray[5]);
        System.out.println("Float Array first element: " + floatArray[6]);
        System.out.println("Character Array first element: " + charArray[7]);
        System.out.println("Boolean Array first element: " + booleanArray[8]);
    }

}
