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
        final int desiredUPS = 60;
        final double desiredSleepms = 1000D/desiredUPS;
        
        long startTime;
        long endTime;
        long sleepTime;
        
        while (true) {
            startTime = System.nanoTime();

            invalidate();
            repaint();

            endTime = System.nanoTime();


            sleepTime = (long)(desiredSleepms*1000000) - (endTime-startTime);
            long totalDelay = 0;
            if (sleepTime < 0) {
                totalDelay = (endTime-startTime);
                System.out.println("Scene Thread Overload");
            } else {
                long sleepms = Math.floorDiv(sleepTime, 1000000);
                int sleepns = (int)Math.floorMod(sleepTime, 1000000);
                totalDelay = (long)(endTime-startTime+sleepTime);
                try {
                    Thread.sleep(sleepms, sleepns);
                } catch (InterruptedException ex) {
                    System.out.println("Thread Error");
                }
            }

            int realUPS = (int)(1000000000D/totalDelay);
            deltaTString = (Integer.toString(realUPS));
            lblFrameRate.setText(deltaTString);

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
