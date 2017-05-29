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
public class Consumable extends Item {

    private int addHealth;
    private int addHunger;
    private int addThirst;
    private int addEnergy;

    public Consumable() {
        super(0, null, 0, null);
    }
    
    

    public Consumable(int addHealth, int addHunger, int addThirst, int addEnergy, int id, String name, int value, String description) {
        super(id, name, value, description);
        this.addHealth = addHealth;
        this.addHunger = addHunger;
        this.addThirst = addThirst;
        this.addEnergy = addEnergy;
    }
    

    public int getAddHealth() {
        return addHealth;
    }

    public int getAddHunger() {
        return addHunger;
    }

    public int getAddThirst() {
        return addThirst;
    }

    public void setAddHealth(int addHealth) {
        this.addHealth = addHealth;
    }

    public void setAddHunger(int addHunger) {
        this.addHunger = addHunger;
    }

    public void setAddThirst(int addThirst) {
        this.addThirst = addThirst;
    }

    public void setAddEnergy(int addEnergy) {
        this.addEnergy = addEnergy;
    }
    
    
    
//    public void printStat() {
//        System.out.println(getName());
//        System.out.println();
//    }

    public int getAddEnergy() {
        return addEnergy;
    }
    
    
    
}
