package org.jase.questions;
// Fills array with decimals to average
public class Question10 {
    public static void main(String[] args) {
        double[] secondArray = {2.3, 3.4, 4.5, 5.6, 6.7, 7.9, 8.9, 9.1};
System.out.println(calculateAverage(secondArray)); /* Prints the quotient 6.05
    (a bit inaccurate from the 6.04 rounding due to the cutting off of binary)*/
    }
    public static double calculateAverage(double[] array ) { // Creates String result as output for the print line
        if (array.length == 0) { // Negates any array with no input
            return 0;
        }
        // Sums array elements through for each
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length; // Prepares the average for the main print
    }
}
