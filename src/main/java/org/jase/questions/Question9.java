package org.jase.questions;
// Tests a new integer array for truth summing over 100
public class Question9 {
    public static void main(String[] args) {
        System.out.println(isSumGreaterThan100(new int[]{53, 44}));
    }
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0; // Initializes the for loop
        for (int num : numbers) {
            sum += num; // Adds each number to each other to get sum
        }
        return sum > 100; // Gets the truth to be called upon in main
    }
}
