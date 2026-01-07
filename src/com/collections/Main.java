/**
 *  Java program to demonstrate an ArrayList.
 */

package com.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an ArrayList with default capacity 10.
        List<String> myList = new ArrayList<>();

        // Printing size of ArrayList to console.
        System.out.println(myList.size()); // Output: 0

        // Adding element to position 11.
        myList.add(11, "Day"); // Output: IndexOutOfBoundsException

        // Adding element to position 3.
        myList.add(0, "Day");

        // Printing myList to console.
        System.out.println(myList); // Output: [Day]

        // Adding more elements to myList.
        myList.add("Night");
        myList.add("Morning");
        myList.add("Evening");

        // Printing myList to console.
        System.out.println(myList); // Output: [Day, Night, Morning, Evening]

        // Inserting an element to index 2
        myList.add(2, "Midnight");

        // Printing myList to console.
        System.out.println(myList); // Output: [Day, Night, Midnight, Morning, Evening]

        // Inserting an element to index 4
        myList.add(4, "Midday");

        // Printing myList to console.
        System.out.println(myList); // Output: [Day, Night, Midnight, Morning, Midday, Evening]

    }
}