package org.jase.questions;

import java.util.*; // now needed for the Arrays.toString method

public class Question5 {
    public static void main(String[] args) {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);


        String concatenatedNames = "";
        for (String name : names) {
            concatenatedNames += name + " ";
        }
        System.out.println("The names concatenated would be: " + concatenatedNames.trim());


        int[] nameLengths = new int[names.length];
// Writes a loop to iterate over the names Array and add the length of each name to nameLengths into it
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        System.out.println(Arrays.toString(nameLengths));
    }
}