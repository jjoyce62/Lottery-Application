package lotteryapp;

import javax.swing.*;
/**
 * 11-Oct-2016
 *
 * @authors X15318921, X15420892, X15016650, X15758929
 */
public class InputNumbers extends GenNumbers {
    
    private final static ImageIcon icon = new ImageIcon(LotteryApp.class.getResource("lotto.jpg"));


    //The number of rows for the respective arrays to have
    private int lottoLines;
    private int userLines;

    //Main input method for user to choose numbers as well as the amount of lotto draws
    public int[][] pickNums() {
        userLines = Integer.parseInt(JOptionPane.showInputDialog(null,"How many lines do you wish to input? (1-3)", "Lotery App",JOptionPane.QUESTION_MESSAGE));
        int[][] picks = new int[userLines][5];
        for (int z = 0; z < userLines; z++) {
            String input = JOptionPane.showInputDialog(null,"Enter 5 numbers followed by 'lotto', 'lottoplus' or 'lottoplusone' to select your draw", "Lotery App",JOptionPane.QUESTION_MESSAGE).toLowerCase();
            //Depending what the user's input contains the ammount of lottoPick rows to be generated will be chosen
            if (input.contains("lottoplusone")) {
                lottoLines = 3;
            } else if (input.contains("lottoplus")) {
                lottoLines = 2;
            } else if (input.contains("lotto")) {
                lottoLines = 1;
            }
            //Parses the numbers from the user's input and adds it to the array
            String[] tmp = input.split("[^\\d]+");
            for (int i = 0; i < tmp.length; i++) {
                picks[z][i] = Integer.parseInt(tmp[i]);
            }
        }
        return picks;

    }

    public int getLottoLines() {
        return lottoLines;
    }

    public int getUserLines() {
        return userLines;
    }

}
