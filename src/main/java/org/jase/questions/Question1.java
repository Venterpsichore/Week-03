package org.jase.questions; // States package needed to prevent name collisions/conflicts and to control access
// Makes class per question and is public so that it can be called from anywhere in the file
public class Question1 {
    public static void main(String[] args) { // Sets entry point common to all Java writing
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Sets array of varying ages
        int result =  ages[ages.length - 1] - ages[0]; // Finds difference of the first element value from the last's
        System.out.println("Result: " + result);// Prints the difference
// Repeats the intention with 9 values
        int[] ages2 = {66, 33, 22, 4, 55, 9, 1, 4, 44};
        result = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result: " + result);
// Prints both arrays of different lengths at the same element, showing dynamism
        System.out.println("3rd age in ages is " + ages[2] + ", and 3rd age in ages2 is " + ages2[2]);
// Iterates the second array using the newly declared age
        int sum = 0;
        for (int age : ages2) {
            sum += age; // Sums all of the elements of ages2 with a compound operator
        }
        double average = (double) sum / ages2.length; // Averages the sum from before using .length property
        System.out.println("Average: " + average);
    }
}
