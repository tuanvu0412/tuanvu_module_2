package ss8_cleancode.bai_tap;

public class TennisGame {

    public static String displayScore(int score) {
        String bigScore = "";
        {
            switch (score) {
                case 0:
                    bigScore = "Love";
                    break;
                case 1:
                    bigScore = "Fifteen";
                    break;
                case 2:
                    bigScore = "Thirty";
                    break;
                case 3:
                    bigScore = "Forty";
                    break;
                default:
                    return "deceu";
            }
            return bigScore;
        }
    }

    public static String getScore(int score1, int score2) {
        String score = "";
        if (score1 == score2) {
            score = displayScore(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        }else {
            score=displayScore(score1)+"-"+displayScore(score2);
        }
        return score;
    }
}




