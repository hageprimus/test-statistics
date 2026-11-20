package com.pluralsight;

import java.util.*;

public class TestStats {
    public static void main(String[] args) {
        int[] testScores = new int[]{67, 69, 79, 91, 52, 84, 80, 73, 89, 96};

        //Sort array
        Arrays.sort(testScores);

        //Confirm array is sorted, get sum for calculating average
        int sum = 0;
        for (int score : testScores) {
            sum += score;
            System.out.print(score + ", ");
        }

        //Print requested values
        int lowScore = testScores[0];
        int highScore = testScores[testScores.length - 1];
        int median = testScores[testScores.length / 2];
        double average = sum / testScores.length;
        System.out.printf("\nLowest score: %d\nHighest score: %d\nMedian: %d\nAverage: %f", lowScore, highScore, median, average);
    }
}
