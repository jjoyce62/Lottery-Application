package lotteryapp;
/**
 * 11-Oct-2016
 *
 * @authors X15318921, X15420892, X15016650, X15758929
 */

import javax.swing.UIManager;
import javax.swing.ImageIcon;  // Used for new icon
import javax.swing.plaf.ColorUIResource;  //Used for adding color to the JOptionPane Window
import java.awt.Font;  //Used to style the font in the JOptionPane Window


public class LotteryApp {
    
    private final static ImageIcon icon = new ImageIcon(LotteryApp.class.getResource("lotto.jpg"));

    public static void main(String[] args) {
       
        GUI myGUI = new GUI();
        myGUI.setVisible(true);
        myGUI.setLocationRelativeTo(null);  //centers gui
        
                          UIManager lottoGUI=new UIManager();
               lottoGUI.put("OptionPane.background",new ColorUIResource(102,141,173));
               lottoGUI.put("Panel.background",new ColorUIResource(102,141,173));
               UIManager.put("OptionPane.messageFont", new Font("System", Font.PLAIN, 14));
               UIManager.put("OptionPane.buttonFont", new Font("System", Font.PLAIN, 20));
              
               

//        CompareNumbers t = new CompareNumbers();
               
               
               
       /* JOptionPane.showMessageDialog(null, t.compare(), "Correct Guesses", JOptionPane.INFORMATION_MESSAGE,icon);
*/
    }
}
