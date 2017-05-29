/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

/**
 *
 * @author panbe
 */
public class Tool extends Item {
    
    private boolean isQuest;
    private int durability;
    private float efficacity;
    
    public Tool() {
        super(0, null, 0, null);
    }
    
    public Tool(int id, String name, int value, String description, int durability, float efficacity){
        super(id, name, value, description);
        this.durability=durability;
        this.efficacity=efficacity;
    }
}

