package lotteryapp;
/**
 * 11-Oct-2016
 *
 * @authors X15318921, X15420892, X15016650, X15758929
 */
import java.util.Arrays;
import java.util.Random;

public class GenNumbers {

    //
    private int i = 0;
    private int num;
    Random rand = new Random();

    //Generates an array 5 columns wide and as many rows (lines) as the user decides
    public int[][] getArray(int lines) {
        int[][] lottoDraws = new int[lines][5];
        for (int y = 0; y < lines; y++) {
            for (int i = 0; i < 5; i++) {
                //Generates a random number between 1 and 40, checks if it has already been picked and if not adds it to the array
                num = rand.nextInt(40) + 1;
                while (num == lottoDraws[y][0] || num == lottoDraws[y][1] || num == lottoDraws[y][2] || num == lottoDraws[y][3] || num == lottoDraws[y][4]) {
                    num = rand.nextInt(40) + 1;
                }
                lottoDraws[y][i] = num;
           
            }
            Arrays.sort(lottoDraws[y]); //sort method to put lowest number first to highest
        }
        return lottoDraws;
    }

}
