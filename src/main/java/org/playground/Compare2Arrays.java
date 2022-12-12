package org.playground;

/**
 * Some useful array algorithms and operations
 * comparing arrays.
 */

public class Compare2Arrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {1, 2, 3, 4, 5, 6};
        boolean arraysEqual = true; // Flag variable
        int index = 0; // Loop control variable

        // First determine whether the arrays are the same size
        if (firstArray.length != secondArray.length)
            arraysEqual = false;

        // Next determine whether the elements contain the same data.
        while (arraysEqual && index < firstArray.length) {
            if (firstArray[index] != secondArray[index])
                arraysEqual = false;
            index++;
        }

        if (arraysEqual)
            System.out.println("The arrays are equal.");
        else
            System.out.println("The arrays are not equal.");
    }
}
