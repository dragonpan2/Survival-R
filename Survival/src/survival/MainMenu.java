/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author panbe
 */
public class MainMenu extends JFrame {
    
    MainMenuPanel MMP = new MainMenuPanel(this);

    public MainMenu()  throws IOException {
        
        
        this.add(MMP);
        this.setBackground(Color.yellow);
        this.setSize(1400, 1400);
        pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
}
