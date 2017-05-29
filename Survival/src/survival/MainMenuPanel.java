/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author panbe
 */
public class MainMenuPanel extends JPanel {

    
    CButton cButton = new CButton("start.jpg");

    
    public MainMenuPanel(MainMenu mainMenu)  throws IOException {
        
      //  cButton.setSize(1000,1000);
        cButton.setVisible(true);
        cButton.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                System.out.println("Confirmed");
                Window window = new Window();
                mainMenu.dispose();
            }
        });
        
        // alternatively use
        
//        cButton.addMouseListener(new MouseListener(){
//            public void mouseClicked(MouseEvent e) {
//                
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
        
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1400, 1400);
        this.setPreferredSize(new Dimension(1200, 800));
        this.setBackground(Color.white);
        this.add(cButton);
    }
    
    
    
}
