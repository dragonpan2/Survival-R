/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.util.ArrayList;

/**
 *
 * @author panbe
 */
public class Player extends Mob {
    private int hunger;
    private int maxHunger;
    private int thrist;
    private int maxThrist;
    private int energy;
    private int MaxEnergy;
    private int posx;
    private int posy;
    private int hungerDecayRate;
    private int thristDecayRate;
    private int energyDecayRate;
    private int healthRegenRate;


    public Player(int id, String name, int health, int maxHealth, int hunger, int maxHunger, int thrist, int maxThrist, int energy, int MaxEnergy, ArrayList<Item> inventory) {
        super(id, name, health, maxHealth, inventory);
        this.hunger = hunger;
        this.maxHunger = maxHunger;
        this.thrist = thrist;
        this.maxThrist = maxThrist;
        this.energy = energy;
        this.MaxEnergy = MaxEnergy;
    }

    public Player(int hunger, int maxHunger, int thrist, int maxThrist, int energy, int MaxEnergy, int posx, int posy, int id, String name, int health, int maxHealth, ArrayList<Item> inventory) {
        super(id, name, health, maxHealth, inventory);
        this.hunger = hunger;
        this.maxHunger = maxHunger;
        this.thrist = thrist;
        this.maxThrist = maxThrist;
        this.energy = energy;
        this.MaxEnergy = MaxEnergy;
        this.posx = posx;
        this.posy = posy;
    }
    
    

    public int getHunger() {
        return hunger;
    }

    public int getMaxHunger() {
        return maxHunger;
    }

    public int getThrist() {
        return thrist;
    }

    public int getMaxThrist() {
        return maxThrist;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return MaxEnergy;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    

    public void setHunger(int hunger) {
        this.hunger = FMath.max(hunger, this.maxHunger);
    }

    public void setMaxHunger(int maxHunger) {
        this.maxHunger = maxHunger;
    }

    public void setThrist(int thrist) {
        this.thrist = FMath.max(thrist, this.maxThrist);
    }

    public void setMaxThrist(int maxThrist) {
        this.maxThrist = maxThrist;
    }

    public void setEnergy(int energy) {
        this.energy = FMath.max(energy, this.MaxEnergy);
    }

    public void setMaxEnergy(int MaxEnergy) {
        this.MaxEnergy = MaxEnergy;
    }

    

}
