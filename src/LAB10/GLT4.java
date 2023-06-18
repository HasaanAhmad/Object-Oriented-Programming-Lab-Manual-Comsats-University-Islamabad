/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating point value. The highest and lowest scores are thrown out and the remaining scores are added together. 
The sum is then multiplied by the degree of difficulty for that dive. The degree of difficulty ranges from 
1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the diver’s score.
Write a computer program that inputs a degree of difficulty and seven judges’ scores and outputs the 
overall score for that dive. The program should use an ArrayList of type Double to store the scores.*/

import java.util.ArrayList;
import java.util.Scanner;

/**
 * GLT4
 */

public class GLT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();

        System.out.println("Enter the degree of difficulty: ");
        double degreeOfDifficulty = input.nextDouble();

        System.out.println("Enter the seven judges' scores: ");
        for (int i = 0; i < 7; i++) {
            scores.add(input.nextDouble());
        }

        double totalScore = calculateScore(scores, degreeOfDifficulty);
        System.out.println("The total score is: " + totalScore);

    }

    public static double calculateScore(ArrayList<Double> scores, double degreeOfDifficulty) {
        double totalScore = 0;
        double highestScore = 0;
        double lowestScore = 10;

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > highestScore) {
                highestScore = scores.get(i);
            }
            if (scores.get(i) < lowestScore) {
                lowestScore = scores.get(i);
            }
            totalScore += scores.get(i);
        }

        totalScore = totalScore - highestScore - lowestScore;
        totalScore = totalScore * degreeOfDifficulty;
        totalScore = totalScore * 0.6;

        return totalScore;
    }

}