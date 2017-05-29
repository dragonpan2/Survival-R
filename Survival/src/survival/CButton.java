/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author panbe
 */
public class CButton extends JComponent implements MouseListener {

 //  BufferedImage image;
   Image image;
   
    public CButton(String name) throws IOException {

        super();
        enableInputMethods(true);
        addMouseListener(this);
        this.setSize(1000, 1000);
        try {
            //finish here
            image = ImageIO.read(new File("start.jpg"));
            //image = Toolkit.getDefaultToolkit().createImage(name);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
      //  g.fillOval(0, 0, 500, 500);
      //  g.fillRect(0, 0, 500, 500);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(getWidth(), getHeight());
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    @Override
    public Dimension getMaximumSize() {
        return getPreferredSize();
    }

}
