package lotteryapp;
/**
 * 11-Oct-2016
 *
 * @authors X15318921, X15420892, X15016650, X15758929
 */
public class CompareNumbers {

    GenNumbers gen = new GenNumbers();
    InputNumbers in = new InputNumbers();
    int[][] userPicks = in.pickNums();
    int lottoSize = in.getLottoLines();
    int userSize = in.getUserLines();
    int[][] lottoPicks = gen.getArray(lottoSize);
    String correctAns = "";

//Selects the user's line to be compared to the lottery draws
    public String compare() {
        if (lottoSize == 3) {
            correctAns = correctAns + "\nLotto Draw:\n";
            for(int j = 0; j < 5; j++){
            correctAns = correctAns + Integer.toString(lottoPicks[0][j]) + " ";
            }
            correctAns = correctAns +  "\nLotto Plus Draw:\n";
            for(int j = 0; j < 5; j++){
            correctAns = correctAns + Integer.toString(lottoPicks[1][j]) + " ";
            }
            correctAns = correctAns + "\nLotto Plus One Draw:\n";
            for(int j = 0; j < 5; j++){
            correctAns = correctAns + Integer.toString(lottoPicks[2][j]) + " ";
            }
            correctAns = correctAns + "\n\n";
        } else if (lottoSize == 2) {
            correctAns = correctAns + "\nLotto Draw:\n";
            for(int j = 0; j < 5; j++){
            correctAns = correctAns + Integer.toString(lottoPicks[0][j]) + " ";
            }
            correctAns = correctAns +  "\nLotto Plus Draw:\n";
            for(int j = 0; j < 5; j++){
            correctAns = correctAns + Integer.toString(lottoPicks[1][j]) + " ";
            }
            correctAns = correctAns + "\n\n";
        } else if (lottoSize == 1) {
            correctAns = correctAns + "\nLotto Draw:\n";
            for(int j = 0; j < 5; j++){
            correctAns = correctAns + Integer.toString(lottoPicks[0][j]) + " ";
            }
            correctAns = correctAns + "\n\n";
        }
        for (int i = 0; i < userSize; i++) {
            correctAns = correctAns + "Line " + (i + 1) + ":\n";
            comp(i);

        }
        return correctAns;
    }

//Compares against all lottery draws
    public void comp(int i) {

        for (int k = 0; k < lottoSize; k++) {
            if (k == 0) {
                correctAns = correctAns + "Lotto: ";
            } else if (k == 1) {
                correctAns = correctAns + "\nLotto Plus: ";
            } else if (k == 2) {
                correctAns = correctAns + "\nLotto Plus One: ";
            }
            for (int j = 0; j < 5; j++) {
                if (userPicks[i][j] == lottoPicks[k][0] || userPicks[i][j] == lottoPicks[k][1] || userPicks[i][j] == lottoPicks[k][2] || userPicks[i][j] == lottoPicks[k][3] || userPicks[i][j] == lottoPicks[k][4]) {
                    correctAns = correctAns + " " + Integer.toString(userPicks[i][j]);
                }
            }
        }
        correctAns = correctAns + "\n";

    }
}
