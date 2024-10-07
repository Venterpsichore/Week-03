package org.jase.questions;

import java.util.Random;
public class Question13 {

    public static void main(String[] args) { // prints 3 examples of random enemy HP increments starting from base HP of 55

        System.out.println(calculateEnemyHP(55));
        System.out.println(calculateEnemyHP(55));
        System.out.println(calculateEnemyHP(55));
    }

    private static int calculateEnemyHP(int baseHP) { //establishes a base HP as a starting point to build subsequent enemies’ HP upon

        Random rand = new Random(); //creates a random number for addition
        int randomIncrement = rand.nextInt(32) + 1; // generates an integer between 1 and 33 to add to the baseHP
        return baseHP +randomIncrement; // outputs base HP added to the calculated random increment
    }
}
