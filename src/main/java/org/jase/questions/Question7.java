package org.jase.questions;

public class Question7 {
    public static void main(String[] args) {
        String result = repeatWord("Hello", 3); // Creates String result as output for the print line
        System.out.println(result);
    }
    // Sets up .repeat expression for n times
    public static String repeatWord(String word, int n) {
        return word.repeat(n);
    }
}
