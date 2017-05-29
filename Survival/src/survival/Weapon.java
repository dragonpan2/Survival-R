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
public class Weapon extends Item {
    
    private int cost;
    //private int weight;
    //private int size;
    private float damage;
    private float defense;
    private float range_damage;
    private float range_defense;
    private float range_use;
    
    
    public Weapon() {
        super(0, null, 0, null);
    }
    public Weapon(int id, String name, int value, String description, int cost, float damage, float defense){
        super(id,name,value,description);
        this.cost=cost;
        this.damage=damage;
        this.defense=defense;
    }
    
    public Weapon(int id, String name, int value, String description, int cost, float range_damage, float range_defense, float range_use){
        super(id,name,value,description);
        this.cost=cost;
        this.range_damage=range_damage;
        this.range_defense=range_defense;
        this.range_use=range_use;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getDefense() {
        return defense;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public float getRange_damage() {
        return range_damage;
    }

    public void setRange_damage(float range_damage) {
        this.range_damage = range_damage;
    }

    public float getRange_defense() {
        return range_defense;
    }

    public void setRange_defense(float range_defense) {
        this.range_defense = range_defense;
    }

    public float getRange_use() {
        return range_use;
    }

    public void setRange_use(float range_use) {
        this.range_use = range_use;
    }
}
