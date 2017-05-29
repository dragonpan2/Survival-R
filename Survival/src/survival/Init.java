/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

/**
 *
 * @author Bowen
 */
public class Init {
    
    public static Item[] gameInit(){
        
        // Consumable MRE = new Consumable(0, 50, 1, "MRE", 0, "Meal Ready To Eat");
        //ID 1-100 should be consumable
        //ID 101-200 should be materiale
        Material NULL = new Material(0, "null", 0, "null");
        Consumable MRE = new Consumable(0, 75, 75, 0, 1, "MRE", 0, "A fuel meal ready to eat");
        Consumable FIELD_MRE = new Consumable(0, 50, 50, 0, 2, "Field made MRE",0,"Some one made that, its not a real MRE, but it wil do the job");
        Consumable MILITARY_MRE = new Consumable(0, 100, 100, 20, 3, "Military MRE", 0, "A military grade meal ready to eat, top quality");
        Consumable ENERGY_DRINK = new Consumable(0, 0, 25 ,25 ,4, "Energy Drink",0,"A bottle of commercial energy drink");
        Consumable BOTTLED_COFFEE = new Consumable(0,0,-10,25,5,"Bottled Coffe",0,"A bottle of premade coffee");
        Consumable PACKAGE_BROWNIE = new Consumable(0,25,0,5,6,"Package Brownie",0,"Sweet");
        Consumable CANNED_SODA = new Consumable(0,0,15,5,7,"Canned Soda",0,"Some branded soda in a 375ml can");
        Consumable BOTTLED_SODA = new Consumable(0,0,30,5,8,"Bottled Soda",0,"Some branded soda in a 710ml plastic bottle");
        Consumable CANNED_SOUP = new Consumable();
        Consumable CANNED_STEW = new Consumable();
        Consumable HANDMADE_BANDAGE = new Consumable(20,0,0,0,300,"Handmade Bandage",0,"Some medical Bandage, clearly handmade");
        
        //health hunger thrist energy id name value disc
        
        Item[] gameItem = new Item[1000];
        gameItem[1] = MRE;
        gameItem[2] = FIELD_MRE;
        gameItem[3] = MILITARY_MRE;
        gameItem[4] = ENERGY_DRINK;
        gameItem[5] = BOTTLED_COFFEE;
        gameItem[6] = PACKAGE_BROWNIE;
        
        gameItem[300] = HANDMADE_BANDAGE;
        
        return gameItem;
}
    
}
