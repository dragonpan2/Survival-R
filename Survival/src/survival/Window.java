/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author panbe
 */
public class Window extends JFrame  {
    
    
    World world = new World();

    public Window() {
        
        keyEvent();

       
        
        this.add(world);
        new Thread(world).start();

        this.setBackground(Color.yellow);
        this.setSize(1400, 1400);
        pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        this.setVisible(true);
    }
    
    
    
    
    
    public void keyEvent() {
        this.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    //World.upEvent();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    //World.downEvent();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    //World.leftEvent();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    //World.rightEvent();
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    //World.spaceEvent(world);
                }
                if (e.getKeyCode() == KeyEvent.VK_K) {
                    System.out.println("Debug Switch");
                    world.debugSwitcher();
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
                

            }

        });
    }
    
    
}
