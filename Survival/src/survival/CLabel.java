/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author panbe
 */
public class CLabel extends JComponent {

    Image image;

    public CLabel(String path) {
        super();
        this.setSize(1000, 1000);
        try {
            //finish here
            image = ImageIO.read(new File(path));
          
        } catch (Exception e) {
            System.out.println(" IO Error");
        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        //  g.fillRect(0, 0, 500, 500);

    }

}
