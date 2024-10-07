package org.jase.questions;

import java.util.ArrayList;

public class Question4 {
        // main method
        public static void main(String[] args)
        {
            // creates an Empty String ArrayList
            ArrayList<String> froyoFlavors = new ArrayList<String>(5);
            // uses add() to initialize values
            froyoFlavors.add("Chocolate");
            froyoFlavors.add("Dark Chocolate");
            froyoFlavors.add("Lemon");
            froyoFlavors.add("Pistachio");
            // prints initial String ArrayList
            System.out.println("ArrayList: " + froyoFlavors);
            // finds first element
            String first = froyoFlavors.get(0);
            System.out.println("The first entered flavor is " + first + ".");
        }
}
