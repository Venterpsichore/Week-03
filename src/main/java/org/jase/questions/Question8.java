package org.jase.questions;

public class Question8 {
    public static void main(String[] args) {
       System.out.println(getFullName("Sam", "Montenegro")); // Prints the designated first and last names w/ a space
    }

    public static String getFullName(String firstName, String lastName) { // Creates String getFullName & sets structure
        return firstName + " " + lastName; // Is necessary to provide a value to be called upon by the main method
    }
}
