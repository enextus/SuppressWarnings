package org.arraycreator;

import java.lang.reflect.Array;
import javax.swing.*;
import javax.swing.border.Border;

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

        SwingUtilities.invokeLater(() -> createAndShowGUI(
                intArray,
                stringArray,
                doubleArray,
                byteArray,
                shortArray,
                longArray,
                floatArray,
                charArray,
                booleanArray
        ));
    }

    private static void createAndShowGUI(
            Integer[] intArray,
            String[] stringArray,
            Double[] doubleArray,
            Byte[] byteArray,
            Short[] shortArray,
            Long[] longArray,
            Float[] floatArray,
            Character[] charArray,
            Boolean[] booleanArray) {

        // Create and set up the window
        JFrame frame = new JFrame("Array Creator Results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Create a border that puts 15 pixels of padding on all sides
        Border padding = BorderFactory.createEmptyBorder(15, 15, 15, 15);

        // Add labels to the frame for each array's first element, with padding
        frame.add(createPaddedLabel("Integer Array first element: " + (intArray.length > 0 ? intArray[0] : "N/A"), padding));
        frame.add(createPaddedLabel("String Array second element: " + (stringArray.length > 1 ? stringArray[1] : "N/A"), padding));
        frame.add(createPaddedLabel("Double Array third element: " + (doubleArray.length > 2 ? doubleArray[2] : "N/A"), padding));
        frame.add(createPaddedLabel("Byte Array fourth element: " + (byteArray.length > 3 ? byteArray[3] : "N/A"), padding));
        frame.add(createPaddedLabel("Short Array fifth element: " + (shortArray.length > 4 ? shortArray[4] : "N/A"), padding));
        frame.add(createPaddedLabel("Long Array sixth element: " + (longArray.length > 5 ? longArray[5] : "N/A"), padding));
        frame.add(createPaddedLabel("Float Array seventh element: " + (floatArray.length > 6 ? floatArray[6] : "N/A"), padding));
        frame.add(createPaddedLabel("Character Array eighth element: " + (charArray.length > 7 ? charArray[7] : "N/A"), padding));
        frame.add(createPaddedLabel("Boolean Array ninth element: " + (booleanArray.length > 8 ? booleanArray[8] : "N/A"), padding));

        // Display the window
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JLabel createPaddedLabel(String text, Border padding) {
        JLabel label = new JLabel(text);
        label.setBorder(padding);
        return label;
    }

}
