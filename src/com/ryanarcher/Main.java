package com.ryanarcher;

public class Main {
    public static void main(String[] args) {
        // a mile equal to 1.609344 km
        double km = (100 * 1.609344);


        boolean gameOver = true;
        int score = 950;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
            if(gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            }

            return -1;
        }

//        if(score == 5000) {
//            System.out.println("Your score was 5000");
//        } else if (score <= 1000) {
//            System.out.println("Your score is less then a 1000");
//        }


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ryan", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Sammy", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bingus", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        public static void displayHighScorePosition(String playerName, int playerHighScorePosition) {
            System.out.println(playerName + "managed to get into position" + playerHighScorePosition + " on the high score table.");
        }

        public static void calculateHighScorePosition(int playerScore) {
            if(playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore <1000) {
                return 2;
            } else if (playerScore >= 100 && playerScore <500){
                return 3;
            } else {
                return 4;
            }
        }
    }


}