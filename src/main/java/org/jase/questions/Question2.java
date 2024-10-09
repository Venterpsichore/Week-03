package org.jase.questions;

public class Question2 {
    public static void main(String[] args) {

//Sets up a String array of 6 names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
         // Sets up the for each in the for loop
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length(); // Totals all of the letter numbers of the name
        }
        /* Divides the int totalLetters by the number of elements in names (the length) with double in parentheses
         before totalLetters making the quotient double instead of the default integer operation */
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

// Makes String initially empty surrounded by quotation marks to be filled by for each
        String concatenatedNames = "";
        for (String name : names) { // String name is used solely with for each iteration
            concatenatedNames += name + " ";
        } // Prints the new String more cleanly by using .trim() to cut off any blank space before or after
        System.out.println("The names concatenated would be: " + concatenatedNames.trim());

    }
}