package org.jase.questions;
/* Tests for truth of the average of a newly-made double array being less than the newly-made double array before it.
"Is " differentiates the average comparison output from the other boolean of whether or not an array is empty. */
public class Question11 {
    public static void main(String[] args) {
        System.out.println("Is " + compareArrayAverages(new double[] {3.4, 4.5, 5.6, 6.7, 7.9}, new double[] {1.9, 8.7}));
    }

    public static boolean compareArrayAverages(double[] arr1, double[] arr2) { //
        if (arr1.length == 0 || arr2.length == 0) {
            return false; // return false if either array is empty
        }
        // Initializes both arrays at the same time and sums arr1 elements
        double sum1 = 0, sum2 = 0;
        for (double num : arr1) {
            sum1 += num;
        }
        // Sums arr2 elements
        for (double num : arr2) {
            sum2 += num;
        }
        // Calculates the averages of both array and returns the truthness of first average being more than the second
        double avg1 = sum1 / arr1.length;
        double avg2 = sum2 / arr2.length;
        return avg1 > avg2; // arr1 has an average (5.62) lower than arr2 (6.25),
    }
}