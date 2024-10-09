package org.jase.questions;

public class Question7 {
    public static String repeatWord(String word, int n) {
        Stringbuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
}