package org.jase.questions;

public class Question12 {
    public static void main(String[] args) {
System.out.println(willBuyDrink(true, 5.32));
    }
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
            return isHotOutside && moneyInPocket > 10.50;
}
}
