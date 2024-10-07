package org.jase.questions;

public class Question1 {
    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int result =  ages[ages.length - 1] - ages[0];
        System.out.println("Result: " + result);

        int[] ages2 = {66, 33, 22, 4, 55, 9, 1, 4, 44};
        result = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result: " + result);

        System.out.println("3rd age in ages is " + ages[2] + " and 3rd age in ages2 is " + ages2[2]);

        int sum = 0;
        for (int age : ages2) {
            sum += age;
        }
        double average = (double) sum / ages2.length;
        System.out.println("Average: " + average);
    }
}
