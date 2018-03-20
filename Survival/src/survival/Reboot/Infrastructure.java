/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival.Reboot;

import java.util.ArrayList;
import survival.Item;
import survival.Survival;

/**
 *
 * @author panbe
 */
public class Infrastructure {
    
    private String type;
    private int grade;
    private String name;
    private int counter;
    private  int maxCounter;
    private LootList lootList;
    private ArrayList<Item> inventory;

    public Infrastructure(String type, int grade, String name,LootList lootList) {
        this.type = type;
        this.grade = grade;
        this.name = name;
        this.lootList = lootList;
        this.inventory = new ArrayList<>();
    }
    
    public void normalProduce() {
        if (counter < maxCounter) {
            counter++;
        }
        else {
            counter = 0;
            forceProduce();
        }
    }
    
    public void forceProduce() {
        
        int[] lList =lootList.getLoot();
        
        for (int i = 0; i < lList[1]; i++) {
              inventory.add(Survival.gameItem[0]);
        }
      
        
    }

    public String getType() {
        return type;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
