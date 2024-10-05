package org.jase.questions;

public class Question1 {
    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int result = ages[0] - ages[ages.length - 1];
        System.out.println("Result: " + result);

        int[] ages2 = new int[9];
        System.arraycopy(ages, 0, ages2, 0, ages.length);
        result = ages2[0] - ages2[ages2.length - 1];
        System.out.println("Result: " + result);

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Average: " + average);
    }
}
