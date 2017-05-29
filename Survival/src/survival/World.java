/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.awt.Color;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author panbe
 */
public class World extends JPanel implements Runnable {

    long startTime;
    long endTime;
    long deltaT;
    
    String deltaTString;
    
    JLabel lblFrameRate = new JLabel();
    JLabel lblDebugIndicator = new JLabel();
    
    boolean debugSwitch = false;

    public World() {

        this.setLayout(null);

        this.add(lblFrameRate);
        lblFrameRate.setLocation(0, 0);
        lblFrameRate.setText("FRAME RATE DISPLAY ERROR");
        lblFrameRate.setVisible(false);
        lblFrameRate.setSize(50, 50);
        lblFrameRate.setFont(lblFrameRate.getFont().deriveFont(32.0f));
        
        this.add(lblDebugIndicator);
        lblDebugIndicator.setLocation(0, 32);
        lblDebugIndicator.setText("DEBUG MODE ON");
        lblDebugIndicator.setVisible(false);
        lblDebugIndicator.setSize(1000, 50);
        lblDebugIndicator.setFont(lblDebugIndicator.getFont().deriveFont(32.0f));

        this.setVisible(true);
        this.setSize(1400, 1400);
        this.setPreferredSize(new Dimension(1200, 800));
        this.setBackground(Color.white);

        new Thread(this).start();
    }

    @Override
    public void run() {

        while (true) {
            try {
                startTime = System.nanoTime();

                //
                endTime = System.nanoTime();
                deltaT = (endTime - startTime) / 1000000;
                if ((int) deltaT < 60) {
                    Thread.sleep(60 - (int) deltaT);
                }
                endTime = System.nanoTime();
                deltaT = (endTime - startTime) / 1000000;
                deltaTString = (Integer.toString((int) deltaT));
                lblFrameRate.setText(deltaTString);

                invalidate();
                repaint();

            } catch (InterruptedException ex) {
                Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void debugSwitcher() {
        if (debugSwitch) {
            lblFrameRate.setVisible(false);
            lblDebugIndicator.setVisible(false);
            debugSwitch = false;
        } else {
            lblFrameRate.setVisible(true);
            lblDebugIndicator.setVisible(true);
            debugSwitch = true;
        }
    }

}
