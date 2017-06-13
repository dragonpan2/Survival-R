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
public abstract class Item {
    
    private int id;
    private String name;
    private int value;
    private String description;
    private boolean craftable;
    private ArrayList<Item> resources;

    

    public Item(int id, String name, int value, String description) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isCraftable() {
        return craftable;
    }

    public void setIsCraftable(boolean craftable) {
        this.craftable = craftable;
    }

    public ArrayList<Item> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Item> resources) {
        this.resources = resources;
    }
}
