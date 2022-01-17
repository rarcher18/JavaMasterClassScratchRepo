package com.ryanarcher;

public class Main {
    public static void main(String[] args) {
        // a mile equal to 1.609344 km
        double km = (100 * 1.609344);

        int score = 950;
        int levelCompleted = 8;
        int bonus = 200;
        if(score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score <= 1000) {
            System.out.println("Your score is less then a 1000");
        }
    }
}
