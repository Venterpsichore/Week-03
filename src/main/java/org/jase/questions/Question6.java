package org.jase.questions;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;

        String concatenatedNames = "";
        for (String name : names) {
            concatenatedNames += name + " ";
        }

        int[] nameLengths = new int[names.length];
// Writes a loop to iterate over the names Array and add the length of each name to nameLengths into it
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Calculates the sum of all elements in the nameLengths Array without a second declaration of nameLengths
        int sum = 0;
        for (int length : nameLengths) {
            sum += length;
        }// Prints the array sum
        System.out.println("The sum of all name lengths is: " + sum);
    }
}
