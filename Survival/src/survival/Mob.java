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
public class Mob extends Entity {
    private int health;
    private int maxHealth;
    private int gold;
    private ArrayList<Item> inventory;
    private int temp_attack;
    private int temp_defense;
    private int defense;
    private int attack;
    
    private int strength;
    private int perception;
    private int endurance;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;
    
    private ArrayList<State> state;

    public Mob(int id, String name, int health, int maxHealth, ArrayList<Item> inventory) {
        super(id, name);
        this.health=health;
        this.maxHealth=maxHealth;
        this.inventory = inventory; 
        this.temp_attack = attack;
        this.temp_defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    
    public int getGold() {
        return gold;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
    
    public void setHealth(int health) {
        this.health = FMath.max(health, this.maxHealth);
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    
    public void setGold(int gold) {
        this.gold = gold;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setInventory(ArrayList<Item> Inventory) {
        this.inventory = Inventory;
    }

    public int getTemp_attack() {
        return temp_attack;
    }

    public void setTemp_attack(int temp_attack) {
        this.temp_attack = temp_attack;
    }

    public int getTemp_defense() {
        return temp_defense;
    }

    public void setTemp_defense(int temp_defense) {
        this.temp_defense = temp_defense;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public ArrayList<State> getState() {
        return state;
    }

    public void setState(ArrayList<State> state) {
        this.state = state;
    }
    
    
    
    
    
    
    
    
    
    
}
