/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import javax.swing.JPanel;

/**
 *
 * @author panbe
 */
public class GraphicalInventory extends JPanel {
    //instance this in World
    CLabel inventoryFrame = new CLabel("start.jpg");
    
    public GraphicalInventory(Player player) {
        this.setLayout(null);
        
        player.getInventory().size();
        this.add(inventoryFrame);
        
        this.setVisible(true);
    }
    
    public void updateInventory() {
        
    }
    
    
    
}
