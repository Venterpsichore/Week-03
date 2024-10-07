package org.jase.questions;

public class Question2 {
    public static void main(String[] args) {

//Sets up a String array of 6 names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0; //sets up
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);


        String concatenatedNames = "";
        for (String name : names) {
            concatenatedNames += name + " ";
        }
        System.out.println("Concatenated names: " + concatenatedNames.trim());

    }
}